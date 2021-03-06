package com.samasa.hspms.guest.Entity;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GuestAccountMembership generated by hbm2java
 */
@Entity
@Table(name = "guest_account_membership", catalog = "hs_pmsm")
public class GuestAccountMembership implements java.io.Serializable {

	private GuestAccountMembershipId id;
	private GuestAccount guestAccount;
	private String clubId;
	private Date clubDateExpiry;
	private String clubRemark;
	private String clubOffersRemarks;

	public GuestAccountMembership() {
	}

	public GuestAccountMembership(GuestAccountMembershipId id, GuestAccount guestAccount) {
		this.id = id;
		this.guestAccount = guestAccount;
	}

	public GuestAccountMembership(GuestAccountMembershipId id, GuestAccount guestAccount, String clubId,
                                  Date clubDateExpiry, String clubRemark, String clubOffersRemarks) {
		this.id = id;
		this.guestAccount = guestAccount;
		this.clubId = clubId;
		this.clubDateExpiry = clubDateExpiry;
		this.clubRemark = clubRemark;
		this.clubOffersRemarks = clubOffersRemarks;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "unitCode", column = @Column(name = "unit_code", nullable = false, length = 5)),
			@AttributeOverride(name = "guestUid", column = @Column(name = "guest_uid", nullable = false)),
			@AttributeOverride(name = "clubMemberType", column = @Column(name = "club_member_type", nullable = false, length = 3)),
			@AttributeOverride(name = "clubCode", column = @Column(name = "club_code", nullable = false, length = 3)) })
	public GuestAccountMembershipId getId() {
		return this.id;
	}

	public void setId(GuestAccountMembershipId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "guest_uid", nullable = false, insertable = false, updatable = false)
	public GuestAccount getGuestAccount() {
		return this.guestAccount;
	}

	public void setGuestAccount(GuestAccount guestAccount) {
		this.guestAccount = guestAccount;
	}

	@Column(name = "club_id", length = 100)
	public String getClubId() {
		return this.clubId;
	}

	public void setClubId(String clubId) {
		this.clubId = clubId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "club_date_expiry", length = 10)
	public Date getClubDateExpiry() {
		return this.clubDateExpiry;
	}

	public void setClubDateExpiry(Date clubDateExpiry) {
		this.clubDateExpiry = clubDateExpiry;
	}

	@Column(name = "club_remark")
	public String getClubRemark() {
		return this.clubRemark;
	}

	public void setClubRemark(String clubRemark) {
		this.clubRemark = clubRemark;
	}

	@Column(name = "club_offers_remarks")
	public String getClubOffersRemarks() {
		return this.clubOffersRemarks;
	}

	public void setClubOffersRemarks(String clubOffersRemarks) {
		this.clubOffersRemarks = clubOffersRemarks;
	}

}
