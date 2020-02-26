package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstRevDaily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface OcmTrBkgVstRevDailyDao extends JpaRepository<OcmTrBkgVstRevDaily, Long> {

    @Modifying
    @Query(value = "delete from ocm_tr_bkg_vst_rev_daily where bkg_uid = ?1", nativeQuery = true)
    void deleteBkgRevDaily(Integer bkgUid);
}
