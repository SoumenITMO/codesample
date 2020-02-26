package com.samasa.hspms.guest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.samasa.hspms.guest.Entity.GuestIdGenCorp;
import com.samasa.hspms.guest.Entity.GuestIdGenCorpId;

public interface GuestIdGenCorpDao extends JpaRepository<GuestIdGenCorp, GuestIdGenCorpId> {
		
	GuestIdGenCorp findByIdCorpIdAndIdGuestAcProcessType(String corpId, String guestAcProcessType);
	
	@Modifying
    @Query(value = "update guest_id_gen_corp set guest_ac_nextseq_no=?6 " +
             " where corp_id = ?1 and guest_ac_process_type=?2 and guest_ac_maxlenth=?3 and "
             + " guest_ac_seq_start =?4 and guest_ac_seq_end =?5 ", nativeQuery = true )
    void updateAcNextSeqNo(String corpId,String guestAcProcessType,int guestAcMaxlenth,
    		int guestAcSeqStart,int guestAcSeqEnd,int nextSeqNum);
}
