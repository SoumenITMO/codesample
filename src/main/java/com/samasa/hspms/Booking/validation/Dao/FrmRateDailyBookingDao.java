package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomRateDaily.FrmRateDailyBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

public interface FrmRateDailyBookingDao extends JpaRepository<FrmRateDailyBooking, Long> {

    FrmRateDailyBooking getFirstByBusDateAndUnitCode(Date busDate, String unitCode);
    FrmRateDailyBooking getFirstByBusDate(Date busDate);
    List<FrmRateDailyBooking> getAllByUnitCode(String unitCode);
    FrmRateDailyBooking getFirstByRateCodeAndUnitCode(String rateCode, String unitCode);
    FrmRateDailyBooking getFirstByBusDateAndUnitCodeAndOccInd(Date busDate, String unitCode, String occInd);
    FrmRateDailyBooking getFirstByBusDateAndUnitCodeAndOccIndAndRateCode(Date busDate, String unitCode,
                                                                            String occInd,
                                                                            String rateCode);
}
