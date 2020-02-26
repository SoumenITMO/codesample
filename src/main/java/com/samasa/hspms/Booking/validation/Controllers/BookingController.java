package com.samasa.hspms.Booking.validation.Controllers;

import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.Booking.validation.Dto.Propagation.PropagationData;
import com.samasa.hspms.Booking.validation.Dto.Propagation.PropagationDataCallBack;
import com.samasa.hspms.Booking.validation.Services.BookingSearchService.BookingSearchService;
import com.samasa.hspms.Booking.validation.Services.BookingUpdate.BookingUpdateService;
import com.samasa.hspms.Booking.validation.Services.MainBookingService.BookingService;
import com.samasa.hspms.Booking.validation.Services.ReservationValidation.ReservationValidation;
import com.samasa.hspms.Booking.validation.Services.RoomBookingService.Propagation;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.common.dto.RespEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;

@RestController
public class BookingController {

    @Autowired
    ReservationValidation reservationValidation;

    @Autowired
    BookingService bookingService;

    @Autowired
    private Propagation propagation;

    @Autowired
    private BookingUpdateService bookingUpdateService;

    @Autowired
    private BookingSearchService bookingSearchService;

    @RequestMapping(value = "/quickreservation", method = RequestMethod.POST)
    public RespEntity<String> quickReservation(@RequestAttribute("loginDetails") LoginDetails loginDetails,
                                               @RequestBody BookInputDataDto bookInputDataDto,
                                               @RequestHeader("unitTimeZone") String timeZone) throws Exception {

        String status = reservationValidation.validateBookingData(bookInputDataDto, loginDetails, timeZone);
        PropagationDataCallBack propagationDataCallBack = new PropagationDataCallBack();

        if(status.equals("200")) {
            propagationDataCallBack.setStatus(status);
            propagationDataCallBack.setPropagationData(bookingService.guestReservation(bookInputDataDto, loginDetails, timeZone));
        } else  {
            propagationDataCallBack.setStatus(status);
        }
        return new RespEntity(200, propagationDataCallBack);
    }

    @RequestMapping(value = "/dopropagation", method = RequestMethod.POST)
    public RespEntity<String> doPropagation(@RequestAttribute("loginDetails") LoginDetails loginDetails,
                                               @RequestBody PropagationData propagationData,
                                               @RequestHeader("unitTimeZone") String timeZone) {

        propagation.doPropagation(timeZone, loginDetails, propagationData);
        return new RespEntity(200, "SUCCESS");
    }

    @RequestMapping(value = "/bookinginfo/{bkgnbr}", method = RequestMethod.GET)
    public RespEntity<String> bookinginfo(@RequestAttribute("loginDetails") LoginDetails loginDetails,
                                            @PathVariable("bkgnbr")String bkngNbr) throws ParseException {

        return new RespEntity(200, bookingSearchService.getBookingInfo(loginDetails, bkngNbr));
    }

    @RequestMapping(value = "/updatebooking", method = RequestMethod.PUT)
    public RespEntity updateBooking(@RequestAttribute("loginDetails") LoginDetails loginDetails,
                                    @RequestParam("bkgnbr")String bkngNbr,
                                    @RequestParam("bkguid")Integer bkgUid,
                                    @RequestParam("oldnfrmbkd")Integer oldnfRoomBkd,
                                    @RequestParam("nfrmbkd")Integer nfRoomBkd,
                                    @RequestParam("oldarrdate")String oldArrDate,
                                    @RequestParam("newarrdate")String newArrDate,
                                    @RequestParam("olddepdate")String oldDepDate,
                                    @RequestParam("newdepdate")String newDepDate,
                                    @RequestParam("oldroomtype")String oldRoomType,
                                    @RequestParam("occroomtype")String newRoomTyp,
                                    @RequestParam("ratecode")String rateCode,
                                    @RequestParam("occstatusid")String occStatusId,
                                    @RequestParam("occind")String occInd,
                                    @RequestParam("oldroomnumber")String oldroomNumber,
                                    @RequestParam("roomnumber")String roomNumber,
                                    @RequestParam("curcode")String curCode,
                                    @RequestParam("roomrate")String roomRate,
                                    @RequestParam("mealplancode")String mealPlanCode,
                                    @RequestParam("splsrvtype")String splSrvType,
                                    @RequestParam("paxad")String paxAd,
                                    @RequestParam("paxyt")String paxYt,
                                    @RequestParam("paxch")String paxCh,
                                    @RequestParam("cashonly")String cashOnly,
                                    @RequestParam("allowpos")String allowPOS,
                                    @RequestParam("paycode")String payCode,
                                    @RequestParam("billinstguest")String billingInstGuest,
                                    @RequestHeader("unitTimeZone")String timeZone) throws Exception {

        BookInputDataDto bookInputDataDto = new BookInputDataDto();

        bookInputDataDto.setnFRoomBooked(nfRoomBkd);
        bookInputDataDto.setArrivalDate(Long.parseLong(newArrDate));
        bookInputDataDto.setDepartureDate(Long.parseLong(newDepDate));
        bookInputDataDto.setOccRoomType(newRoomTyp);
        bookInputDataDto.setOccInd(occInd);
        bookInputDataDto.setRoomNumber(roomNumber);
        bookInputDataDto.setRateCode(rateCode);
        bookInputDataDto.setCurCode(curCode);
        bookInputDataDto.setRoomRate(Float.parseFloat(roomRate));
        bookInputDataDto.setMealPlanCode(mealPlanCode);

        String status = reservationValidation.validateBookingData(bookInputDataDto, loginDetails, "");
        try {
            bookingUpdateService.updateBooking(loginDetails, bkngNbr, Long.parseLong(oldArrDate), Long.parseLong(newArrDate),
                    Long.parseLong(oldDepDate), Long.parseLong(newDepDate), oldRoomType, newRoomTyp, oldnfRoomBkd, nfRoomBkd,
                    oldroomNumber, roomNumber, mealPlanCode, rateCode, Float.parseFloat(roomRate), curCode, occInd,
                    Integer.parseInt(paxAd), Integer.parseInt(paxYt), Integer.parseInt(paxCh), payCode, billingInstGuest,
                    cashOnly, allowPOS, occStatusId, timeZone, bkgUid);
        } catch (NumberFormatException nfe){}
        return new RespEntity(200, status);
    }
}
