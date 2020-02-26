package com.samasa.hspms.guest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.samasa.hspms.guest.Entity.UnitGuestAcType;
import com.samasa.hspms.guest.Entity.UnitGuestAcTypeId;

public interface UnitGuestAcTypeDao extends JpaRepository<UnitGuestAcType, UnitGuestAcTypeId> {
			
	UnitGuestAcType findByIdUnitCodeAndIdGuestAcType(String unitCode, String guestAcType);
		
	@Modifying
    @Query(value = "update unit_guest_ac_type set guest_ac_nextseq_no=?3 " +
             " where unit_code = ?1 and guest_ac_type=?2", nativeQuery = true )
    void updateAcNextSeqNo(String unitCode, String guestAcType, int guestAcNextseqNo);
}
