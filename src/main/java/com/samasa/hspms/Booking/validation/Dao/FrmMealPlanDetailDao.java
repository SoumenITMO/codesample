package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.FrmMealPlanDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FrmMealPlanDetailDao extends JpaRepository<FrmMealPlanDetail, Long> {

    List<FrmMealPlanDetail> getFirstByUnitCodeAndMealPlanCodeAndRevpayCodeAndCurCode(String unitCode, String mealCode,
                                                                                     String revpayCode, String curCode);
}
