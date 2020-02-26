package com.samasa.hspms.Booking.validation.Controllers;

import com.samasa.hspms.Booking.validation.Dto.GuestSearch.GuestSearchDto;
import com.samasa.hspms.Booking.validation.Services.BookingSearchService.BookingSearchService;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.common.dto.RespEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class BookingSearchController {

    @Autowired
    BookingSearchService bookingSearchService;

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public RespEntity searchBooking(@RequestAttribute("loginDetails") LoginDetails loginDetails,
                                    @RequestParam("guestName")String guestName,
                                    @RequestParam("bkgGenSource")String bkgGenSource,
                                    @RequestParam("bkgNbr")String bkgNbr,
                                    @RequestParam("externalBkgRefNo")String externalBkgRefNo,
                                    @RequestParam("indvConfirmNo")Integer indvConfirmNo,
                                    @RequestParam("bkgBlkRangeId")Integer bkgBlkRangeId,
                                    @RequestParam("contactPerMobile")String contactPerMobile,
                                    @RequestParam("contactPerEmail")String contactPerEmail,
                                    @RequestParam("companyTaTo")Integer companyTaTo,
                                    @RequestParam("groupUId")Integer groupUId,
                                    @RequestParam("occRoomType")String occRoomType,
                                    @RequestParam("rateCode")String rateCode,
                                    @RequestParam("primaryInd")Character primaryInd,
                                    @RequestParam("sharesGUid")Integer sharesGUid,
                                    @RequestParam("arrvPickReq")Character arrvPickReq,
                                    @RequestParam("isCheckIn")Character isCheckIn,
                                    @RequestParam("getIsCheckOut")Character IsCheckOut,
                                    @RequestParam("externalProRefNo")String externalProRefNo,
                                    @RequestParam("mealPlanCode")String mealPlanCode,
                                    @RequestParam("profileId")String profileId,
                                    @RequestParam("booker")String booker,
                                    @RequestParam("bookerContactNumber")String bookerContactNumber,
                                    @RequestParam("splSrvType")String splSrvType) {

        GuestSearchDto guestSearchDto = new GuestSearchDto();
        guestSearchDto.setGuestName(guestName);
        guestSearchDto.setBkgGenSource(bkgGenSource);
        guestSearchDto.setBkgNbr(bkgNbr);
        guestSearchDto.setExternalBkgRefNo(externalBkgRefNo);
        guestSearchDto.setIndvConfirmNo(indvConfirmNo);
        guestSearchDto.setBkgBlkRangeId(bkgBlkRangeId);
        guestSearchDto.setContactPerMobile(contactPerMobile);
        guestSearchDto.setContactPerEmail(contactPerEmail);
        guestSearchDto.setCompanyTaTo(companyTaTo);
        guestSearchDto.setGroupUId(groupUId);
        guestSearchDto.setOccRoomType(occRoomType);
        guestSearchDto.setRateCode(rateCode);
        guestSearchDto.setPrimaryInd(primaryInd);
        guestSearchDto.setSharesGUid(sharesGUid);
        guestSearchDto.setArrvPickReq(arrvPickReq);
        guestSearchDto.setIsCheckIn(isCheckIn);
        guestSearchDto.setGetIsCheckOut(IsCheckOut);
        guestSearchDto.setExternalProRefNo(externalProRefNo);
        guestSearchDto.setProfileId(profileId);
        guestSearchDto.setMealPlanCode(mealPlanCode);
        guestSearchDto.setBooker(booker);
        guestSearchDto.setBookerContactNumber(bookerContactNumber);
        guestSearchDto.setSplSrvType(splSrvType);

        return new RespEntity(200, bookingSearchService.searchReservation(loginDetails, guestSearchDto));
    }

    @RequestMapping(value = "/getallmealplancodes", method = RequestMethod.GET)
    public RespEntity getAllMealPlanCode(@RequestAttribute("loginDetails") LoginDetails loginDetails) {

        return new RespEntity(200, bookingSearchService.getAllMealPlanCodes(loginDetails));
    }

    @RequestMapping(value = "/getallratecodes", method = RequestMethod.GET)
    public RespEntity getAllRateCodes(@RequestAttribute("loginDetails") LoginDetails loginDetails) {

        return new RespEntity(200, bookingSearchService.getAllRateCodes(loginDetails));
    }
}
