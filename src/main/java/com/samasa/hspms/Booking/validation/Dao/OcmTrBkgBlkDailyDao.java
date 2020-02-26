package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgBlkDaily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;

public interface OcmTrBkgBlkDailyDao extends JpaRepository<OcmTrBkgBlkDaily, Long> {

    OcmTrBkgBlkDaily getFirstByOrderByBkgBlkDailyIdDesc();

    OcmTrBkgBlkDaily getFirstByOrderByBatchSeqIdDesc();

    @Query(value = "select * from ocm_tr_bkg_blk_daily where ?1 >= bus_date and bus_date <= ?1 and unit_code = ?2 and " +
            "bkg_nbr = ?3 Limit 1" ,nativeQuery = true)
    OcmTrBkgBlkDaily getSingleData(Date busDate, String unitCode, String bkrNbr);

    @Query(value = "SELECT bkg_blk_daily_id FROM `ocm_tr_bkg_blk_daily` ORDER BY bkg_blk_daily_id DESC LIMIT 1",
            nativeQuery = true)
    OcmTrBkgBlkDaily getLastEntry();

    @Modifying
    @Query(value = "update ocm_tr_bkg_blk_daily set occ_stauts_id = 'CX' where unit_code = ?1 and bus_date = ?2 " +
            "and occ_rm_type = ?3", nativeQuery = true)
    int updateBkgBlkDailyTable(String unitCode, Date date, String rmmType);
}
