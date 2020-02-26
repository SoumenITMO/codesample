package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.FrmRateHeaderSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FrmRateHeaderSearchDao extends JpaRepository<FrmRateHeaderSearch, Long> {

    List<FrmRateHeaderSearch> getAllByUnitCode(String unitCode);
}
