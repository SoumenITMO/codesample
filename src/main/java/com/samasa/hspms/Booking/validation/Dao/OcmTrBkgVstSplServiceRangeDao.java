package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstSplServiceRange;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OcmTrBkgVstSplServiceRangeDao extends JpaRepository<OcmTrBkgVstSplServiceRange, Long> {

    List<OcmTrBkgVstSplServiceRange> getFirstBySplSrvTypeAndUnitCode(String splServCode, String unitCode);
}
