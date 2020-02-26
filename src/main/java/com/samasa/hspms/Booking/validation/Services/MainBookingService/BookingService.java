package com.samasa.hspms.Booking.validation.Services.MainBookingService;

import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.Booking.validation.Dto.Propagation.PropagationData;
import com.samasa.hspms.Booking.validation.Mapper.BookingSectionMapper;
import com.samasa.hspms.Booking.validation.Services.CortaService.CortaService;
import com.samasa.hspms.Booking.validation.Services.RoomBookingService.RoomBookingService;
import com.samasa.hspms.Booking.validation.Services.RoomDailyRate.RoomRateDaily;
import com.samasa.hspms.Booking.validation.Services.RoomNoAvailService.RoomNoAvailService;
import com.samasa.hspms.Booking.validation.Services.RoomTypeService.RoomTypeService;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.guest.Services.GuestAccountService;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    BookingSectionMapper bookingSectionMapper;
    CortaService cortaService;
    MessageCodeService messageCodeService;
    RoomTypeService roomTypeService;
    RoomNoAvailService roomNoAvailService;
    RoomRateDaily roomRateDaily;
    RoomBookingService roomBookingService;
    GuestAccountService guestAccountService;

    public BookingService(BookingSectionMapper bookingSectionMapper,
                          CortaService cortaService,
                          MessageCodeService messageCodeService,
                          RoomTypeService roomTypeService,
                          RoomNoAvailService roomNoAvailService,
                          RoomRateDaily roomRateDaily,
                          RoomBookingService roomBookingService,
                          GuestAccountService guestAccountService) {

        this.bookingSectionMapper = bookingSectionMapper;
        this.cortaService = cortaService;
        this.messageCodeService = messageCodeService;
        this.roomTypeService = roomTypeService;
        this.roomNoAvailService = roomNoAvailService;
        this.roomRateDaily = roomRateDaily;
        this.roomBookingService = roomBookingService;
        this.guestAccountService = guestAccountService;
    }

    public PropagationData guestReservation(BookInputDataDto bookInputDataDto,
                                            LoginDetails loginDetails, String timeZone) throws Exception {

        int guestAcId = guestAccountService.saveGuestAccount(bookInputDataDto, loginDetails);
        return roomBookingService.bookRoom(bookInputDataDto, loginDetails, guestAcId, timeZone);
    }
}
