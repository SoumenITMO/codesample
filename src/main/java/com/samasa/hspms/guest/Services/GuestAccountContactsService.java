package com.samasa.hspms.guest.Services;

import javax.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.guest.Dao.GuestAccountContactsDao;
import com.samasa.hspms.guest.Entity.GuestAccountContacts;

@Service
@Transactional

public class GuestAccountContactsService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	GuestAccountContactsDao guestAccContactsDao;

//	@Transactional
//	public RespEntity<?> getGuestAccByUnitCode(LoginDetails loginDetails) throws Exception {
//
//		TypeMap<GuestAccountContacts, GuestAccountContactsDto> typeMapModule = modelMapper.getTypeMap(GuestAccountContacts.class, GuestAccountContactsDto.class);
//		if(typeMapModule==null) {
//			modelMapper.addMappings(new PropertyMap<GuestAccountContacts, GuestAccountContactsDto>() {
//				@Override
//				protected void configure() {
//					map().setUnitCode(source.getId().getUnitCode());
//					map().setGuestUid(source.getId().getGuestUid());
//					
//				}});}
//
//		return new RespEntity<>(AppConstants.RES_SUCCESS,modelMapper.map(guestAccContactsDao.findByIdUnitCode(loginDetails.getUnitCode()), new TypeToken<List<GuestAccountContactsDto>>() {}.getType()));
//	}

	@Async("threadPoolTaskExecutor")
	public void saveGuestAccContacts(String unitCode,int guestUid, LoginDetails loginDetails) throws Exception {
		
		/*GuestAccountContactsDto guestAccContactsDto = new GuestAccountContactsDto();
		
		TypeMap<GuestAccountContactsDto, GuestAccountContacts> typeMapModule = modelMapper.getTypeMap(GuestAccountContactsDto.class, GuestAccountContacts.class);
		if(typeMapModule==null) {
			modelMapper.addMappings(new PropertyMap<GuestAccountContactsDto, GuestAccountContacts>() {
				@Override
				protected void configure() {
					map().setAccContId(source.getAccContId());
				}
			});
		}
		guestAccContactsDto.setAccContId(1);
		guestAccContactsDto.setUnitCode(unitCode);
		guestAccContactsDto.setGuestUid(guestUid);
		
		GuestAccountContacts guestAccContacts = modelMapper.map(guestAccContactsDto, GuestAccountContacts.class);*/

		//return new RespEntity<>(AppConstants.RES_SUCCESS, "SUCCESS");
	}
	
//	@Transactional
//	public RespEntity<?> updateCortaAccCont(CortaAccountContactsDto CortaAccContsDtoObj, LoginDetails loginDetails) throws Exception {
//				
//		TypeMap<CortaAccountContactsDto, CortaAccountContacts> typeMapModule = modelMapper.getTypeMap(CortaAccountContactsDto.class, CortaAccountContacts.class);
//		if(typeMapModule==null) {
//			modelMapper.addMappings(new PropertyMap<CortaAccountContactsDto, CortaAccountContacts>() {
//				@Override
//				protected void configure() {
//					map().getId().setUnitCode(source.getUnitCode());
//					map().getId().setCortaUid(source.getCortaUid());
//				}
//			});
//		}
//				
//		CortaAccountContacts cortaAccContacts = modelMapper.map(CortaAccContsDtoObj, CortaAccountContacts.class);
//		
//		cortaAccountContactsDao.update(cortaAccContacts);
//		
//		return new RespEntity<>(AppConstants.RES_SUCCESS, "SUCCESS");
//	}
}
