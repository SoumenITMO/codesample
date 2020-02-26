package com.samasa.hspms.Booking.validation.Services.RoomDailyRate;

import com.samasa.hspms.Booking.validation.Dao.FrmRateDailyBookingDao;
import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.Booking.validation.Entity.RoomRateDaily.FrmRateDailyBooking;
import com.samasa.hspms.common.dto.LoginDetails;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class RoomRateDaily {

    private FrmRateDailyBookingDao roomRateDailyDao;

    public RoomRateDaily(FrmRateDailyBookingDao roomRateDailyDao) {

        this.roomRateDailyDao = roomRateDailyDao;
    }

    public boolean checkDailyRoomByMealCode(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) {

        boolean dailyRoomAvailByMealCode = false;
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();

        for (int day = 0; daysBetween(fromDate, toDate) >= day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();

                FrmRateDailyBooking frmRateDailyBooking = roomRateDailyDao.getFirstByBusDateAndUnitCode(
                        busDate, loginDetails.getUnitCode());
            try {
                if (frmRateDailyBooking.getMealPlanCode().equals(bookInputDataDto.getMealPlanCode())) {
                    dailyRoomAvailByMealCode = true;
                } else {
                    dailyRoomAvailByMealCode = false;
                }
            } catch (NullPointerException npe) {
                dailyRoomAvailByMealCode = false;
            }
        }
        return dailyRoomAvailByMealCode;
    }

    public boolean checkDailyRoomByRoomRate(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) {

        boolean dailyRoomAvailByRoomRate = false;
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();

        for (int day = 0; daysBetween(fromDate, toDate) >= day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();

            FrmRateDailyBooking frmRateDailyBooking = roomRateDailyDao.getFirstByBusDateAndUnitCode(busDate,
                    loginDetails.getUnitCode());

            if(frmRateDailyBooking != null) {
                if (frmRateDailyBooking.equals(bookInputDataDto.getMealPlanCode()) || (
                        frmRateDailyBooking.getCurCode().equals(bookInputDataDto.getCurCode()) &&
                                frmRateDailyBooking.getRateCode().equals(bookInputDataDto.getRateCode()) &&
                                frmRateDailyBooking.getRoomRate() <= bookInputDataDto.getRoomRate())  &&
                                frmRateDailyBooking.getOccInd().equals(bookInputDataDto.getOccInd()) &&
                                frmRateDailyBooking.getOccRmType().equals(bookInputDataDto.getOccRoomType())) {
                    dailyRoomAvailByRoomRate = true;
                } else {
                    dailyRoomAvailByRoomRate = false;
                }
            }
        }
        return dailyRoomAvailByRoomRate;
    }

    public boolean checkDailyRoomByCurCode(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) {

        boolean dailyRoomAvailByCurCode = false;
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();

        for (int day = 0; daysBetween(fromDate, toDate) >= day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();
            FrmRateDailyBooking frmRateDailyBooking = roomRateDailyDao.getFirstByBusDateAndUnitCodeAndOccInd(busDate,
                    loginDetails.getUnitCode(), bookInputDataDto.getOccInd());

            if(frmRateDailyBooking != null) {
                if (frmRateDailyBooking.equals(bookInputDataDto.getMealPlanCode()) || (
                        frmRateDailyBooking.getCurCode().equals(bookInputDataDto.getCurCode()) &&
                                frmRateDailyBooking.getOccRmType().equals(bookInputDataDto.getOccRoomType()) &&
                                frmRateDailyBooking.getRateCode().equals(bookInputDataDto.getRateCode()) &&
                                frmRateDailyBooking.getOccInd().equals(bookInputDataDto.getOccInd()))
                ) {
                    dailyRoomAvailByCurCode = true;
                } else {
                    dailyRoomAvailByCurCode = false;
                }
            }
        }
        return dailyRoomAvailByCurCode;
    }

    public boolean checkDailyRoomByRateCode(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) {

        boolean dailyRoomAvailByRateCode = false;
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();

        for (int day = 0; daysBetween(fromDate, toDate) >= day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();
            FrmRateDailyBooking frmRateDailyBooking = roomRateDailyDao
                    .getFirstByBusDateAndUnitCodeAndOccIndAndRateCode(busDate, loginDetails.getUnitCode(),
                            bookInputDataDto.getOccInd(), bookInputDataDto.getRateCode());

            if (frmRateDailyBooking != null) {
                dailyRoomAvailByRateCode = true;
            } else {
                dailyRoomAvailByRateCode = false;
            }
        }
        return dailyRoomAvailByRateCode;
    }

    public boolean checkDailyRoomBySplSrvType(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) {

        boolean dailyRoomAvailBySplSrvcType = false;
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();

        for (int day = 0; daysBetween(fromDate, toDate) >= day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();

            try {
                if (roomRateDailyDao.getFirstByBusDateAndUnitCode(busDate, loginDetails.getUnitCode()).getSplSrvType()
                        .equals(bookInputDataDto.getSplSrvType())) {
                    dailyRoomAvailBySplSrvcType = true;
                } else {
                    dailyRoomAvailBySplSrvcType = false;
                }
            } catch (NullPointerException npe) {
            }
        }
        return dailyRoomAvailBySplSrvcType;
    }

    private static long daysBetween(Date one, Date two) {

        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }
}
