package com.samasa.hspms.Booking.validation.Services.RoomTypeService;

import com.samasa.hspms.Booking.validation.Dao.RoomTypeAvailableDao;
import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.Booking.validation.Entity.RoomTypeAvailable.TrOcmRoomTypeAvalEntity;
import com.samasa.hspms.Booking.validation.Mapper.BookingSectionMapper;
import com.samasa.hspms.common.dto.LoginDetails;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class RoomTypeService {

    private RoomTypeAvailableDao roomTypeAvailableDao;
    private BookingSectionMapper bookingSectionMapper;

    public RoomTypeService(RoomTypeAvailableDao roomTypeAvailableDao,
                           BookingSectionMapper bookingSectionMapper) {

        this.bookingSectionMapper = bookingSectionMapper;
        this.roomTypeAvailableDao = roomTypeAvailableDao;
    }

    public boolean checkRoomTypeAvail(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) throws ParseException {

        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();
        boolean roomAvail = false;

        for (int day = 0; daysBetween(fromDate, toDate) > day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();

            TrOcmRoomTypeAvalEntity trOcmRoomTypeAvalEntity = roomTypeAvailableDao.
                    getFirstByBusDateAndOccRmTypeAndUnitCode(busDate, bookInputDataDto.getOccRoomType(),
                            loginDetails.getUnitCode());
           if(trOcmRoomTypeAvalEntity != null) {
                   roomAvail = trOcmRoomTypeAvalEntity.getAvalCount() >= bookInputDataDto.getnFRoomBooked();
           } else {
               roomAvail = false;
           }
        }
        return roomAvail;
    }

    public boolean checkRoomTypeAvailByStopSell(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) {

        boolean roomAvailByStopSell = true;
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();

        for (int day = 0; daysBetween(fromDate, toDate) >= day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();

            try {
                TrOcmRoomTypeAvalEntity trOcmRoomTypeAvalEntity = roomTypeAvailableDao.getFirstByBusDate(busDate);
                if (trOcmRoomTypeAvalEntity.getStopSell().equals("Y")) {
                    roomAvailByStopSell = false;
                    break;
                } else {
                    roomAvailByStopSell = true;
                }
            } catch (NullPointerException epe) {
            }
        }
        return roomAvailByStopSell;
    }

    public boolean checkRoomTypeAvailByCldArrv(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) {

        boolean closedForArrival = true;
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();

        for (int day = 0; daysBetween(fromDate, toDate) >= day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();
            try {
                if (roomTypeAvailableDao.getFirstByBusDate(busDate)
                        .getCldForArr().equals("Y")) {
                    closedForArrival = false;
                    break;
                } else {
                    closedForArrival = true;
                    break;
                }
            } catch (NullPointerException notFound) {
            }
        }
        return closedForArrival;
    }

    public boolean checkRoomTypeAvailByCldDepar(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) {

        boolean closedForDeparture = true;
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();

        for (int day = 0; daysBetween(fromDate, toDate) >= day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();

            try {
                if (roomTypeAvailableDao.getFirstByBusDate(busDate).getCldForDep().equals("Y")) {
                    closedForDeparture = false;
                    break;
                } else {
                    closedForDeparture = true;
                    break;
                }
            } catch (NullPointerException notFound) {
            }
        }
        return closedForDeparture;
    }

    private static long daysBetween(Date one, Date two) {

        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }
}
