package com.samasa.hspms.guest.Services;

import java.util.List;
import javax.transaction.Transactional;
import com.samasa.hspms.guest.Dao.GuestAccountContactsDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.samasa.hspms.AppConstants;
import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.common.dto.RespEntity;
import com.samasa.hspms.guest.Dao.GuestAccountDao;
import com.samasa.hspms.guest.Dao.GuestAccountDefaultsDao;
import com.samasa.hspms.guest.Dao.GuestAccountStatsDao;
import com.samasa.hspms.guest.Dao.GuestIdGenCorpDao;
import com.samasa.hspms.guest.Dao.UnitGuestAcTypeDao;
import com.samasa.hspms.guest.Dto.GuestAccountContactsDto;
import com.samasa.hspms.guest.Dto.GuestAccountDefaultsDto;
import com.samasa.hspms.guest.Dto.GuestAccountDto;
import com.samasa.hspms.guest.Dto.GuestAccountStatsDto;
import com.samasa.hspms.guest.Entity.GuestAccount;
import com.samasa.hspms.guest.Entity.GuestAccountContacts;
import com.samasa.hspms.guest.Entity.GuestAccountDefaults;
import com.samasa.hspms.guest.Entity.GuestAccountStats;
import com.samasa.hspms.guest.Entity.GuestIdGenCorp;
import com.samasa.hspms.guest.Entity.UnitGuestAcType;
import com.samasa.hspms.util.Utc;

@Service("guestAccountService")
@Transactional
public class GuestAccountService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	GuestAccountDao guestAccountDao;

	@Autowired
	UnitGuestAcTypeDao unitGuestAcTypeDao;

	@Autowired
	GuestIdGenCorpDao guestIdGenCorpDao;

	@Autowired
	GuestAccountStatsDao guestAccStatsDao;

	@Autowired
	GuestAccountContactsService guestAccContctService;

	@Autowired
	GuestAccountContactsDao guestAccContactsDao;

	@Autowired
	GuestAccountDefaultsDao guestAccDefaultsDao;


	public RespEntity<?> getGuestAccByUnitCode(LoginDetails loginDetails) {

		TypeMap<GuestAccount, GuestAccountDto> typeMapModule = modelMapper.getTypeMap(GuestAccount.class, GuestAccountDto.class);
		if(typeMapModule==null) {
			modelMapper.addMappings(new PropertyMap<GuestAccount, GuestAccountDto>() {
				@Override
				protected void configure() {
					map().setId(source.getId());
				}
			});
		}

		return new RespEntity<>(AppConstants.RES_SUCCESS,modelMapper.map(guestAccountDao.findByUnitCode(loginDetails.getUnitCode()), new TypeToken<List<GuestAccountDto>>() {}.getType()));
	}

	public int saveGuestAccount(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) throws Exception {
		GuestAccountDto guestAccountDtoObj = new GuestAccountDto();

		UnitGuestAcType unitGuestAcType = unitGuestAcTypeDao.findByIdUnitCodeAndIdGuestAcType(loginDetails.getUnitCode(), bookInputDataDto.getGuestAcType());
		GuestIdGenCorp guestIdGenCorp = guestIdGenCorpDao.findByIdCorpIdAndIdGuestAcProcessType(loginDetails.getCorpId(), unitGuestAcType.getGuestAcProcessType());

		TypeMap<GuestAccountDto, GuestAccount> typeMap = modelMapper.getTypeMap(GuestAccountDto.class, GuestAccount.class);
		if(typeMap==null) {
			modelMapper.addMappings(new PropertyMap<GuestAccountDto, GuestAccount>() {
				@Override
				protected void configure() {						
					map().setId(source.getId());
				}});}

		int guestNextSeqNum = unitGuestAcType.getGuestAcNextseqNo()+1;
		guestAccountDtoObj.setGuestUid(unitGuestAcType.getGuestAcNextseqNo());
		guestAccountDtoObj.setGuestAcType(bookInputDataDto.getGuestAcType());

		String guestAcPrefix;
		String guestAcSufix;
		if(unitGuestAcType.getGuestAcPrefix()==null) {
			guestAcPrefix = "";
		}
		else
		{
			guestAcPrefix = unitGuestAcType.getGuestAcPrefix();
		}

		if(unitGuestAcType.getGuestAcSuffix()==null) {
			guestAcSufix = "";
		}
		else
		{
			guestAcSufix = unitGuestAcType.getGuestAcSuffix();
		}

		guestAccountDtoObj.setProfileId(guestAcPrefix+unitGuestAcType.getGuestAcNextseqNo()+guestAcSufix);

		int nextSeqNum = guestIdGenCorp.getId().getGuestAcNextseqNo()+1;
		guestAccountDtoObj.setCorpGuestUid(guestIdGenCorp.getId().getGuestAcNextseqNo());
		guestAccountDtoObj.setUnitCode(loginDetails.getUnitCode());
		guestAccountDtoObj.setMgdUnitCode(loginDetails.getUnitCode());

		if(bookInputDataDto.getFirstName() != null) {
			guestAccountDtoObj.setFirstName(bookInputDataDto.getFirstName());
		}

		if(bookInputDataDto.getLastName() != null) {
			guestAccountDtoObj.setLastName(bookInputDataDto.getLastName());
		}

		guestAccountDtoObj.setCrUserUid(loginDetails.getUserId());
		guestAccountDtoObj.setCrDatetime(Utc.getUtcDateTime());

		GuestAccount guestAccount = modelMapper.map(guestAccountDtoObj, GuestAccount.class);

		guestAccountDao.save(guestAccount);

		unitGuestAcTypeDao.updateAcNextSeqNo(loginDetails.getUnitCode(), guestAccountDtoObj.getGuestAcType(), guestNextSeqNum);

		guestIdGenCorpDao.updateAcNextSeqNo(loginDetails.getCorpId(), unitGuestAcType.getGuestAcProcessType(), unitGuestAcType.getGuestAcMaxlenth()
				, unitGuestAcType.getGuestAcSeqStart(), unitGuestAcType.getGuestAcSeqEnd(), nextSeqNum);

		saveGuestAccContacts(unitGuestAcType.getGuestAcNextseqNo(),loginDetails);

		saveGuestAccStats(unitGuestAcType.getGuestAcNextseqNo(),loginDetails);

		saveGuestAccDefaults(unitGuestAcType.getGuestAcNextseqNo(),loginDetails);

		return unitGuestAcType.getGuestAcNextseqNo();
	}

	public RespEntity<?> saveGuestAccContacts(int guestUid, LoginDetails loginDetails) throws Exception {

		GuestAccountContactsDto guestAccContactsDto = new GuestAccountContactsDto();

		TypeMap<GuestAccountContactsDto, GuestAccountContacts> typeMapModule = modelMapper.getTypeMap(GuestAccountContactsDto.class, GuestAccountContacts.class);
		if(typeMapModule==null) {
			modelMapper.addMappings(new PropertyMap<GuestAccountContactsDto, GuestAccountContacts>() {
				@Override
				protected void configure() {
					map().setUnitCode(source.getUnitCode());
					map().setGuestUid(source.getGuestUid());
				}});}

		guestAccContactsDto.setUnitCode(loginDetails.getUnitCode());
		guestAccContactsDto.setGuestUid(guestUid);

		GuestAccountContacts guestAccContacts = modelMapper.map(guestAccContactsDto, GuestAccountContacts.class);
		guestAccContactsDao.save(guestAccContacts);

		return new RespEntity<>(AppConstants.RES_SUCCESS, "SUCCESS");
	}

	public RespEntity<?> saveGuestAccStats(int guestUid, LoginDetails loginDetails) throws Exception {

		GuestAccountStatsDto guestAccStatsDto = new GuestAccountStatsDto();

		TypeMap<GuestAccountStatsDto, GuestAccountStats> typeMapModule = modelMapper.getTypeMap(GuestAccountStatsDto.class, GuestAccountStats.class);
		if(typeMapModule==null) {
			modelMapper.addMappings(new PropertyMap<GuestAccountStatsDto, GuestAccountStats>() {
				@Override
				protected void configure() {
					map().setUnitCode(source.getUnitCode());
					map().setGuestUid(source.getGuestUid());
				}});}

		guestAccStatsDto.setUnitCode(loginDetails.getUnitCode());
		guestAccStatsDto.setGuestUid(guestUid);
		guestAccStatsDto.setCrDatetime(Utc.getUtcDateTime());
		guestAccStatsDto.setCrUserUid(loginDetails.getUserId());

		GuestAccountStats guestAccStats = modelMapper.map(guestAccStatsDto, GuestAccountStats.class);
		guestAccStatsDao.save(guestAccStats);

		return new RespEntity<>(AppConstants.RES_SUCCESS, "SUCCESS");
	}

	public RespEntity<?> saveGuestAccDefaults(int guestUid, LoginDetails loginDetails) throws Exception {

		GuestAccountDefaultsDto guestAccDefaultsDto = new GuestAccountDefaultsDto();

		TypeMap<GuestAccountDefaultsDto, GuestAccountDefaults> typeMapModule = modelMapper.getTypeMap(GuestAccountDefaultsDto.class, GuestAccountDefaults.class);
		if(typeMapModule==null) {
			modelMapper.addMappings(new PropertyMap<GuestAccountDefaultsDto, GuestAccountDefaults>() {
				@Override
				protected void configure() {
					map().setUnitCode(source.getUnitCode());
					map().setGuestUid(source.getGuestUid());
				}});}

		guestAccDefaultsDto.setUnitCode(loginDetails.getUnitCode());
		guestAccDefaultsDto.setGuestUid(guestUid);
		guestAccDefaultsDto.setCrDatetime(Utc.getUtcDateTime());
		guestAccDefaultsDto.setCrUserUid(loginDetails.getUserId());

		GuestAccountDefaults guestAccDefaults = modelMapper.map(guestAccDefaultsDto, GuestAccountDefaults.class);
		guestAccDefaultsDao.save(guestAccDefaults);

		return new RespEntity<>(AppConstants.RES_SUCCESS, "SUCCESS");
	}


}
