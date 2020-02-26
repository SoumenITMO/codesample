package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.FrmMealPlanHeaderSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FrmMealPlanHeaderSearchDao extends JpaRepository<FrmMealPlanHeaderSearch, Long> {

    List<FrmMealPlanHeaderSearch> getAllByUnitCode(String unitCode);
}
