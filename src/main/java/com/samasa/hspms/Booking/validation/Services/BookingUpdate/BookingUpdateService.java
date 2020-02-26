package com.samasa.hspms.Booking.validation.Services.BookingUpdate;

import com.samasa.hspms.Booking.validation.Dao.OcmBkgBillingDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgBlkDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgHdrDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgRangeDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstMisStatsDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstPaxDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrReservedGuestsDao;
import com.samasa.hspms.Booking.validation.Dao.RoomTypeAvailableNoDao;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgBlkDaily;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.dao1.RoomTyAvailableDao;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@Transactional
@Service
public class BookingUpdateService {

    private OcmTrBkgBlkDailyDao ocmTrBkgBlkDailyDao;
    private RoomTypeAvailableNoDao roomTypeAvailableNoDao;
    private OcmTrBkgHdrDao ocmTrBkgHdrDao;
    private OcmTrBkgRangeDao ocmTrBkgRangeDao;
    private OcmTrReservedGuestsDao ocmTrReservedGuestsDao;
    private OcmTrBkgVstMisStatsDao ocmTrBkgVstMisStatsDao;
    private OcmTrBkgVstPaxDao ocmTrBkgVstPaxDao;
    private OcmBkgBillingDao ocmBkgBillingDao;
    private RoomTyAvailableDao roomTyAvailableDao;
    public BookingUpdateService(OcmTrBkgBlkDailyDao ocmTrBkgBlkDailyDao,
                                RoomTypeAvailableNoDao roomTypeAvailableNoDao,
                                OcmTrBkgHdrDao ocmTrBkgHdrDao,
                                OcmTrBkgRangeDao ocmTrBkgRangeDao,
                                OcmTrReservedGuestsDao ocmTrReservedGuestsDao,
                                OcmTrBkgVstMisStatsDao ocmTrBkgVstMisStatsDao,
                                OcmTrBkgVstPaxDao ocmTrBkgVstPaxDao,
                                OcmBkgBillingDao ocmBkgBillingDao,
                                RoomTyAvailableDao roomTyAvailableDao) {
        this.ocmTrBkgBlkDailyDao = ocmTrBkgBlkDailyDao;
        this.roomTypeAvailableNoDao = roomTypeAvailableNoDao;
        this.ocmTrBkgHdrDao = ocmTrBkgHdrDao;
        this.ocmTrBkgRangeDao = ocmTrBkgRangeDao;
        this.ocmTrReservedGuestsDao = ocmTrReservedGuestsDao;
        this.ocmTrBkgVstMisStatsDao = ocmTrBkgVstMisStatsDao;
        this.ocmBkgBillingDao = ocmBkgBillingDao;
        this.roomTyAvailableDao = roomTyAvailableDao;
        this.ocmTrBkgVstPaxDao = ocmTrBkgVstPaxDao;
    }

    public void updateBooking(LoginDetails loginDetails, String bkngNbr, Long oldArrDate, Long newArrDate,
                              Long oldDepDate, Long newDepDate, String oldRoomType, String newRoomTyp, Integer oldnfRoom,
                              Integer nfRoom, String oldroomNumber, String newRoomNumber, String mealPlanCode,
                              String rateCode, float roomRate, String curCode, String occInd, Integer paxad,
                              Integer paxyt, Integer paxch, String payCode, String billingInstGuest, String cashOnly,
                              String allowPOS, String occStatusId, String timeZone, Integer bkgUid) {

        Calendar calendar = Calendar.getInstance();
        Date fromDate = new Date(Long.parseLong(oldArrDate.toString()));
        Date toDate = new Date(Long.parseLong(oldDepDate.toString()));
        Date fromDateNew = new Date(Long.parseLong(newArrDate.toString()));
        Date toDateNew = new Date(Long.parseLong(newDepDate.toString()));

        int id = 1;
        for (int day = 0; daysBetween(fromDate, toDate) > day; day++) {
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            Date busDate = calendar.getTime();

            try {
                ocmTrBkgBlkDailyDao.updateBkgBlkDailyTable(loginDetails.getUnitCode(),
                        new SimpleDateFormat("yyyy-MM-dd").parse(new SimpleDateFormat("yyyy-MM-dd")
                                .format(busDate)), oldRoomType);

                if(nfRoom > 0) {
                    roomTyAvailableDao.updateRoomTypeAvailForOldData(new SimpleDateFormat("yyyy-MM-dd")
                            .parse(new SimpleDateFormat("yyyy-MM-dd")
                                    .format(busDate)), loginDetails.getUnitCode(), oldnfRoom, oldRoomType);
                }

                if(bkngNbr != null) {
                    ocmTrBkgHdrDao.updateBookingHdrForCancel(bkngNbr, new Date(), fromDateNew, toDateNew);
                }

                if(oldroomNumber != "") {
                    roomTypeAvailableNoDao.updateRoomNoAvailForCancelBooking(new SimpleDateFormat("yyyy-MM-dd")
                            .parse(new SimpleDateFormat("yyyy-MM-dd")
                                    .format(busDate)), loginDetails.getUnitCode(), oldroomNumber);
                }

                ocmTrBkgRangeDao.updateBkgBlkDaily(fromDateNew, toDateNew, newRoomTyp, mealPlanCode, rateCode, roomRate,
                        curCode, occInd, bkngNbr);

                Integer bachSeqNum = 0;

                try {
                    bachSeqNum = ocmTrBkgBlkDailyDao.getSingleData(busDate, loginDetails.getUnitCode(), bkngNbr)
                            .getBatchSeqId();
                    id++;
                    calendar.setTime(fromDate);
                    calendar.add(Calendar.DATE, day);
                    busDate = calendar.getTime();

                    OcmTrBkgBlkDaily ocmTrBkgBlkDaily = new OcmTrBkgBlkDaily();

                    ocmTrBkgBlkDaily.setBkgNbr(bkngNbr);
                    ocmTrBkgBlkDaily.setBkgBlkDailyId(id);
                    ocmTrBkgBlkDaily.setBatchSeqId(bachSeqNum);
                    ocmTrBkgBlkDaily.setBkgUid(bkgUid);
                    ocmTrBkgBlkDaily.setUnitCode(loginDetails.getUnitCode());
                    ocmTrBkgBlkDaily.setCurCode(curCode);
                    ocmTrBkgBlkDaily.setBkgRangeId(ocmTrBkgRangeDao.getFirstByOrderByBkgBlkRangeIdDesc().getBkgBlkRangeId());
                    ocmTrBkgBlkDaily.setBusDate(busDate);
                    ocmTrBkgBlkDaily.setOccRmType(newRoomTyp);
                    ocmTrBkgBlkDaily.setNfRoomBkd(nfRoom);
                    ocmTrBkgBlkDaily.setMealPlanCode(mealPlanCode);
                    ocmTrBkgBlkDaily.setRateCode(rateCode);
                    ocmTrBkgBlkDaily.setRoomRate(roomRate);
                    ocmTrBkgBlkDaily.setOccInd(occInd);
                    ocmTrBkgBlkDaily.setOccStautsId(occStatusId);
                    ocmTrBkgBlkDaily.setCrUserUid(loginDetails.getUserId());
                    ocmTrBkgBlkDaily.setCrDatetime(createdDateTime(timeZone));
                    ocmTrBkgBlkDaily.setCrSessionId(loginDetails.getSessionId());

                ocmTrBkgBlkDailyDao.save(ocmTrBkgBlkDaily);
                } catch (NullPointerException npe) {}

                if(oldnfRoom > 0) {
                    roomTyAvailableDao.updateRoomTypeAvailForNewData(new SimpleDateFormat("yyyy-MM-dd")
                            .parse(new SimpleDateFormat("yyyy-MM-dd")
                                    .format(busDate)), loginDetails.getUnitCode(), oldnfRoom, oldRoomType);
                }

                if(newRoomNumber != "") {
                    roomTypeAvailableNoDao.updateRoomNoAvailForBooking(new SimpleDateFormat("yyyy-MM-dd")
                            .format(busDate), loginDetails.getUnitCode(), newRoomNumber);
                }

                ocmTrReservedGuestsDao.updateGuestReservedDataForNewBooking(bkngNbr, new SimpleDateFormat("yyyy-MM-dd")
                                .parse(new SimpleDateFormat("yyyy-MM-dd").format(fromDateNew)),
                        new SimpleDateFormat("yyyy-MM-dd").parse(new SimpleDateFormat("yyyy-MM-dd")
                                        .format(toDateNew)), curCode, newRoomNumber, occInd, roomRate);

                ocmTrBkgVstMisStatsDao.updateMistatData(newRoomTyp, rateCode, occInd, bkgUid);
                ocmTrBkgVstPaxDao.updatePaxData(bkgUid, paxad, paxyt, paxch);
                ocmBkgBillingDao.updateBillingTable(payCode, curCode, billingInstGuest, cashOnly, allowPOS, bkgUid);

            } catch (ParseException parseException) {
                System.out.println(parseException.getMessage());
            }
        }
    }

    private LocalDateTime createdDateTime(String loggedInTimeZone) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone(loggedInTimeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.from(LocalDateTime.parse(df.format(date), formatter));
        return dateTime;
    }

    private static long daysBetween(Date one, Date two) {
        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }
}
