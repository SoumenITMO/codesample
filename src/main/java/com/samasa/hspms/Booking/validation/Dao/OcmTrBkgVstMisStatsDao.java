package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstMisStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OcmTrBkgVstMisStatsDao extends JpaRepository<OcmTrBkgVstMisStats, Long> {

    OcmTrBkgVstMisStats getFirstByResvGUid(Integer resvGuid);

    List<OcmTrBkgVstMisStats> getAllByOccRmType(String roomType);

    @Modifying
    @Query(value = "update ocm_tr_bkg_vst_mis_stats set occ_rm_type = ?1, rate_code = ?2, occ_ind = ?3 where bkg_uid = ?4",
            nativeQuery = true)
    void updateMistatData(String occRmType, String rateCode, String occInd, Integer bkgUid);
}
