package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstBilling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface OcmBkgBillingDao extends JpaRepository<OcmTrBkgVstBilling, Long> {

    @Modifying
    @Query(value = "update ocm_tr_bkg_vst_billing set pay_code = ?1, cur_code = ?2, billing_inst_guest = ?3, " +
            "status_cash_only = ?4, allow_pos = ?5 where bkg_uid = ?6", nativeQuery = true)
    void updateBillingTable(String payCode, String curCode, String billInstGuest, String cashOnly, String allowPOS,
                            Integer bkgUid);
}
