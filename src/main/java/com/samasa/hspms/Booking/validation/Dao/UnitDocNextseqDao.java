package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.UnitDocNextseq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UnitDocNextseqDao extends JpaRepository<UnitDocNextseq, Long> {

    UnitDocNextseq getFirstByUnitCodeAndDocumentCode(String unitCode, String documentCode);

    @Modifying
    @Query(value = "update unit_doc_nextseq set nextseq_no = ?1 where nextseq_no = ?2", nativeQuery = true)
    void updateDocSeqNumber(String newDocSeqNumber, String oldDocSeqNumber);
}
