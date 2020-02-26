package com.samasa.hspms.Booking.validation.Services.RoomBookingService;

import com.samasa.hspms.Booking.validation.Dao.*;
import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.Booking.validation.Dto.Propagation.PropagationData;
import com.samasa.hspms.Booking.validation.Dto.SubSections.RoomBooking.RoomBooking;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgBlkDaily;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgBlkRange;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgHdr;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstBilling;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstMealPlanRange;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstMisStats;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstPax;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstSplServiceRange;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrListReservedGuest;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.UnitDocNextseq;
import com.samasa.hspms.Booking.validation.Mapper.BookingSectionMapper;
import com.samasa.hspms.common.dto.LoginDetails;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@Service
@Transactional
public class RoomBookingService {

    private OcmTrBkgHdrDao ocmTrBkgHdrDao;
    private BookingSectionMapper bookingSectionMapper;
    private OcmTrBkgRangeDao ocmTrBkgRangeDao;
    private UnitDocNextseqDao unitDocNextseqDao;
    private OcmTrBkgBlkDailyDao ocmTrBkgBlkDailyDao;
    private OcmTrReservedGuestsDao ocmTrReservedGuestsDao;
    private TrOcmRoomRoomTypeAvalDao trOcmRoomRoomTypeAvalDao;
    private RoomTypeAvailableNoDao roomTypeAvailableNoDao;
    private OcmBkgBillingDao ocmBkgBillingDao;
    private RoomBookingOtherTablesDataInsert roomBookingOtherTablesDataInsert;
    private OcmTrBkgVstMisStatsDao ocmTrBkgVstMisStatsDao;
    private OcmTrBkgVstPaxDao ocmTrBkgVstPaxDao;
    private OcmTrBkgVstSplServiceRangeDao ocmTrBkgVstSplServiceRangeDao;
    private OcmTrBkgVstMealPlanRangeDao ocmTrBkgVstMealPlanRangeDao;

    public RoomBookingService(OcmTrBkgHdrDao ocmTrBkgHdrDao,
                              BookingSectionMapper bookingSectionMapper,
                              OcmTrBkgRangeDao ocmTrBkgRangeDao,
                              UnitDocNextseqDao unitDocNextseqDao,
                              OcmTrBkgBlkDailyDao ocmTrBkgBlkDailyDao,
                              OcmTrReservedGuestsDao ocmTrReservedGuestsDao,
                              TrOcmRoomRoomTypeAvalDao trOcmRoomRoomTypeAvalDao,
                              RoomTypeAvailableNoDao roomTypeAvailableNoDao,
                              OcmBkgBillingDao ocmBkgBillingDao,
                              OcmTrBkgVstMisStatsDao ocmTrBkgVstMisStatsDao,
                              OcmTrBkgVstPaxDao ocmTrBkgVstPaxDao,
                              OcmTrBkgVstSplServiceRangeDao ocmTrBkgVstSplServiceRangeDao,
                              OcmTrBkgVstMealPlanRangeDao ocmTrBkgVstMealPlanRangeDao,
                              RoomBookingOtherTablesDataInsert roomBookingOtherTablesDataInsert) {

        this.ocmTrBkgHdrDao = ocmTrBkgHdrDao;
        this.bookingSectionMapper = bookingSectionMapper;
        this.ocmTrBkgRangeDao = ocmTrBkgRangeDao;
        this.unitDocNextseqDao = unitDocNextseqDao;
        this.ocmTrBkgBlkDailyDao = ocmTrBkgBlkDailyDao;
        this.ocmTrReservedGuestsDao = ocmTrReservedGuestsDao;
        this.trOcmRoomRoomTypeAvalDao = trOcmRoomRoomTypeAvalDao;
        this.roomTypeAvailableNoDao = roomTypeAvailableNoDao;
        this.ocmBkgBillingDao = ocmBkgBillingDao;
        this.ocmTrBkgVstMisStatsDao = ocmTrBkgVstMisStatsDao;
        this.ocmTrBkgVstPaxDao = ocmTrBkgVstPaxDao;
        this.ocmTrBkgVstSplServiceRangeDao = ocmTrBkgVstSplServiceRangeDao;
        this.ocmTrBkgVstMealPlanRangeDao = ocmTrBkgVstMealPlanRangeDao;
        this.roomBookingOtherTablesDataInsert = roomBookingOtherTablesDataInsert;
    }

    public PropagationData bookRoom(BookInputDataDto bookInputDataDto, LoginDetails loginDetails, int guestUid, String timeZone) {

        RoomBooking booking = new RoomBooking();
        String getOldDocumentSeqNumber = unitDocNextseqDao.getFirstByUnitCodeAndDocumentCode(loginDetails.getUnitCode(),
                "BCN").getNextseqNo();
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));

        try {
            UnitDocNextseq docmentSeqData = unitDocNextseqDao.getFirstByUnitCodeAndDocumentCode(loginDetails.getUnitCode(),
                    "BCN");
            String newBkgNumber = docmentSeqData.getNextseqNo().charAt(0) +
                    Integer.toString(Integer.parseInt(getOldDocumentSeqNumber.substring(1)) + 1);

            unitDocNextseqDao.updateDocSeqNumber(newBkgNumber, getOldDocumentSeqNumber);

            booking.setBkgGenSource(bookInputDataDto.getBkgGenSource());
            booking.setBkgDateFrom(new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString())));
            booking.setBkgDateTo(new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString())));
            booking.setOccStautsId(bookInputDataDto.getOccStatusId());
            booking.setArrPickReq("N");
            booking.setBkgDate(getCurrentDateTimeByTimeZone(timeZone));
            booking.setUnitCode(loginDetails.getUnitCode());
            booking.setBkgNbr(getOldDocumentSeqNumber);
            booking.setConfirmMailSent("N");
            booking.setConfirmRequired("N");
            booking.setCortaGuestAcType(bookInputDataDto.getGuestAcType());
            booking.setCortaGuestUid(guestUid);
            booking.setResvPropagation("N");
            booking.setConfirmRequired("N");
            booking.setDepDropReq("N");
            booking.setConfirmMailSent("N");

            booking.setCrDatetime(createdDateTime(timeZone));
            booking.setCrUserUid(loginDetails.getUserId());
            booking.setDepDropReq(String.valueOf(bookInputDataDto.getDepDropReq()));
            booking.setStatusEdit("Y");

            ocmTrBkgHdrDao.save(bookingSectionMapper.mappingRoomBookingEntitiyToDto(booking));
        } catch (NullPointerException npe) {
        }

        OcmTrBkgHdr bookingHeader = ocmTrBkgHdrDao.getLastRecord();
        OcmTrBkgBlkRange ocmTrBkgBlkRange = new OcmTrBkgBlkRange();
        ocmTrBkgBlkRange.setBkgNbr(getOldDocumentSeqNumber);
        ocmTrBkgBlkRange.setBkgUid(bookingHeader.getBkgUid());
        ocmTrBkgBlkRange.setArrDate(fromDate);
        ocmTrBkgBlkRange.setDepDate(toDate);
        ocmTrBkgBlkRange.setCrDatetime(createdDateTime(timeZone));
        ocmTrBkgBlkRange.setCrUserUid(loginDetails.getUserId());
        ocmTrBkgBlkRange.setDefltCurCode(bookInputDataDto.getCurCode());
        ocmTrBkgBlkRange.setArrETime(bookInputDataDto.getArrTime());
        ocmTrBkgBlkRange.setDepETime(bookInputDataDto.getDeptTime());
        ocmTrBkgBlkRange.setDefltOccInd(bookInputDataDto.getOccInd());
        ocmTrBkgBlkRange.setDefltMealPlanCode(bookInputDataDto.getMealPlanCode());
        ocmTrBkgBlkRange.setDefltOccRmType(bookInputDataDto.getOccRoomType());
        ocmTrBkgBlkRange.setDefltRateCode(bookInputDataDto.getRateCode());
        ocmTrBkgBlkRange.setDefltRoomRate(bookInputDataDto.getRoomRate());
        ocmTrBkgBlkRange.setOccStautsId(bookInputDataDto.getOccStatusId());
        ocmTrBkgBlkRange.setUnitCode(loginDetails.getUnitCode());

        ocmTrBkgRangeDao.save(ocmTrBkgBlkRange);

        Date busDate;
        int id = 0;
        int batchSeqId = 1;
        OcmTrBkgBlkDaily ocmTrBkgBlkDaily = new OcmTrBkgBlkDaily();
        Calendar calendar = Calendar.getInstance();

        try {
            batchSeqId = ocmTrBkgBlkDailyDao.getFirstByOrderByBatchSeqIdDesc().getBatchSeqId();
        } catch (NullPointerException npe) {
            batchSeqId = 1;
        }

        for (int day = 0; daysBetween(fromDate, toDate) > day; day++) {

            id++;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();
            ocmTrBkgBlkDaily.setBkgNbr(getOldDocumentSeqNumber);
            ocmTrBkgBlkDaily.setBkgBlkDailyId(id);
            ocmTrBkgBlkDaily.setBatchSeqId(batchSeqId+1);
            ocmTrBkgBlkDaily.setBkgUid(bookingHeader.getBkgUid());
            ocmTrBkgBlkDaily.setUnitCode(loginDetails.getUnitCode());
            ocmTrBkgBlkDaily.setCurCode(bookInputDataDto.getCurCode());
            ocmTrBkgBlkDaily.setBkgRangeId(ocmTrBkgRangeDao.getFirstByOrderByBkgBlkRangeIdDesc().getBkgBlkRangeId());
            ocmTrBkgBlkDaily.setBusDate(busDate);
            ocmTrBkgBlkDaily.setOccRmType(bookInputDataDto.getOccRoomType());
            ocmTrBkgBlkDaily.setNfRoomBkd(bookInputDataDto.getnFRoomBooked());
            ocmTrBkgBlkDaily.setMealPlanCode(bookInputDataDto.getMealPlanCode());
            ocmTrBkgBlkDaily.setRateCode(bookInputDataDto.getRateCode());
            ocmTrBkgBlkDaily.setRoomRate(bookInputDataDto.getRoomRate());
            ocmTrBkgBlkDaily.setCurCode(bookInputDataDto.getCurCode());
            ocmTrBkgBlkDaily.setOccInd(bookInputDataDto.getOccInd());
            ocmTrBkgBlkDaily.setOccStautsId(bookInputDataDto.getOccStatusId());
            ocmTrBkgBlkDaily.setCrUserUid(loginDetails.getUserId());
            ocmTrBkgBlkDaily.setCrDatetime(createdDateTime(timeZone));
            ocmTrBkgBlkDaily.setCrSessionId(loginDetails.getSessionId());

            ocmTrBkgBlkDailyDao.save(ocmTrBkgBlkDaily);
            roomTypeAvailableNoDao.updateRoomNoAvailForBooking(new SimpleDateFormat("yyyy-MM-dd").format(busDate),
                    loginDetails.getUnitCode(),
                    bookInputDataDto.getRoomNumber());
        }

        OcmTrListReservedGuest ocmTrListReservedGuest = new OcmTrListReservedGuest();
        Integer bkgBlkDailyId =  ocmTrBkgBlkDailyDao.getLastEntry().getBkgBlkDailyId();

        ocmTrListReservedGuest.setUnitCode(loginDetails.getUnitCode());
        ocmTrListReservedGuest.setBkgNbr(getOldDocumentSeqNumber);
        ocmTrListReservedGuest.setResvGUid(guestUid);
        ocmTrListReservedGuest.setBatchSeqId(batchSeqId+1);
        ocmTrListReservedGuest.setBkgUid(bookingHeader.getBkgUid());
        ocmTrListReservedGuest.setBkgBlkRangeId(ocmTrBkgRangeDao.getFirstByOrderByBkgBlkRangeIdDesc().getBkgBlkRangeId());
        ocmTrListReservedGuest.setBkgBlkDailyId(bkgBlkDailyId);
        ocmTrListReservedGuest.setGuestUid(guestUid);
        ocmTrListReservedGuest.setArrDate(bookingHeader.getBkgDateFrom());
        ocmTrListReservedGuest.setDepDate(bookingHeader.getBkgDateTo());
        ocmTrListReservedGuest.setArrETime(bookInputDataDto.getArrTime());
        ocmTrListReservedGuest.setDepETime(bookInputDataDto.getDeptTime());
        ocmTrListReservedGuest.setPaxType(bookInputDataDto.getPaxType());
        ocmTrListReservedGuest.setPrimaryInd('Y');
        ocmTrListReservedGuest.setSharesWithGuestUid(guestUid);
        ocmTrListReservedGuest.setGroupUid(0);
        ocmTrListReservedGuest.setOccStautsId(bookingHeader.getOccStautsId());

        ocmTrListReservedGuest.setArrPickReq(String.valueOf(bookInputDataDto.getArrPickReq() == ' ' ?
                bookInputDataDto.getArrPickReq() : 'N'));

        ocmTrListReservedGuest.setArrMode("N");
        ocmTrListReservedGuest.setArrModeRefNo("");
        ocmTrListReservedGuest.setArrPickedUp("N");

        ocmTrListReservedGuest.setDepDropReq(String.valueOf(bookInputDataDto.getDepDropReq() == ' ' ?
                bookInputDataDto.getDepDropReq() : 'N'));

        ocmTrListReservedGuest.setDepMode("N");
        ocmTrListReservedGuest.setDepDropped("N");

        ocmTrListReservedGuest.setConfirmMailSent(String.valueOf(bookInputDataDto.getConfMailSent() == ' ' ?
                bookInputDataDto.getConfMailSent() : 'N'));

        ocmTrListReservedGuest.setIsRoomPicked("Y");
        ocmTrListReservedGuest.setIsRoomCxld("N");
        ocmTrListReservedGuest.setIsCheckedIn("N");
        ocmTrListReservedGuest.setIsCheckedOut("N");
        ocmTrListReservedGuest.setIsUpsell("N");
        ocmTrListReservedGuest.setRoomNo(bookInputDataDto.getRoomNumber());
        ocmTrListReservedGuest.setMealPlanCode(bookInputDataDto.getMealPlanCode());
        ocmTrListReservedGuest.setRateCode(bookInputDataDto.getRateCode());
        ocmTrListReservedGuest.setRoomRate(bookInputDataDto.getRoomRate());
        ocmTrListReservedGuest.setOccInd(ocmTrBkgBlkDailyDao.getFirstByOrderByBkgBlkDailyIdDesc().getOccInd());
        ocmTrListReservedGuest.setCurCode(bookInputDataDto.getCurCode());
        ocmTrListReservedGuest.setUpgradedRoomRate(bookInputDataDto.getRoomRate());
        ocmTrListReservedGuest.setStatusEdit("Y");
        ocmTrListReservedGuest.setCrDatetime(createdDateTime(timeZone));
        ocmTrListReservedGuest.setCrUserUid(loginDetails.getUserId());
        ocmTrListReservedGuest.setCrSessionId(loginDetails.getSessionId());

        ocmTrReservedGuestsDao.save(ocmTrListReservedGuest);

        guestUid = ocmTrReservedGuestsDao.getLastEntry().getResvGUid();
        OcmTrBkgVstBilling ocmTrBkgVstBilling = new OcmTrBkgVstBilling();

        ocmTrBkgVstBilling.setBkgUid(bookingHeader.getBkgUid());
        ocmTrBkgVstBilling.setResvGUid(guestUid);
        ocmTrBkgVstBilling.setUnitCode(loginDetails.getUnitCode());
        ocmTrBkgVstBilling.setStatusCreditAllowed("N");
        ocmTrBkgVstBilling.setStatusCashOnly("N");
        ocmTrBkgVstBilling.setStatusBlacklist("N");
        ocmTrBkgVstBilling.setCreditLimit(0.00f);
        ocmTrBkgVstBilling.setGtdResv(bookInputDataDto.getGtdRsrved());
        ocmTrBkgVstBilling.setRoomUpgradeInd("N");
        ocmTrBkgVstBilling.setGtdId(bookInputDataDto.getGtdId());
        ocmTrBkgVstBilling.setCrDatetime(createdDateTime(timeZone));
        ocmTrBkgVstBilling.setCrUserUid(loginDetails.getUserId());
        ocmTrBkgVstBilling.setCrSessionId(loginDetails.getSessionId());
        ocmTrBkgVstBilling.setPayCode(bookInputDataDto.getPayCode());
        ocmTrBkgVstBilling.setCurCode(bookInputDataDto.getCurCode());
        ocmTrBkgVstBilling.setBillingInstGuest(bookInputDataDto.getBillingInstGuest());
        ocmTrBkgVstBilling.setBillingRemarkHotel(bookInputDataDto.getBillingRemarkHotel());
        ocmTrBkgVstBilling.setStatusCashOnly(String.valueOf(bookInputDataDto.getCashOnly()));
        ocmTrBkgVstBilling.setAllowPos(String.valueOf(bookInputDataDto.getAllowPOS()));

        ocmBkgBillingDao.save(ocmTrBkgVstBilling);

        OcmTrBkgVstMisStats ocmTrBkgVstMisStats = new OcmTrBkgVstMisStats();

        ocmTrBkgVstMisStats.setUnitCode(loginDetails.getUnitCode());
        ocmTrBkgVstMisStats.setResvGUid(guestUid);
        ocmTrBkgVstMisStats.setBkgUid(bookingHeader.getBkgUid());
        ocmTrBkgVstMisStats.setOccTypeId(bookInputDataDto.getOccTypeId());
        ocmTrBkgVstMisStats.setIsWalkinn(String.valueOf(bookInputDataDto.getIsWalkin()));
        ocmTrBkgVstMisStats.setDomicileApplytoall(bookInputDataDto.getDomicile());
        ocmTrBkgVstMisStats.setNationality(bookInputDataDto.getNationality());
        ocmTrBkgVstMisStats.setNationalityApplytoall("Y");
        ocmTrBkgVstMisStats.setOccTypeId(bookInputDataDto.getOccTypeId());
        ocmTrBkgVstMisStats.setOccRmType(bookInputDataDto.getOccRoomType());
        ocmTrBkgVstMisStats.setDomicile(bookInputDataDto.getDomicile());
        ocmTrBkgVstMisStats.setDomicileApplytoall("N");
        ocmTrBkgVstMisStats.setCrDatetime(createdDateTime(timeZone));
        ocmTrBkgVstMisStats.setRateCode(bookInputDataDto.getRateCode());
        ocmTrBkgVstMisStats.setCrUserUid(loginDetails.getUserId());
        ocmTrBkgVstMisStats.setCrSessionId(loginDetails.getSessionId());
        ocmTrBkgVstMisStats.setOccInd(bookInputDataDto.getOccInd());
        ocmTrBkgVstMisStats.setMisMs(bookInputDataDto.getMarketSegment());
        ocmTrBkgVstMisStats.setMisBs(bookInputDataDto.getBkgGenSource());
        ocmTrBkgVstMisStats.setMisGc(bookInputDataDto.getGuestClass());
        ocmTrBkgVstMisStats.setMisSb(bookInputDataDto.getSrcOfReservation());
        ocmTrBkgVstMisStats.setMisSalesExe(bookInputDataDto.getSalesExecutive());

        ocmTrBkgVstMisStatsDao.save(ocmTrBkgVstMisStats);

        OcmTrBkgVstPax ocmTrBkgVstPax = new OcmTrBkgVstPax();

        ocmTrBkgVstPax.setUnitCode(loginDetails.getUnitCode());
        ocmTrBkgVstPax.setResvGUid(guestUid);
        ocmTrBkgVstPax.setBkgUid(bookingHeader.getBkgUid());
        ocmTrBkgVstPax.setInHouseUid(null);
        ocmTrBkgVstPax.setPaxYt(bookInputDataDto.getPaxYt());
        ocmTrBkgVstPax.setPaxAd(bookInputDataDto.getPaxAd());
        ocmTrBkgVstPax.setPaxCh(bookInputDataDto.getPaxCh());
        ocmTrBkgVstPax.setPaxExAd(0);
        ocmTrBkgVstPax.setPaxExCh(0);
        ocmTrBkgVstPax.setPaxExYt(0);
        ocmTrBkgVstPax.setCrDatetime(createdDateTime(timeZone));
        ocmTrBkgVstPax.setCrUserUid(loginDetails.getUserId());
        ocmTrBkgVstPax.setCrSessionId(loginDetails.getSessionId());

        ocmTrBkgVstPaxDao.save(ocmTrBkgVstPax);

        if(bookInputDataDto.getSplSrvType() != null) {
            OcmTrBkgVstSplServiceRange ocmTrBkgVstSplServiceRange = new OcmTrBkgVstSplServiceRange();

            ocmTrBkgVstSplServiceRange.setUnitCode(loginDetails.getUnitCode());
            ocmTrBkgVstSplServiceRange.setResvGUid(guestUid);
            ocmTrBkgVstSplServiceRange.setBkgUid(bookingHeader.getBkgUid());
            ocmTrBkgVstSplServiceRange.setInHouseUid(null);
            ocmTrBkgVstSplServiceRange.setDateStart(new Date(bookInputDataDto.getArrivalDate()));
            ocmTrBkgVstSplServiceRange.setDateEnd(new Date(bookInputDataDto.getDepartureDate()));
            ocmTrBkgVstSplServiceRange.setSplSrvType(bookInputDataDto.getSplSrvType());
            ocmTrBkgVstSplServiceRange.setCurCode(bookInputDataDto.getCurCode());
            ocmTrBkgVstSplServiceRange.setPaxAd(bookInputDataDto.getPaxAd());
            ocmTrBkgVstSplServiceRange.setPaxYt(bookInputDataDto.getPaxYt());
            ocmTrBkgVstSplServiceRange.setPaxCh(bookInputDataDto.getPaxCh());
            ocmTrBkgVstSplServiceRange.setPaxExAd(0);
            ocmTrBkgVstSplServiceRange.setPaxExCh(0);
            ocmTrBkgVstSplServiceRange.setPaxExYt(0);
            ocmTrBkgVstSplServiceRange.setCrDatetime(createdDateTime(timeZone));
            ocmTrBkgVstSplServiceRange.setCrUserUid(loginDetails.getUserId());
            ocmTrBkgVstSplServiceRange.setCrSessionId(loginDetails.getSessionId());

            ocmTrBkgVstSplServiceRangeDao.save(ocmTrBkgVstSplServiceRange);
        }

        if(bookInputDataDto.getMealPlanCode() != null) {
            OcmTrBkgVstMealPlanRange ocmTrBkgVstMealPlanRange = new OcmTrBkgVstMealPlanRange();
            ocmTrBkgVstMealPlanRange.setUnitCode(loginDetails.getUnitCode());
            ocmTrBkgVstMealPlanRange.setResvGUid(guestUid);
            ocmTrBkgVstMealPlanRange.setBkgUid(bookingHeader.getBkgUid());
            ocmTrBkgVstMealPlanRange.setInHouseUid(null);
            ocmTrBkgVstMealPlanRange.setDateStart(new Date(bookInputDataDto.getArrivalDate()));
            ocmTrBkgVstMealPlanRange.setDateEnd(new Date(bookInputDataDto.getDepartureDate()));
            ocmTrBkgVstMealPlanRange.setCurCode(bookInputDataDto.getCurCode());
            ocmTrBkgVstMealPlanRange.setMealPlanCode(bookInputDataDto.getMealPlanCode());
            ocmTrBkgVstMealPlanRange.setPaxAd(bookInputDataDto.getPaxAd());
            ocmTrBkgVstMealPlanRange.setPaxYt(bookInputDataDto.getPaxYt());
            ocmTrBkgVstMealPlanRange.setPaxCh(bookInputDataDto.getPaxCh());
            ocmTrBkgVstMealPlanRange.setPaxExAd(0);
            ocmTrBkgVstMealPlanRange.setPaxExCh(0);
            ocmTrBkgVstMealPlanRange.setPaxExYt(0);
            ocmTrBkgVstMealPlanRange.setCrDatetime(createdDateTime(timeZone));
            ocmTrBkgVstMealPlanRange.setCrUserUid(loginDetails.getUserId());
            ocmTrBkgVstMealPlanRange.setCrSessionId(loginDetails.getSessionId());

            ocmTrBkgVstMealPlanRangeDao.save(ocmTrBkgVstMealPlanRange);
        }

        PropagationData propagationData = new PropagationData();
        propagationData.setResvGUid(guestUid);
        propagationData.setBkgNbr(getOldDocumentSeqNumber);
        propagationData.setBkgUid(bookingHeader.getBkgUid());
        propagationData.setArrivalDate(bookInputDataDto.getArrivalDate());
        propagationData.setDepartureDate(bookInputDataDto.getDepartureDate());
        propagationData.setMealPlanCode(bookInputDataDto.getMealPlanCode());
        propagationData.setSplSrvType(bookInputDataDto.getSplSrvType());
        propagationData.setCurCode(bookInputDataDto.getCurCode());
        propagationData.setRateCode(bookInputDataDto.getRateCode());
        propagationData.setRoomRate(bookInputDataDto.getRoomRate());
        propagationData.setOccInd(bookInputDataDto.getOccInd());
        propagationData.setPaxAd(bookInputDataDto.getPaxAd());
        propagationData.setPaxCh(bookInputDataDto.getPaxCh());
        propagationData.setPaxYt(bookInputDataDto.getPaxYt());

        return propagationData;
    }

    private static long daysBetween(Date one, Date two) {
        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }

    private LocalDate getCurrentDateTimeByTimeZone(String loggedInTimeZone) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone(loggedInTimeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate dateTime = LocalDate.from(LocalDateTime.parse(df.format(date), formatter));
        return dateTime;
    }

    private LocalDateTime createdDateTime(String loggedInTimeZone) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone(loggedInTimeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.from(LocalDateTime.parse(df.format(date), formatter));
        return dateTime;
    }
}
