package com.samasa.hspms.Booking.validation.Services.RoomNoAvailService;
import com.samasa.hspms.Booking.validation.Dao.RoomTypeAvailableNoDao;
import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.Booking.validation.Entity.RoomTypeNoAvailable.TrOcmRoomNoAvalRoomType;
import com.samasa.hspms.common.dto.LoginDetails;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class RoomNoAvailService {

    private RoomTypeAvailableNoDao roomTypeAvailableNoDao;

    public RoomNoAvailService(RoomTypeAvailableNoDao roomTypeAvailableNoDao) {
        this.roomTypeAvailableNoDao = roomTypeAvailableNoDao;
    }

    public boolean checkRoomNoAvail(BookInputDataDto bookInputDataDto, LoginDetails loginDetails) {

        boolean roomNoAvail = false;
        Date fromDate = new Date(Long.parseLong(bookInputDataDto.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(bookInputDataDto.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();

        for (int day = 0; daysBetween(fromDate, toDate) > day; day++) {
            Date busDate;
            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();

            TrOcmRoomNoAvalRoomType trOcmRoomNoAval = roomTypeAvailableNoDao.
                    getFirstByBusDateAndRoomNoAndUnitCode(busDate, bookInputDataDto.getRoomNumber(),
                            loginDetails.getUnitCode());
            if(trOcmRoomNoAval != null) {
                if(trOcmRoomNoAval.getRoomStautsId().equals("VA")) {
                        roomNoAvail = true;
                    } else {
                        roomNoAvail = false;
                        break;
                    }
            }
        }
        return roomNoAvail;
    }

    private static long daysBetween(Date one, Date two) {

        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }
}
