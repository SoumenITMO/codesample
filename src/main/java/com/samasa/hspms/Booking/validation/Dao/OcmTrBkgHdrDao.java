package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgHdr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface OcmTrBkgHdrDao extends JpaRepository<OcmTrBkgHdr, Long> {

    @Query(value = "SELECT * FROM `ocm_tr_bkg_hdr` ORDER by bkg_uid DESC Limit 1", nativeQuery = true)
    OcmTrBkgHdr getLastRecord();

    OcmTrBkgHdr getFirstByUnitCodeAndBkgUid(String unitCode, Integer bkgUid);

    OcmTrBkgHdr getFirstByUnitCodeAndBkgNbr(String unitCode, String bkgUid);

    OcmTrBkgHdr getAllByUnitCodeAndBkgNbr(String unitCode, String bkngNumber);

    List<OcmTrBkgHdr> getAllByBkgGenSourceAndUnitCodeOrBkgNbrOrExternalBkgRefNoOrCortaUidOrExternalPoRefNo(String bkgGenSource,
                                                                                                             String unitCode,
                                                                                                             String bkgNbr,
                                                                                                             String externalBkgRefno,
                                                                                                             int cortaUid,
                                                                                                             String externalPoRefNo);

    @Query(value = "select * from ocm_tr_bkg_hdr where unit_code = ?2 and (bkg_gen_source = ?1 or bkg_nbr = ?3 " +
            "or external_bkg_ref_no = ?4 or corta_uid = ?5 or external_po_ref_no = ?6)", nativeQuery = true)
    OcmTrBkgHdr getHeaderData(String bkgGenSource, String unitCode, String bkgNbr, String externalBkgRefno, int cortaUid,
                              String externalPoRefNo);

    @Modifying
    @Query(value = "update ocm_tr_bkg_hdr set resv_propagation = 'Y' where bkg_uid = ?1", nativeQuery = true)
    void updateBkngHdr(Integer bkgUid);

    @Modifying
    @Query(value = "update ocm_tr_bkg_hdr set bkg_date = ?2, bkg_date_from = ?3, bkg_date_to = ?4 where bkg_nbr = ?1",
            nativeQuery = true)
    void updateBookingHdrForCancel(String bkgNbr, Date bkgDate, Date fromDate, Date toDate);
}
