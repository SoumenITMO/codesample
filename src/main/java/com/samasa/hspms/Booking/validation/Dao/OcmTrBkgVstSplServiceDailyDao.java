package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstSplServiceDaily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OcmTrBkgVstSplServiceDailyDao extends JpaRepository<OcmTrBkgVstSplServiceDaily, Long> {

    @Modifying
    @Query(value = "delete from ocm_tr_bkg_vst_spl_service_daily where bkg_uid = ?1", nativeQuery = true)
    void deleteBkgSplServiceDaily(Integer bkgUid);
}
