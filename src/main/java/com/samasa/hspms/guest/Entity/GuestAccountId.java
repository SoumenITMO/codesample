package com.samasa.hspms.guest.Entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GuestAccountId generated by hbm2java
 */
@Embeddable
public class GuestAccountId implements java.io.Serializable {

	private String unitCode;
	private String guestAcType;
	private int guestUid;
	private String profileId;

	public GuestAccountId() {
	}

	public GuestAccountId(String unitCode, String guestAcType, int guestUid, String profileId) {
		this.unitCode = unitCode;
		this.guestAcType = guestAcType;
		this.guestUid = guestUid;
		this.profileId = profileId;
	}

	@Column(name = "unit_code", nullable = false, length = 5)
	public String getUnitCode() {
		return this.unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	@Column(name = "guest_ac_type", nullable = false, length = 2)
	public String getGuestAcType() {
		return this.guestAcType;
	}

	public void setGuestAcType(String guestAcType) {
		this.guestAcType = guestAcType;
	}

	@Column(name = "guest_uid", nullable = false)
	public int getGuestUid() {
		return this.guestUid;
	}

	public void setGuestUid(int guestUid) {
		this.guestUid = guestUid;
	}

	@Column(name = "profile_id", nullable = false, length = 20)
	public String getProfileId() {
		return this.profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GuestAccountId))
			return false;
		GuestAccountId castOther = (GuestAccountId) other;

		return ((this.getUnitCode() == castOther.getUnitCode()) || (this.getUnitCode() != null
				&& castOther.getUnitCode() != null && this.getUnitCode().equals(castOther.getUnitCode())))
				&& ((this.getGuestAcType() == castOther.getGuestAcType())
						|| (this.getGuestAcType() != null && castOther.getGuestAcType() != null
								&& this.getGuestAcType().equals(castOther.getGuestAcType())))
				&& (this.getGuestUid() == castOther.getGuestUid())
				&& ((this.getProfileId() == castOther.getProfileId()) || (this.getProfileId() != null
						&& castOther.getProfileId() != null && this.getProfileId().equals(castOther.getProfileId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUnitCode() == null ? 0 : this.getUnitCode().hashCode());
		result = 37 * result + (getGuestAcType() == null ? 0 : this.getGuestAcType().hashCode());
		result = 37 * result + this.getGuestUid();
		result = 37 * result + (getProfileId() == null ? 0 : this.getProfileId().hashCode());
		return result;
	}

}