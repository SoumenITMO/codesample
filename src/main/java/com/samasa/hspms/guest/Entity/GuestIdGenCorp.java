package com.samasa.hspms.guest.Entity;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * GuestIdGenCorp generated by hbm2java
 */
@Entity
@Table(name = "guest_id_gen_corp", catalog = "hs_pmsm", uniqueConstraints = @UniqueConstraint(columnNames = { "corp_id",
		"guest_ac_process_type", "guest_ac_maxlenth", "guest_ac_seq_start", "guest_ac_seq_end",
		"guest_ac_nextseq_no" }))
public class GuestIdGenCorp implements java.io.Serializable {

	private GuestIdGenCorpId id;

	public GuestIdGenCorp() {
	}

	public GuestIdGenCorp(GuestIdGenCorpId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "corpId", column = @Column(name = "corp_id", nullable = false, length = 5)),
			@AttributeOverride(name = "guestAcProcessType", column = @Column(name = "guest_ac_process_type", nullable = false, length = 2)),
			@AttributeOverride(name = "guestAcMaxlenth", column = @Column(name = "guest_ac_maxlenth", nullable = false)),
			@AttributeOverride(name = "guestAcSeqStart", column = @Column(name = "guest_ac_seq_start", nullable = false)),
			@AttributeOverride(name = "guestAcSeqEnd", column = @Column(name = "guest_ac_seq_end", nullable = false)),
			@AttributeOverride(name = "guestAcNextseqNo", column = @Column(name = "guest_ac_nextseq_no", nullable = false)) })
	public GuestIdGenCorpId getId() {
		return this.id;
	}

	public void setId(GuestIdGenCorpId id) {
		this.id = id;
	}

}