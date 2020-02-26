package com.samasa.hspms.guest.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GuestAccountIdentityId generated by hbm2java
 */
@Embeddable
public class GuestAccountIdentityId implements java.io.Serializable {

	private String unitCode;
	private int guestUid;
	private String idType;

	public GuestAccountIdentityId() {
	}

	public GuestAccountIdentityId(String unitCode, int guestUid, String idType) {
		this.unitCode = unitCode;
		this.guestUid = guestUid;
		this.idType = idType;
	}

	@Column(name = "unit_code", nullable = false, length = 5)
	public String getUnitCode() {
		return this.unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	@Column(name = "guest_uid", nullable = false)
	public int getGuestUid() {
		return this.guestUid;
	}

	public void setGuestUid(int guestUid) {
		this.guestUid = guestUid;
	}

	@Column(name = "id_type", nullable = false, length = 3)
	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GuestAccountIdentityId))
			return false;
		GuestAccountIdentityId castOther = (GuestAccountIdentityId) other;

		return ((this.getUnitCode() == castOther.getUnitCode()) || (this.getUnitCode() != null
				&& castOther.getUnitCode() != null && this.getUnitCode().equals(castOther.getUnitCode())))
				&& (this.getGuestUid() == castOther.getGuestUid())
				&& ((this.getIdType() == castOther.getIdType()) || (this.getIdType() != null
						&& castOther.getIdType() != null && this.getIdType().equals(castOther.getIdType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUnitCode() == null ? 0 : this.getUnitCode().hashCode());
		result = 37 * result + this.getGuestUid();
		result = 37 * result + (getIdType() == null ? 0 : this.getIdType().hashCode());
		return result;
	}

}