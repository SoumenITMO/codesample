package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstPax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OcmTrBkgVstPaxDao extends JpaRepository<OcmTrBkgVstPax, Long> {

    @Modifying
    @Query(value = "update ocm_tr_bkg_vst_pax set pax_ad = ?2, pax_yt = ?3, pax_ch = ?4 where bkg_uid = ?1", nativeQuery = true)
    void updatePaxData(Integer bkgUid, Integer paxad, Integer paxyt, Integer paxch);
}
