package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstMealPlanDaily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;
import java.util.List;

public interface OcmTrBkgVstMealPlanDailyDao extends JpaRepository<OcmTrBkgVstMealPlanDaily, Long> {

    @Modifying
    @Query(value = "delete from ocm_tr_bkg_vst_meal_plan_daily where bkg_uid = ?1", nativeQuery = true)
    void deleteBkgVstMealPlanDailyData(Integer bkgUid);

    List<OcmTrBkgVstMealPlanDaily> getFirstByMealPlanCodeAndUnitCodeAndCurCode(String mealPlanCode, String unitCode,
                                                                               String curCode);

    OcmTrBkgVstMealPlanDaily getFirstByBusDate(Date busDate);

    @Query(value = "select * from ocm_tr_bkg_vst_meal_plan_daily where bus_date = ?1", nativeQuery = true)
    OcmTrBkgVstMealPlanDaily cusquery(Date busDate);
}
