package com.samasa.hspms.Booking.validation.Services.MainBookingService;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MessageCodeService {

    public String getCortaUIDMsgCode(boolean cortaUidFlag) {
        return cortaUidFlag ? "" : "101";
    }

    public String getCortaTBDMsgCode(boolean cortaUidFlag) {
        return cortaUidFlag ? "" : "102";
    }

    public String getRoomAvailStatusCode(boolean roomAvail) {
        return roomAvail ? "" : "103";
    }

    public String getRoomAvailByStopSellStatusCode(boolean roomAvailByStopSell) {
        return roomAvailByStopSell ? "" : "110";
    }

    public String getRoomAvailByClosedForArriv(boolean roomAvailByStopSell) {
        return roomAvailByStopSell ? "" : "104";
    }

    public String getRoomAvailByClosedForDepart(boolean roomAvailByClosedDepart) {
        return roomAvailByClosedDepart ? "" : "105";
    }

    public String getRoomNoAvail(boolean roomAvailByNo) {
        return roomAvailByNo ? "" : "106";
    }

    public String getDailyRoomByRateCodeAvail(boolean dailyRoomByMealCode) {
        return dailyRoomByMealCode ? "" : "111";
    }

    public String getDailyRoomByCurCode(boolean dailyRoomByMealCode) {
        return dailyRoomByMealCode ? "" : "112";
    }

    public String getDailyRoomByRoomRate(boolean dailyRoomByMealCode) {
        return dailyRoomByMealCode ? "" : "107";
    }

    public String getDailyRoomByMealCodeAvail(boolean dailyRoomByMealCode) {
        return dailyRoomByMealCode ? "" : "108";
    }

    public String getDailyRoomBySplSrvcType(boolean dailyRoomByMealCode) {
        return dailyRoomByMealCode ? "" : "109";
    }
}
