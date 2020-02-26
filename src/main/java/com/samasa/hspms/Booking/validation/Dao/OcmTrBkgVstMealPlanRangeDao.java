package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstMealPlanRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OcmTrBkgVstMealPlanRangeDao extends JpaRepository<OcmTrBkgVstMealPlanRange, Long> {

    List<OcmTrBkgVstMealPlanRange> getAllByMealPlanCode(String mealPlanCode);
}
