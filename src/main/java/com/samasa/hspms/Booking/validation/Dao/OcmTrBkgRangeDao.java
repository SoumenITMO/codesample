package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgBlkRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;

public interface OcmTrBkgRangeDao extends JpaRepository<OcmTrBkgBlkRange, Long> {

    OcmTrBkgBlkRange getFirstByOrderByBkgBlkRangeIdDesc();

    @Modifying
    @Query(value = "update ocm_tr_bkg_blk_range set arr_date = ?1, dep_date = ?2, deflt_occ_rm_type = ?3, " +
            "deflt_meal_plan_code = ?4, deflt_rate_code = ?5, deflt_room_rate = ?6, deflt_cur_code = ?7, " +
            "deflt_occ_ind = ?8 where bkg_nbr = ?9", nativeQuery = true)
    void updateBkgBlkDaily(Date arrDate, Date deptDate, String occRmType, String mealPlanCode, String rateCode,
                           float rmmRate, String curCode, String occInd, String bkgNbr);
}
