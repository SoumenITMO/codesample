package com.samasa.hspms.guest.Entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GuestIdGenCorpId generated by hbm2java
 */
@Embeddable
public class GuestIdGenCorpId implements java.io.Serializable {

	private String corpId;
	private String guestAcProcessType;
	private int guestAcMaxlenth;
	private int guestAcSeqStart;
	private int guestAcSeqEnd;
	private int guestAcNextseqNo;

	public GuestIdGenCorpId() {
	}

	public GuestIdGenCorpId(String corpId, String guestAcProcessType, int guestAcMaxlenth, int guestAcSeqStart,
			int guestAcSeqEnd, int guestAcNextseqNo) {
		this.corpId = corpId;
		this.guestAcProcessType = guestAcProcessType;
		this.guestAcMaxlenth = guestAcMaxlenth;
		this.guestAcSeqStart = guestAcSeqStart;
		this.guestAcSeqEnd = guestAcSeqEnd;
		this.guestAcNextseqNo = guestAcNextseqNo;
	}

	@Column(name = "corp_id", nullable = false, length = 5)
	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	@Column(name = "guest_ac_process_type", nullable = false, length = 2)
	public String getGuestAcProcessType() {
		return this.guestAcProcessType;
	}

	public void setGuestAcProcessType(String guestAcProcessType) {
		this.guestAcProcessType = guestAcProcessType;
	}

	@Column(name = "guest_ac_maxlenth", nullable = false)
	public int getGuestAcMaxlenth() {
		return this.guestAcMaxlenth;
	}

	public void setGuestAcMaxlenth(int guestAcMaxlenth) {
		this.guestAcMaxlenth = guestAcMaxlenth;
	}

	@Column(name = "guest_ac_seq_start", nullable = false)
	public int getGuestAcSeqStart() {
		return this.guestAcSeqStart;
	}

	public void setGuestAcSeqStart(int guestAcSeqStart) {
		this.guestAcSeqStart = guestAcSeqStart;
	}

	@Column(name = "guest_ac_seq_end", nullable = false)
	public int getGuestAcSeqEnd() {
		return this.guestAcSeqEnd;
	}

	public void setGuestAcSeqEnd(int guestAcSeqEnd) {
		this.guestAcSeqEnd = guestAcSeqEnd;
	}

	@Column(name = "guest_ac_nextseq_no", nullable = false)
	public int getGuestAcNextseqNo() {
		return this.guestAcNextseqNo;
	}

	public void setGuestAcNextseqNo(int guestAcNextseqNo) {
		this.guestAcNextseqNo = guestAcNextseqNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GuestIdGenCorpId))
			return false;
		GuestIdGenCorpId castOther = (GuestIdGenCorpId) other;

		return ((this.getCorpId() == castOther.getCorpId()) || (this.getCorpId() != null
				&& castOther.getCorpId() != null && this.getCorpId().equals(castOther.getCorpId())))
				&& ((this.getGuestAcProcessType() == castOther.getGuestAcProcessType())
						|| (this.getGuestAcProcessType() != null && castOther.getGuestAcProcessType() != null
								&& this.getGuestAcProcessType().equals(castOther.getGuestAcProcessType())))
				&& (this.getGuestAcMaxlenth() == castOther.getGuestAcMaxlenth())
				&& (this.getGuestAcSeqStart() == castOther.getGuestAcSeqStart())
				&& (this.getGuestAcSeqEnd() == castOther.getGuestAcSeqEnd())
				&& (this.getGuestAcNextseqNo() == castOther.getGuestAcNextseqNo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCorpId() == null ? 0 : this.getCorpId().hashCode());
		result = 37 * result + (getGuestAcProcessType() == null ? 0 : this.getGuestAcProcessType().hashCode());
		result = 37 * result + this.getGuestAcMaxlenth();
		result = 37 * result + this.getGuestAcSeqStart();
		result = 37 * result + this.getGuestAcSeqEnd();
		result = 37 * result + this.getGuestAcNextseqNo();
		return result;
	}

}