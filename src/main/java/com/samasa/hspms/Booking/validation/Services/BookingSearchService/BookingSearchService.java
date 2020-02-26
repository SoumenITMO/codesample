package com.samasa.hspms.Booking.validation.Services.BookingSearchService;

import com.samasa.hspms.Booking.validation.Dao.FrmMealPlanHeaderSearchDao;
import com.samasa.hspms.Booking.validation.Dao.FrmRateHeaderSearchDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstMealPlanRangeDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstMisStatsDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstSplServiceRangeDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrReservedGuestsDao;
import com.samasa.hspms.Booking.validation.Dto.GuestSearch.GuestSearchDto;
import com.samasa.hspms.Booking.validation.Dto.GuestSearch.GuestSearchResultDto;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgHdrDao;
import com.samasa.hspms.Booking.validation.Dto.SearchBookingInfo.BookingInfo;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgHdr;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstMisStats;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstSplServiceRange;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrListReservedGuest;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.guest.Dao.GuestAccountDao;
import com.samasa.hspms.guest.Entity.GuestAccount;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class BookingSearchService {

    private OcmTrBkgHdrDao ocmTrBkgHdrDao;
    private OcmTrReservedGuestsDao ocmTrReservedGuestsDao;
    private GuestAccountDao guestAccountDao;
    private OcmTrBkgVstMisStatsDao ocmTrBkgVstMisStatsDao;
    private FrmMealPlanHeaderSearchDao frmMealPlanHeaderSearchDao;
    private FrmRateHeaderSearchDao frmRateHeaderSearchDao;
    private OcmTrBkgVstMealPlanRangeDao ocmTrBkgVstMealPlanRangeDao;
    private OcmTrBkgVstSplServiceRangeDao ocmTrBkgVstSplServiceRangeDao;
    private List<GuestSearchResultDto> guestSearchResultDtos = new ArrayList<>();

    public BookingSearchService(OcmTrBkgHdrDao ocmTrBkgHdrDao,
                                GuestAccountDao guestAccountDao,
                                OcmTrReservedGuestsDao ocmTrReservedGuestsDao,
                                OcmTrBkgVstMisStatsDao ocmTrBkgVstMisStatsDao,
                                FrmMealPlanHeaderSearchDao frmMealPlanHeaderSearchDao,
                                FrmRateHeaderSearchDao frmRateHeaderSearchDao,
                                OcmTrBkgVstMealPlanRangeDao ocmTrBkgVstMealPlanRangeDao,
                                OcmTrBkgVstSplServiceRangeDao ocmTrBkgVstSplServiceRangeDao) {
        this.guestAccountDao = guestAccountDao;
        this.ocmTrBkgHdrDao = ocmTrBkgHdrDao;
        this.ocmTrReservedGuestsDao = ocmTrReservedGuestsDao;
        this.ocmTrBkgVstMisStatsDao = ocmTrBkgVstMisStatsDao;
        this.frmMealPlanHeaderSearchDao = frmMealPlanHeaderSearchDao;
        this.frmRateHeaderSearchDao = frmRateHeaderSearchDao;
        this.ocmTrBkgVstMealPlanRangeDao = ocmTrBkgVstMealPlanRangeDao;
        this.ocmTrBkgVstSplServiceRangeDao = ocmTrBkgVstSplServiceRangeDao;
    }

    public List<GuestSearchResultDto> searchReservation(LoginDetails loginDetails, GuestSearchDto guestSearchDto) {

        guestSearchResultDtos.clear();

        if(guestSearchDto.getBkgGenSource() == "" && guestSearchDto.getGuestName() == "" &&
                guestSearchDto.getBkgGenSource() == "" && guestSearchDto.getBkgNbr() == "" &&
                guestSearchDto.getExternalBkgRefNo() == "" && guestSearchDto.getCompanyTaTo() == null &&
                guestSearchDto.getIndvConfirmNo() == 0 && guestSearchDto.getBkgBlkRangeId() == 0 &&
                guestSearchDto.getRoomNo() == null && guestSearchDto.getGroupUId() == 0 &&
                guestSearchDto.getRateCode() == "" && guestSearchDto.getSharesGUid() == 0 &&
                guestSearchDto.getMealPlanCode() == "" && guestSearchDto.getOccRoomType() == ""
                && guestSearchDto.getSplSrvType() == "") {

            ocmTrReservedGuestsDao.getAllByUnitCode(loginDetails.getUnitCode()).forEach(getGuestSingleData->{
                System.out.println(getGuestSingleData.getOcmTrBkgVstMisStats());
                GuestAccount getestAccount = guestAccountDao.getFirstByUnitCodeAndGuestUid(loginDetails.getUnitCode(),
                        getGuestSingleData.getGuestUid());
                GuestSearchResultDto guestSearchResultDto = new GuestSearchResultDto();
                guestSearchResultDto.setBkgNbr(getGuestSingleData.getBkgNbr());
                guestSearchResultDto.setGuest(getGuestSingleData.getOcmTrBkgHdr()
                        .getReservedGuests().getOcmTrBkgVstPax().getPaxAd() + getGuestSingleData.getOcmTrBkgHdr()
                        .getReservedGuests().getOcmTrBkgVstPax().getPaxCh() + getGuestSingleData.getOcmTrBkgHdr()
                        .getReservedGuests().getOcmTrBkgVstPax().getPaxYt());
                OcmTrBkgVstMisStats misStatsData = getGuestSingleData.getOcmTrBkgHdr().getReservedGuests().getOcmTrBkgVstMisStats();

                if(misStatsData != null) {
                    guestSearchResultDto.setDomicile(misStatsData.getDomicile() == null ? "" : misStatsData.getDomicile());
                }
                if(misStatsData != null) {
                    guestSearchResultDto.setMisMs(getGuestSingleData.getOcmTrBkgVstMisStats().getMisMs() == null ? "" : getGuestSingleData.getOcmTrBkgVstMisStats().getMisMs());
                    guestSearchResultDto.setMisSb(getGuestSingleData.getOcmTrBkgVstMisStats().getMisSb() == null ? "" : getGuestSingleData.getOcmTrBkgVstMisStats().getMisSb());
                    guestSearchResultDto.setMisGc(getGuestSingleData.getOcmTrBkgVstMisStats().getMisGc() == null ? "" : getGuestSingleData.getOcmTrBkgVstMisStats().getMisGc());
                    guestSearchResultDto.setMisBs(getGuestSingleData.getOcmTrBkgVstMisStats().getMisBs() == null ? "" : getGuestSingleData.getOcmTrBkgVstMisStats().getMisBs());
                    guestSearchResultDto.setMisSaleExe(getGuestSingleData.getOcmTrBkgVstMisStats().getMisSalesExe() == null ? "" : getGuestSingleData.getOcmTrBkgVstMisStats().getMisSalesExe());
                    guestSearchResultDto.setNationality(getGuestSingleData.getOcmTrBkgVstMisStats().getNationality() == null ? "" : getGuestSingleData.getOcmTrBkgVstMisStats().getNationality());
                    guestSearchResultDto.setOccTypeId(getGuestSingleData.getOcmTrBkgVstMisStats().getOccTypeId());
                    guestSearchResultDto.setOccRmmType(getGuestSingleData.getOcmTrBkgVstMisStats().getOccRmType());
                }

                guestSearchResultDto.setArrTime(getGuestSingleData.getOcmTrBkgHdr().getReservedGuests().getArrETime());
                guestSearchResultDto.setDeptTime(getGuestSingleData.getOcmTrBkgHdr().getReservedGuests().getDepETime());
                guestSearchResultDto.setPayCode(getGuestSingleData.getOcmTrBkgVstBilling().getPayCode());
                guestSearchResultDto.setMealPlanCode(getGuestSingleData.getOcmTrBkgHdr().getReservedGuests().getMealPlanCode());
                guestSearchResultDto.setRateCode(getGuestSingleData.getOcmTrBkgHdr().getReservedGuests().getRateCode());
                guestSearchResultDto.setRoomRate(getGuestSingleData.getOcmTrBkgHdr().getReservedGuests().getRoomRate());
                guestSearchResultDto.setBillingInstGuest(getGuestSingleData.getOcmTrBkgVstBilling().getBillingInstGuest());
                guestSearchResultDto.setRoomNumber(getGuestSingleData.getRoomNo());
                guestSearchResultDto.setIsCheckedIn(getGuestSingleData.getIsCheckedIn());
                guestSearchResultDto.setMealPlanCode(getGuestSingleData.getMealPlanCode() == null ? "" :
                        getGuestSingleData.getMealPlanCode());
                guestSearchResultDto.setGtdId(getGuestSingleData.getOcmTrBkgVstBilling().getGtdId());
                guestSearchResultDto.setBkgGenSource(getGuestSingleData.getOcmTrBkgHdr().getBkgGenSource());
                guestSearchResultDto.setPaxAd(getGuestSingleData.getOcmTrBkgHdr()
                        .getReservedGuests().getOcmTrBkgVstPax().getPaxAd());
                guestSearchResultDto.setPaxCh(getGuestSingleData.getOcmTrBkgHdr()
                        .getReservedGuests().getOcmTrBkgVstPax().getPaxCh());
                guestSearchResultDto.setPaxCh(getGuestSingleData.getOcmTrBkgHdr()
                        .getReservedGuests().getOcmTrBkgVstPax().getPaxCh());
                guestSearchResultDto.setCurCode(getGuestSingleData.getOcmTrBkgHdr()
                        .getReservedGuests().getCurCode());
                guestSearchResultDto.setOccInd(getGuestSingleData.getOcmTrBkgHdr()
                        .getReservedGuests().getOccStautsId());
                if(getGuestSingleData.getOcmTrBkgVstSplServiceRange() != null) {
                    guestSearchResultDto.setSplSrvType(getGuestSingleData.getOcmTrBkgVstSplServiceRange().getSplSrvType());
                }
                guestSearchResultDto.setOccInd(getGuestSingleData.getOccInd());

                guestSearchResultDto.setArrPickReq(getGuestSingleData.getArrPickReq());
                guestSearchResultDto.setDepDropReq(getGuestSingleData.getDepDropReq());
                guestSearchResultDto.setDepDropReq(getGuestSingleData.getDepDropReq());
                guestSearchResultDto.setDepDropReq(getGuestSingleData.getDepMode());
                guestSearchResultDto.setDepVehCode(getGuestSingleData.getDepVehCode());
                guestSearchResultDto.setResvPropagatioin(getGuestSingleData.getOcmTrBkgHdr().getResvPropagation());
                guestSearchResultDto.setBooker(getGuestSingleData.getOcmTrBkgHdr().getBooker());
                guestSearchResultDto.setCortaGustAc(getGuestSingleData.getOcmTrBkgHdr().getCortaGuestAcType());
                guestSearchResultDto.setCreditLmt(getGuestSingleData.getOcmTrBkgVstBilling().getCreditLimit());
                guestSearchResultDto.setStusCrdAllowed(getGuestSingleData.getOcmTrBkgVstBilling().getStatusCreditAllowed());
                guestSearchResultDto.setArrDate(getGuestSingleData.getArrDate());
                guestSearchResultDto.setFirstName(getestAccount.getFirstName());
                guestSearchResultDto.setLastName(getestAccount.getLastName());
                guestSearchResultDto.setConfirmationNoRef(getGuestSingleData.getOcmTrBkgHdr().getExternalBkgRefNo());
                guestSearchResultDto.setDeptDate(getGuestSingleData.getDepDate());
                guestSearchResultDto.setBookingNo(getGuestSingleData.getBkgNbr());
                guestSearchResultDto.setCompany(getGuestSingleData.getOcmTrBkgHdr().getCortaUid() == null ? 0 :
                        getGuestSingleData.getOcmTrBkgHdr().getCortaUid());
                guestSearchResultDto.setRateCode(getGuestSingleData.getRateCode());
                guestSearchResultDto.setRoomRate(getGuestSingleData.getRoomRate());

                guestSearchResultDtos.add(guestSearchResultDto);
            });
        } if(guestSearchDto.getOccRoomType() != "" && (guestSearchDto.getBkgGenSource() == ""  &&
                guestSearchDto.getBkgGenSource() == "" && guestSearchDto.getBkgNbr() == "" &&
                guestSearchDto.getExternalBkgRefNo() == "" && guestSearchDto.getCompanyTaTo() == null &&
                guestSearchDto.getIndvConfirmNo() == 0 && guestSearchDto.getBkgBlkRangeId() == 0 &&
                guestSearchDto.getRoomNo() == null && guestSearchDto.getGroupUId() == 0 &&
                guestSearchDto.getRateCode() == "" && guestSearchDto.getSharesGUid() == 0 &&
                guestSearchDto.getMealPlanCode() == "") && guestSearchDto.getGuestName() == "") {

                System.out.println("Fetching from Mis stat table ...  ");
                ocmTrBkgVstMisStatsDao.getAllByOccRmType(guestSearchDto.getOccRoomType()).forEach(getSingleMisStatData -> {
                    GuestSearchResultDto guestSearchResultDto = new GuestSearchResultDto();
                    guestSearchResultDto.setArrDate(getSingleMisStatData.getOcmTrListReservedGuest().getArrDate());
                    guestSearchResultDto.setFirstName(getSingleMisStatData.getOcmTrListReservedGuest().getGuestAccount().getFirstName());
                    guestSearchResultDto.setLastName(getSingleMisStatData.getOcmTrListReservedGuest().getGuestAccount().getLastName());
                    guestSearchResultDto.setConfirmationNoRef(getSingleMisStatData.getOcmTrListReservedGuest().getOcmTrBkgHdr()
                            .getExternalBkgRefNo());
                    guestSearchResultDto.setDeptDate(getSingleMisStatData.getOcmTrListReservedGuest().getDepDate());
                    guestSearchResultDto.setBookingNo(getSingleMisStatData.getOcmTrListReservedGuest().getBkgNbr());
                    guestSearchResultDto.setCompany(getSingleMisStatData.getOcmTrListReservedGuest().getOcmTrBkgHdr().getCortaUid());

                    guestSearchResultDto.setgClass(getSingleMisStatData.getMisGc());
                    guestSearchResultDto.setMktSgmnt(getSingleMisStatData.getMisMs());
                    guestSearchResultDto.setRateCode(getSingleMisStatData.getOcmTrListReservedGuest().getRateCode());
                    guestSearchResultDto.setRoomRate(getSingleMisStatData.getOcmTrListReservedGuest().getRoomRate());
                    guestSearchResultDtos.add(guestSearchResultDto);

                });
        } if(guestSearchDto.getBkgGenSource() != "" || guestSearchDto.getBkgNbr() != "" ||
                guestSearchDto.getExternalBkgRefNo() != null || guestSearchDto.getCompanyTaTo() != null) {
            if((guestSearchDto.getBkgGenSource() != "" || guestSearchDto.getBkgNbr() != "" ||
                    guestSearchDto.getExternalBkgRefNo() != "") && (guestSearchDto.getMealPlanCode() == "" &&
                    guestSearchDto.getOccRoomType() == "" && guestSearchDto.getGuestName() == "")) {

            System.out.println("Search by Hdr ....  ");
            ocmTrBkgHdrDao.getAllByBkgGenSourceAndUnitCodeOrBkgNbrOrExternalBkgRefNoOrCortaUidOrExternalPoRefNo(
                            guestSearchDto.getBkgGenSource(),
                            loginDetails.getUnitCode(), guestSearchDto.getBkgNbr(),
                            guestSearchDto.getExternalBkgRefNo(), 0,
                            guestSearchDto.getExternalProRefNo()).forEach(getSingleHeader -> {

                GuestSearchResultDto guestSearchResultDto = new GuestSearchResultDto();
                System.out.println(getSingleHeader.getReservedGuests());
                if (getSingleHeader.getReservedGuests() != null) {
                        guestSearchResultDto.setArrDate(getSingleHeader.getReservedGuests().getArrDate());
                        guestSearchResultDto.setFirstName(getSingleHeader.getReservedGuests().getGuestAccount().getFirstName());
                        guestSearchResultDto.setLastName(getSingleHeader.getReservedGuests().getGuestAccount().getLastName());
                        guestSearchResultDto.setConfirmationNoRef(getSingleHeader.getReservedGuests().getOcmTrBkgHdr()
                                .getExternalBkgRefNo());
                        guestSearchResultDto.setDeptDate(getSingleHeader.getReservedGuests().getDepDate());
                        guestSearchResultDto.setBookingNo(getSingleHeader.getReservedGuests().getBkgNbr());
                        guestSearchResultDto.setCompany(getSingleHeader.getCortaUid());

                        if(getSingleHeader.getReservedGuests().getOcmTrBkgVstMisStats() != null) {
                            guestSearchResultDto.setgClass(getSingleHeader.getReservedGuests().getOcmTrBkgVstMisStats()
                                    .getMisGc() == null ? "" : getSingleHeader.getReservedGuests().getOcmTrBkgVstMisStats().getMisGc());
                            guestSearchResultDto.setMktSgmnt(getSingleHeader.getReservedGuests().getOcmTrBkgVstMisStats()
                                    .getMisMs() == null ? "" : getSingleHeader.getReservedGuests().getOcmTrBkgVstMisStats()
                                    .getMisMs());
                        }
                        guestSearchResultDto.setRateCode(getSingleHeader.getReservedGuests().getRateCode());
                        guestSearchResultDto.setRoomRate(getSingleHeader.getReservedGuests().getRoomRate());

                        guestSearchResultDtos.add(guestSearchResultDto);
                    }
                });
            }
        }  if((guestSearchDto.getIndvConfirmNo() != null || guestSearchDto.getBkgBlkRangeId() != null
                 || guestSearchDto.getRoomNo() != null || guestSearchDto.getGroupUId() != null
                 || guestSearchDto.getRateCode() != null || guestSearchDto.getSharesGUid() != null)
                && (guestSearchDto.getMealPlanCode() == null)) {

            System.out.println("Search by Reserved List  ...");
            ocmTrReservedGuestsDao.searchGuestList(loginDetails.getUnitCode(), guestSearchDto.getIndvConfirmNo(),
                    guestSearchDto.getBkgBlkRangeId(), guestSearchDto.getGroupUId(), guestSearchDto.getRateCode(),
                    guestSearchDto.getPrimaryInd(), guestSearchDto.getSharesGUid(), guestSearchDto.getArrvPickReq(),
                    guestSearchDto.getIsCheckIn(), guestSearchDto.getGetIsCheckOut(), guestSearchDto.getRoomNo())
                    .forEach(getSingleReservedGuestData -> {

                if(getSingleReservedGuestData.getOcmTrBkgVstMisStats() != null && getSingleReservedGuestData.getGuestAccount() != null) {
                    GuestSearchResultDto guestSearchResultDto = new GuestSearchResultDto();
                    guestSearchResultDto.setArrDate(getSingleReservedGuestData.getArrDate());
                    guestSearchResultDto.setFirstName(getSingleReservedGuestData.getGuestAccount().getFirstName());
                    guestSearchResultDto.setLastName(getSingleReservedGuestData.getGuestAccount().getLastName());
                    guestSearchResultDto.setConfirmationNoRef(getSingleReservedGuestData.getOcmTrBkgHdr().getExternalBkgRefNo());
                    guestSearchResultDto.setDeptDate(getSingleReservedGuestData.getDepDate());
                    guestSearchResultDto.setBookingNo(getSingleReservedGuestData.getBkgNbr());
                    guestSearchResultDto.setCompany(getSingleReservedGuestData.getOcmTrBkgHdr().getCortaUid());
                    guestSearchResultDto.setgClass(getSingleReservedGuestData.getOcmTrBkgVstMisStats().getMisGc());
                    guestSearchResultDto.setRateCode(getSingleReservedGuestData.getRateCode());
                    guestSearchResultDto.setRoomRate(getSingleReservedGuestData.getRoomRate());
                    guestSearchResultDto.setMktSgmnt(getSingleReservedGuestData.getOcmTrBkgVstMisStats().getMisMs());
                }
            });
            return guestSearchResultDtos;
        }

        if(guestSearchDto.getGuestName() != "") {

            GuestSearchResultDto guestSearchResultDto = new GuestSearchResultDto();
            List<GuestAccount> guestAccountData = guestAccountDao.findByName(
                    guestSearchDto.getGuestName());
            if (guestAccountData.size() > 0) {
                guestAccountData.forEach(getSingleAccountData -> {
                    if (getSingleAccountData.getOcmTrListReservedGuest() != null) {

                        guestSearchResultDto.setArrDate(getSingleAccountData.getOcmTrListReservedGuest().getArrDate());
                        guestSearchResultDto.setFirstName(getSingleAccountData.getFirstName());
                        guestSearchResultDto.setLastName(getSingleAccountData.getLastName());
                         guestSearchResultDto.setConfirmationNoRef(getSingleAccountData.getOcmTrListReservedGuest()
                                .getOcmTrBkgHdr().getExternalBkgRefNo() == null ? "" : getSingleAccountData.getOcmTrListReservedGuest()
                                .getOcmTrBkgHdr().getExternalBkgRefNo());
                        guestSearchResultDto.setDeptDate(getSingleAccountData.getOcmTrListReservedGuest().getDepDate());
                        guestSearchResultDto.setBookingNo(getSingleAccountData.getOcmTrListReservedGuest().getBkgNbr());
                        guestSearchResultDto.setCompany(getSingleAccountData.getOcmTrListReservedGuest().getOcmTrBkgHdr()
                                .getCortaUid());
                        if(getSingleAccountData.getOcmTrListReservedGuest()
                                .getOcmTrBkgVstMisStats() != null) {
                            guestSearchResultDto.setgClass(getSingleAccountData.getOcmTrListReservedGuest()
                                    .getOcmTrBkgVstMisStats().getMisGc() == null ? "" : getSingleAccountData.getOcmTrListReservedGuest()
                                    .getOcmTrBkgVstMisStats().getMisGc());
                            guestSearchResultDto.setMktSgmnt(getSingleAccountData.getOcmTrListReservedGuest()
                                    .getOcmTrBkgVstMisStats().getMisMs() == null ? "" : getSingleAccountData.getOcmTrListReservedGuest()
                                    .getOcmTrBkgVstMisStats().getMisMs());
                        }
                        guestSearchResultDto.setRateCode(getSingleAccountData.getOcmTrListReservedGuest().getRateCode());
                        guestSearchResultDto.setRoomRate(getSingleAccountData.getOcmTrListReservedGuest().getRoomRate());

                        guestSearchResultDtos.add(guestSearchResultDto);
                    }
                });
            }
        }

        if(guestSearchDto.getMealPlanCode() != "" && (guestSearchDto.getBkgGenSource() == "" &&
                guestSearchDto.getGuestName() == "" && guestSearchDto.getBkgGenSource() == "" &&
                guestSearchDto.getBkgNbr() == "" && guestSearchDto.getExternalBkgRefNo() == "" &&
                guestSearchDto.getCompanyTaTo() == null && guestSearchDto.getIndvConfirmNo() == 0 &&
                guestSearchDto.getBkgBlkRangeId() == 0 && guestSearchDto.getRoomNo() == null &&
                guestSearchDto.getGroupUId() == 0 && guestSearchDto.getRateCode() == "" &&
                guestSearchDto.getSharesGUid() == 0 &&
                guestSearchDto.getOccRoomType() == "")) {
            System.out.println("Getting stuff by meal plan code .... ");

            ocmTrBkgVstMealPlanRangeDao.getAllByMealPlanCode(guestSearchDto.getMealPlanCode())
                    .forEach(getSingleMealPlanData -> {

                GuestSearchResultDto guestSearchResultDto = new GuestSearchResultDto();
                guestSearchResultDto.setArrDate(getSingleMealPlanData.getOcmTrListReservedGuest().getArrDate());
                guestSearchResultDto.setFirstName(getSingleMealPlanData.getOcmTrListReservedGuest()
                        .getGuestAccount().getFirstName());
                guestSearchResultDto.setLastName(getSingleMealPlanData.getOcmTrListReservedGuest().getGuestAccount()
                        .getLastName());
                guestSearchResultDto.setConfirmationNoRef(getSingleMealPlanData.getOcmTrListReservedGuest()
                        .getOcmTrBkgHdr().getExternalBkgRefNo() == null ? "" : getSingleMealPlanData
                        .getOcmTrListReservedGuest()
                        .getOcmTrBkgHdr().getExternalBkgRefNo());
                guestSearchResultDto.setDeptDate(getSingleMealPlanData.getOcmTrListReservedGuest().getDepDate());
                guestSearchResultDto.setBookingNo(getSingleMealPlanData.getOcmTrListReservedGuest().getBkgNbr());
                guestSearchResultDto.setCompany(getSingleMealPlanData.getOcmTrListReservedGuest().getOcmTrBkgHdr()
                        .getCortaUid());
                if(getSingleMealPlanData.getOcmTrListReservedGuest().getOcmTrBkgVstMisStats() != null) {
                    guestSearchResultDto.setgClass(getSingleMealPlanData.getOcmTrListReservedGuest()
                            .getOcmTrBkgVstMisStats().getMisGc() == null ? "" : getSingleMealPlanData
                            .getOcmTrListReservedGuest().getOcmTrBkgVstMisStats().getMisGc());
                    guestSearchResultDto.setMktSgmnt(getSingleMealPlanData.getOcmTrListReservedGuest()
                            .getOcmTrBkgVstMisStats().getMisMs() == null ? "" : getSingleMealPlanData.getOcmTrListReservedGuest()
                            .getOcmTrBkgVstMisStats().getMisMs());
                }
                guestSearchResultDto.setRateCode(getSingleMealPlanData.getOcmTrListReservedGuest().getRateCode());
                guestSearchResultDto.setRoomRate(getSingleMealPlanData.getOcmTrListReservedGuest().getRoomRate());

                guestSearchResultDtos.add(guestSearchResultDto);
            });
        } if(guestSearchDto.getSplSrvType() != "" && (guestSearchDto.getBkgGenSource() == ""  &&
                guestSearchDto.getBkgGenSource() == "" && guestSearchDto.getOccRoomType() == "" && guestSearchDto.getBkgNbr() == "" &&
                guestSearchDto.getExternalBkgRefNo() == "" && guestSearchDto.getCompanyTaTo() == null &&
                guestSearchDto.getIndvConfirmNo() == 0 && guestSearchDto.getBkgBlkRangeId() == 0 &&
                guestSearchDto.getRoomNo() == null && guestSearchDto.getGroupUId() == 0 &&
                guestSearchDto.getRateCode() == "" && guestSearchDto.getSharesGUid() == 0 &&
                guestSearchDto.getMealPlanCode() == "") && guestSearchDto.getGuestName() == "") {

                ocmTrBkgVstSplServiceRangeDao.getFirstBySplSrvTypeAndUnitCode(guestSearchDto.getSplSrvType(),
                    loginDetails.getUnitCode()).forEach(getSingleSplServData -> {

                    GuestSearchResultDto guestSearchResultDto = new GuestSearchResultDto();
                    guestSearchResultDto.setArrDate(getSingleSplServData.getOcmTrListReservedGuest().getArrDate());
                    guestSearchResultDto.setFirstName(getSingleSplServData.getOcmTrListReservedGuest()
                            .getGuestAccount().getFirstName());
                    guestSearchResultDto.setLastName(getSingleSplServData.getOcmTrListReservedGuest().getGuestAccount()
                            .getLastName());
                    guestSearchResultDto.setConfirmationNoRef(getSingleSplServData.getOcmTrListReservedGuest()
                            .getOcmTrBkgHdr().getExternalBkgRefNo() == null ? "" : getSingleSplServData
                            .getOcmTrListReservedGuest()
                            .getOcmTrBkgHdr().getExternalBkgRefNo());
                    guestSearchResultDto.setDeptDate(getSingleSplServData.getOcmTrListReservedGuest().getDepDate());
                    guestSearchResultDto.setBookingNo(getSingleSplServData.getOcmTrListReservedGuest().getBkgNbr());
                    guestSearchResultDto.setCompany(getSingleSplServData.getOcmTrListReservedGuest().getOcmTrBkgHdr()
                            .getCortaUid());
                    if(getSingleSplServData.getOcmTrListReservedGuest().getOcmTrBkgVstMisStats() != null) {
                        guestSearchResultDto.setgClass(getSingleSplServData.getOcmTrListReservedGuest()
                                .getOcmTrBkgVstMisStats().getMisGc() == null ? "" : getSingleSplServData
                                .getOcmTrListReservedGuest().getOcmTrBkgVstMisStats().getMisGc());
                        guestSearchResultDto.setMktSgmnt(getSingleSplServData.getOcmTrListReservedGuest()
                                .getOcmTrBkgVstMisStats().getMisMs() == null ? "" : getSingleSplServData.getOcmTrListReservedGuest()
                                .getOcmTrBkgVstMisStats().getMisMs());
                    }
                    guestSearchResultDto.setRateCode(getSingleSplServData.getOcmTrListReservedGuest().getRateCode());
                    guestSearchResultDto.setRoomRate(getSingleSplServData.getOcmTrListReservedGuest().getRoomRate());

                    guestSearchResultDtos.add(guestSearchResultDto);
                });
        }
        return guestSearchResultDtos;
    }

    public BookingInfo getBookingInfo(LoginDetails loginDetails, String bkngNumber) throws ParseException {

        BookingInfo bookingInfo = new BookingInfo();
        try {


            OcmTrBkgHdr ocmTrBkgHdr = ocmTrBkgHdrDao.getAllByUnitCodeAndBkgNbr(loginDetails.getUnitCode(), bkngNumber);
            OcmTrListReservedGuest getReservedGuests = ocmTrBkgHdr.getReservedGuests();
            OcmTrBkgVstMisStats ocmTrBkgVstMisStats = getReservedGuests.getOcmTrBkgVstMisStats();
            OcmTrBkgVstSplServiceRange ocmTrBkgVstSplServiceRange = getReservedGuests.getOcmTrBkgVstSplServiceRange();

            bookingInfo.setNoOfNights(daysBetween(getReservedGuests.getArrDate(),
                    getReservedGuests.getDepDate()) - 1);
            if (getReservedGuests.getOcmTrBkgVstSplServiceRange() != null) {
                bookingInfo.setSplSrvType(getReservedGuests.getOcmTrBkgVstSplServiceRange().getSplSrvType());
            }
            bookingInfo.setTitle(getReservedGuests.getGuestAccount().getTitle() == null ? "" :
                    ocmTrBkgHdr.getReservedGuests().getGuestAccount().getTitle());
            if (ocmTrBkgVstMisStats != null) {
                bookingInfo.setRmmType(ocmTrBkgVstMisStats.getOccRmType());
            }
            bookingInfo.setFname(getReservedGuests.getGuestAccount().getFirstName());
            bookingInfo.setLname(getReservedGuests.getGuestAccount().getLastName());
            bookingInfo.setBkgUid(ocmTrBkgHdr.getBkgUid());
            bookingInfo.setPendingConfirmation(ocmTrBkgHdr.getConfirmRequired());
            bookingInfo.setProfileId(getReservedGuests.getGuestAccount().getProfileId());
            bookingInfo.setConfirmedOn(ocmTrBkgHdr.getConfirmedOn());
            bookingInfo.setPrimary(getReservedGuests.getPrimaryInd());
            bookingInfo.setArrDate(getReservedGuests.getArrDate());
            bookingInfo.setDeptDate(getReservedGuests.getDepDate());
            bookingInfo.setCompanyTaTo(ocmTrBkgHdr.getCortaUid());
            bookingInfo.setOccType(getReservedGuests.getOccInd());
            bookingInfo.setAd(getReservedGuests.getOcmTrBkgVstPax().getPaxAd());
            bookingInfo.setYt(getReservedGuests.getOcmTrBkgVstPax().getPaxYt());
            bookingInfo.setCh(getReservedGuests.getOcmTrBkgVstPax().getPaxCh());
            bookingInfo.setRateCode(getReservedGuests.getRateCode());
            bookingInfo.setRmmRate(getReservedGuests.getRoomRate());
            bookingInfo.setCurCode(getReservedGuests.getCurCode());
            bookingInfo.setMealPlanCode(getReservedGuests.getMealPlanCode());
            bookingInfo.setPayMethod(getReservedGuests.getOcmTrBkgVstBilling().getPayCode());
            bookingInfo.setCashOnly(getReservedGuests.getOcmTrBkgVstBilling().getStatusCashOnly());
            bookingInfo.setAllowPOS(getReservedGuests.getOcmTrBkgVstBilling().getAllowPos());
            bookingInfo.setBillingInstruction(getReservedGuests.getOcmTrBkgVstBilling().getBillingInstGuest());
            bookingInfo.setStatus(getReservedGuests.getOccStautsId());
        } catch (NullPointerException nullPointExceptio){}
        return bookingInfo;
    }

    private static long daysBetween(Date one, Date two) {
        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }

    public List<HashMap<String, String>> getAllMealPlanCodes(LoginDetails loginDetails) {

        List<HashMap<String, String>> fout = new ArrayList<>();
        frmMealPlanHeaderSearchDao.getAllByUnitCode(loginDetails.getUnitCode()).forEach(getMealPlanData -> {

            HashMap<String, String> singleMealPlanCodeDetails = new HashMap<>();
            singleMealPlanCodeDetails.put("mealPlanCode", getMealPlanData.getMealPlanCode());
            singleMealPlanCodeDetails.put("mealPlanName", getMealPlanData.getMealPlanName());
            fout.add(singleMealPlanCodeDetails);
        });
        return fout;
    }

    public  List<HashMap<String, String>> getAllRateCodes(LoginDetails loginDetails) {

        List<HashMap<String, String>> fout = new ArrayList<>();
        frmRateHeaderSearchDao.getAllByUnitCode(loginDetails.getUnitCode()).forEach(getMealPlanData -> {

            HashMap<String, String> singleMealPlanCodeDetails = new HashMap<>();
            singleMealPlanCodeDetails.put("rateCode", getMealPlanData.getRateCode());
            singleMealPlanCodeDetails.put("rateDesc", getMealPlanData.getRateDesc());
            fout.add(singleMealPlanCodeDetails);
        });
        return fout;
    }
}
