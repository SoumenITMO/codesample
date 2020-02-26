package com.samasa.hspms.Booking.validation.Services.RoomBookingService;

import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstMealPlanDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstRateDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstRevDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstSplServiceDailyDao;
import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstMealPlanDaily;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstRateDaily;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstRevDaily;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstSplServiceDaily;
import com.samasa.hspms.common.dto.LoginDetails;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@Service
@Transactional
public class RoomBookingOtherTablesDataInsert {

    private OcmTrBkgVstMealPlanDailyDao ocmTrBkgVstMealPlanDailyDao;
    private OcmTrBkgVstRateDailyDao ocmTrBkgVstRateDailyDao;
    private OcmTrBkgVstRevDailyDao ocmTrBkgVstRevDailyDao;
    private OcmTrBkgVstSplServiceDailyDao ocmTrBkgVstSplServiceDailyDao;

    public RoomBookingOtherTablesDataInsert(OcmTrBkgVstMealPlanDailyDao ocmTrBkgVstMealPlanDailyDao,
                                            OcmTrBkgVstRateDailyDao ocmTrBkgVstRateDailyDao,
                                            OcmTrBkgVstRevDailyDao ocmTrBkgVstRevDailyDao,
                                            OcmTrBkgVstSplServiceDailyDao ocmTrBkgVstSplServiceDailyDao) {

        this.ocmTrBkgVstMealPlanDailyDao = ocmTrBkgVstMealPlanDailyDao;
        this.ocmTrBkgVstRateDailyDao = ocmTrBkgVstRateDailyDao;
        this.ocmTrBkgVstRevDailyDao = ocmTrBkgVstRevDailyDao;
        this.ocmTrBkgVstSplServiceDailyDao = ocmTrBkgVstSplServiceDailyDao;
    }

    public void saveOtherBookingTables(String timeZone, LoginDetails loginDetails, BookInputDataDto bookInputDataDto,
                                       int bkgUid, int resvGuid) {

        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();
        Calendar calendarNext = Calendar.getInstance();
        Date busDate;
        Date cusmDate;

        for (int day = 0; daysBetween(fromDate, toDate) > day; day++) {
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();

            calendarNext.setTime(busDate);
            calendarNext.add(Calendar.DATE, 1);
            cusmDate = calendarNext.getTime();

            if(bookInputDataDto.getMealPlanCode() != null) {
                OcmTrBkgVstMealPlanDaily ocmTrBkgVstMealPlanDaily = new OcmTrBkgVstMealPlanDaily();

                ocmTrBkgVstMealPlanDaily.setUnitCode(loginDetails.getUnitCode());
                ocmTrBkgVstMealPlanDaily.setResvGUid(resvGuid);
                ocmTrBkgVstMealPlanDaily.setBkgUid(bkgUid);
                ocmTrBkgVstMealPlanDaily.setInHouseUid(null);
                ocmTrBkgVstMealPlanDaily.setMealPlanCode(bookInputDataDto.getMealPlanCode());
                ocmTrBkgVstMealPlanDaily.setBusDate(busDate);
                ocmTrBkgVstMealPlanDaily.setCusmDate(cusmDate);
                ocmTrBkgVstMealPlanDaily.setCurCode(bookInputDataDto.getCurCode());
                ocmTrBkgVstMealPlanDaily.setPaxAd(null);
                ocmTrBkgVstMealPlanDaily.setPaxYt(0);
                ocmTrBkgVstMealPlanDaily.setPaxCh(0);
                ocmTrBkgVstMealPlanDaily.setPaxExAd(0);
                ocmTrBkgVstMealPlanDaily.setPaxExCh(0);
                ocmTrBkgVstMealPlanDaily.setPaxExYt(0);
                ocmTrBkgVstMealPlanDaily.setCrDatetime(createdDateTime(timeZone));
                ocmTrBkgVstMealPlanDaily.setCrUserUid(loginDetails.getUserId());
                ocmTrBkgVstMealPlanDaily.setCrSessionId(loginDetails.getSessionId());

                ocmTrBkgVstMealPlanDailyDao.save(ocmTrBkgVstMealPlanDaily);
            }

            if(bookInputDataDto.getSplSrvType() != null) {

                OcmTrBkgVstSplServiceDaily ocmTrBkgVstSplServiceDaily = new OcmTrBkgVstSplServiceDaily();

                ocmTrBkgVstSplServiceDaily.setUnitCode(loginDetails.getUnitCode());
                ocmTrBkgVstSplServiceDaily.setResvGUid(resvGuid);
                ocmTrBkgVstSplServiceDaily.setBkgUid(bkgUid);
                ocmTrBkgVstSplServiceDaily.setInHouseUid(null);
                ocmTrBkgVstSplServiceDaily.setBusDate(busDate);
                ocmTrBkgVstSplServiceDaily.setSplSrvType(bookInputDataDto.getSplSrvType());
                ocmTrBkgVstSplServiceDaily.setCurCode(bookInputDataDto.getCurCode());
                ocmTrBkgVstSplServiceDaily.setPaxAdCount(0);
                ocmTrBkgVstSplServiceDaily.setPaxYtCount(0);
                ocmTrBkgVstSplServiceDaily.setPaxExChCount(0);
                ocmTrBkgVstSplServiceDaily.setPaxChCount(0);
                ocmTrBkgVstSplServiceDaily.setPaxExAdCount(0);
                ocmTrBkgVstSplServiceDaily.setPaxExYtCount(0);
                ocmTrBkgVstSplServiceDaily.setCrDatetime(createdDateTime(timeZone));
                ocmTrBkgVstSplServiceDaily.setCrUserUid(loginDetails.getUserId());
                ocmTrBkgVstSplServiceDaily.setCrSessionId(loginDetails.getSessionId());

                ocmTrBkgVstSplServiceDailyDao.save(ocmTrBkgVstSplServiceDaily);
            }

            OcmTrBkgVstRateDaily ocmTrBkgVstRateDaily = new OcmTrBkgVstRateDaily();

            ocmTrBkgVstRateDaily.setUnitCode(loginDetails.getUnitCode());
            ocmTrBkgVstRateDaily.setResvGUid(resvGuid);
            ocmTrBkgVstRateDaily.setBkgUid(bkgUid);
            ocmTrBkgVstRateDaily.setInHouseUid(null);
            ocmTrBkgVstRateDaily.setMealPlanCode(bookInputDataDto.getMealPlanCode());
            ocmTrBkgVstRateDaily.setBusDate(busDate);
            ocmTrBkgVstRateDaily.setSplSrvType(bookInputDataDto.getSplSrvType());
            ocmTrBkgVstRateDaily.setRoomRate(bookInputDataDto.getRoomRate());
            ocmTrBkgVstRateDaily.setCurCode(bookInputDataDto.getCurCode());
            ocmTrBkgVstRateDaily.setRateCode(bookInputDataDto.getRateCode());
            ocmTrBkgVstRateDaily.setOccInd(bookInputDataDto.getOccInd());
            ocmTrBkgVstRateDaily.setCrDatetime(createdDateTime(timeZone));
            ocmTrBkgVstRateDaily.setCrUserUid(loginDetails.getUserId());
            ocmTrBkgVstRateDaily.setCrSessionId(loginDetails.getSessionId());

            ocmTrBkgVstRateDailyDao.save(ocmTrBkgVstRateDaily);

            OcmTrBkgVstRevDaily ocmTrBkgVstRevDaily = new OcmTrBkgVstRevDaily();
            ocmTrBkgVstRevDaily.setUnitCode(loginDetails.getUnitCode());
            ocmTrBkgVstRevDaily.setBkgUid(bkgUid);
            ocmTrBkgVstRevDaily.setResvGUid(resvGuid);
            ocmTrBkgVstRevDaily.setBusDate(busDate);
            ocmTrBkgVstRevDaily.setCurCode(bookInputDataDto.getCurCode());
            ocmTrBkgVstRevDaily.setOprCurCode("No");
            ocmTrBkgVstRevDaily.setFxOprCur(0.00f);
            ocmTrBkgVstRevDaily.setRoe(0.00f);
            ocmTrBkgVstRevDaily.setRevpayCode("No");
            ocmTrBkgVstRevDaily.setDayRateGross(0.00f);
            ocmTrBkgVstRevDaily.setDayRateNet(0.00f);
            ocmTrBkgVstRevDaily.setUnitQty(4);
            ocmTrBkgVstRevDaily.setMealPlanCode(bookInputDataDto.getMealPlanCode());
            ocmTrBkgVstRevDaily.setMealPlanInclusive("N");
            ocmTrBkgVstRevDaily.setSplSrvType(bookInputDataDto.getSplSrvType());
            ocmTrBkgVstRevDaily.setSplSrvInclusive("N");
            ocmTrBkgVstRevDaily.setOccInd(bookInputDataDto.getOccInd());
            ocmTrBkgVstRevDaily.setCrDatetime(createdDateTime(timeZone));
            ocmTrBkgVstRevDaily.setCrUserUid(loginDetails.getUserId());
            ocmTrBkgVstRevDaily.setCrSessionId(loginDetails.getSessionId());

            ocmTrBkgVstRevDailyDao.save(ocmTrBkgVstRevDaily);
        }
    }

    private static long daysBetween(Date one, Date two) {

        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
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
