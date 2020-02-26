package com.samasa.hspms.Booking.validation.Services.ReservationValidation;

import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.Booking.validation.Mapper.BookingSectionMapper;
import com.samasa.hspms.Booking.validation.Services.CortaService.CortaService;
import com.samasa.hspms.Booking.validation.Services.MainBookingService.BookingService;
import com.samasa.hspms.Booking.validation.Services.MainBookingService.MessageCodeService;
import com.samasa.hspms.Booking.validation.Services.RoomBookingService.RoomBookingService;
import com.samasa.hspms.Booking.validation.Services.RoomDailyRate.RoomRateDaily;
import com.samasa.hspms.Booking.validation.Services.RoomNoAvailService.RoomNoAvailService;
import com.samasa.hspms.Booking.validation.Services.RoomTypeService.RoomTypeService;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.guest.Services.GuestAccountService;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class ReservationValidation {

    BookingSectionMapper bookingSectionMapper;
    CortaService cortaService;
    MessageCodeService messageCodeService;
    RoomTypeService roomTypeService;
    RoomNoAvailService roomNoAvailService;
    RoomRateDaily roomRateDaily;
    RoomBookingService roomBookingService;
    GuestAccountService guestAccountService;
    BookingService bookingService;

    public ReservationValidation(BookingSectionMapper bookingSectionMapper,
                                 CortaService cortaService,
                                 MessageCodeService messageCodeService,
                                 RoomTypeService roomTypeService,
                                 RoomNoAvailService roomNoAvailService,
                                 RoomRateDaily roomRateDaily,
                                 RoomBookingService roomBookingService,
                                 GuestAccountService guestAccountService,
                                 BookingService bookingService) {
        this.bookingSectionMapper = bookingSectionMapper;
        this.cortaService = cortaService;
        this.messageCodeService = messageCodeService;
        this.roomTypeService = roomTypeService;
        this.roomNoAvailService = roomNoAvailService;
        this.roomRateDaily = roomRateDaily;
        this.roomBookingService = roomBookingService;
        this.guestAccountService = guestAccountService;
        this.bookingService = bookingService;
    }

    public String validateBookingData(BookInputDataDto bookInputDataDto, LoginDetails loginDetails, String timeZone)
            throws Exception {

        if (!cortaService.checkCortaAccount(bookingSectionMapper
                .mappingMainDtoWithCortaAccountDto(bookInputDataDto), loginDetails)) {
            if (bookInputDataDto.getCortaUid() != 0) {
                return messageCodeService.getCortaUIDMsgCode(cortaService.checkCortaAccount(bookingSectionMapper
                        .mappingMainDtoWithCortaAccountDto(bookInputDataDto), loginDetails));
            }
        }

        if (!roomTypeService.checkRoomTypeAvail(bookInputDataDto, loginDetails)) {
            return messageCodeService.getRoomAvailStatusCode(roomTypeService
                    .checkRoomTypeAvail(bookInputDataDto, loginDetails));

        } else if (!roomTypeService.checkRoomTypeAvailByStopSell(bookInputDataDto, loginDetails)) {
            return messageCodeService.getRoomAvailByStopSellStatusCode(roomTypeService
                    .checkRoomTypeAvailByStopSell(bookInputDataDto, loginDetails));

        } else if (!roomTypeService.checkRoomTypeAvailByCldArrv(bookInputDataDto, loginDetails)) {
            return messageCodeService.getRoomAvailByClosedForArriv(roomTypeService
                    .checkRoomTypeAvailByCldArrv(bookInputDataDto, loginDetails));
        } else if (!roomTypeService.checkRoomTypeAvailByCldDepar(bookInputDataDto, loginDetails)) {
            return messageCodeService.getRoomAvailByClosedForDepart(roomTypeService
                    .checkRoomTypeAvailByCldDepar(bookInputDataDto, loginDetails));
        }

        if (bookInputDataDto.getRateCode() != null) {
            if (!roomRateDaily.checkDailyRoomByRateCode(bookInputDataDto, loginDetails)) {
                return messageCodeService.getDailyRoomByRateCodeAvail(roomRateDaily
                        .checkDailyRoomByRateCode(bookInputDataDto, loginDetails));
            }
        }

        if (bookInputDataDto.getRoomNumber() != null) {
            if (!roomNoAvailService.checkRoomNoAvail(bookInputDataDto, loginDetails)) {
                return messageCodeService.getRoomNoAvail(roomNoAvailService
                        .checkRoomNoAvail(bookInputDataDto, loginDetails));
            }
        }

        if (bookInputDataDto.getCurCode() != null) {
            if (!roomRateDaily.checkDailyRoomByCurCode(bookInputDataDto, loginDetails)) {
                return messageCodeService.getDailyRoomByCurCode(roomRateDaily
                        .checkDailyRoomByCurCode(bookInputDataDto, loginDetails));
            }
        }

        if (bookInputDataDto.getRoomRate() != 0) {
            if (!roomRateDaily.checkDailyRoomByRoomRate(bookInputDataDto, loginDetails)) {
                return messageCodeService.getDailyRoomByRoomRate(roomRateDaily
                        .checkDailyRoomByRoomRate(bookInputDataDto, loginDetails));
            }
        }


        if (bookInputDataDto.getMealPlanCode() != null) {
            if (!roomRateDaily.checkDailyRoomByMealCode(bookInputDataDto, loginDetails)) {
                return messageCodeService.getDailyRoomByMealCodeAvail(roomRateDaily
                        .checkDailyRoomByMealCode(bookInputDataDto, loginDetails));
            }
        }

        if (bookInputDataDto.getSplSrvType() != null) {
            if (!roomRateDaily.checkDailyRoomBySplSrvType(bookInputDataDto, loginDetails)) {
                return messageCodeService.getDailyRoomBySplSrvcType(roomRateDaily
                        .checkDailyRoomBySplSrvType(bookInputDataDto, loginDetails));
            }
        }
        return "200";
    }
}
