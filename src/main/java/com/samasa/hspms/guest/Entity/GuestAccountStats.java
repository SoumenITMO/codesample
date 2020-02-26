package com.samasa.hspms.guest.Entity;


import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "guest_account_stats", schema = "hs_pmsm", catalog = "")
@IdClass(GuestAccountStatsId.class)
public class GuestAccountStats {
    private String unitCode;
    private Integer guestUid;
    private Integer noOfReservations;
    private Integer noOfCancellations;
    private Double revenueRooms;
    private Double revenueFnb;
    private Double revenueOthers;
    private Double revenueTotal;
    private Integer fnbCovers;
    private Double fnbRevenue;
    private Date firstVisit;
    private Date lastVisit;
    private Integer nofVisit;
    private String luRoomType;
    private String luRateCode;
    private String luPayCode;
    private Double luRoomRate;
    private Double luGuestRate;
    private Double luRackRate;
    private Integer crUserUid;
    private Date crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Date mfdDatetime;
    private Integer mfdSessionId;
    private Integer fnbPosCovers;
    private Double fnbPosRevenue;

    @Id
    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Id
    @Column(name = "guest_uid", nullable = false)
    public Integer getGuestUid() {
        return guestUid;
    }

    public void setGuestUid(Integer guestUid) {
        this.guestUid = guestUid;
    }

    @Basic
    @Column(name = "no_of_reservations", nullable = false)
    public Integer getNoOfReservations() {
        return noOfReservations;
    }

    public void setNoOfReservations(Integer noOfReservations) {
        this.noOfReservations = noOfReservations;
    }

    @Basic
    @Column(name = "no_of_cancellations", nullable = false)
    public Integer getNoOfCancellations() {
        return noOfCancellations;
    }

    public void setNoOfCancellations(Integer noOfCancellations) {
        this.noOfCancellations = noOfCancellations;
    }

    @Basic
    @Column(name = "revenue_rooms", nullable = false, precision = 4)
    public Double getRevenueRooms() {
        return revenueRooms;
    }

    public void setRevenueRooms(Double revenueRooms) {
        this.revenueRooms = revenueRooms;
    }

    @Basic
    @Column(name = "revenue_fnb", nullable = false, precision = 4)
    public Double getRevenueFnb() {
        return revenueFnb;
    }

    public void setRevenueFnb(Double revenueFnb) {
        this.revenueFnb = revenueFnb;
    }

    @Basic
    @Column(name = "revenue_others", nullable = false, precision = 4)
    public Double getRevenueOthers() {
        return revenueOthers;
    }

    public void setRevenueOthers(Double revenueOthers) {
        this.revenueOthers = revenueOthers;
    }

    @Basic
    @Column(name = "revenue_total", nullable = false, precision = 4)
    public Double getRevenueTotal() {
        return revenueTotal;
    }

    public void setRevenueTotal(Double revenueTotal) {
        this.revenueTotal = revenueTotal;
    }

    @Basic
    @Column(name = "fnb_covers", nullable = false)
    public Integer getFnbCovers() {
        return fnbCovers;
    }

    public void setFnbCovers(Integer fnbCovers) {
        this.fnbCovers = fnbCovers;
    }

    @Basic
    @Column(name = "fnb_revenue", nullable = false, precision = 4)
    public Double getFnbRevenue() {
        return fnbRevenue;
    }

    public void setFnbRevenue(Double fnbRevenue) {
        this.fnbRevenue = fnbRevenue;
    }

    @Basic
    @Column(name = "first_visit", nullable = true)
    public Date getFirstVisit() {
        return firstVisit;
    }

    public void setFirstVisit(Date firstVisit) {
        this.firstVisit = firstVisit;
    }

    @Basic
    @Column(name = "last_visit", nullable = true)
    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    @Basic
    @Column(name = "nof_visit", nullable = false)
    public Integer getNofVisit() {
        return nofVisit;
    }

    public void setNofVisit(Integer nofVisit) {
        this.nofVisit = nofVisit;
    }

    @Basic
    @Column(name = "lu_room_type", nullable = true, length = 5)
    public String getLuRoomType() {
        return luRoomType;
    }

    public void setLuRoomType(String luRoomType) {
        this.luRoomType = luRoomType;
    }

    @Basic
    @Column(name = "lu_rate_code", nullable = true, length = 12)
    public String getLuRateCode() {
        return luRateCode;
    }

    public void setLuRateCode(String luRateCode) {
        this.luRateCode = luRateCode;
    }

    @Basic
    @Column(name = "lu_pay_code", nullable = true, length = 12)
    public String getLuPayCode() {
        return luPayCode;
    }

    public void setLuPayCode(String luPayCode) {
        this.luPayCode = luPayCode;
    }

    @Basic
    @Column(name = "lu_room_rate", nullable = false, precision = 4)
    public Double getLuRoomRate() {
        return luRoomRate;
    }

    public void setLuRoomRate(Double luRoomRate) {
        this.luRoomRate = luRoomRate;
    }

    @Basic
    @Column(name = "lu_guest_rate", nullable = false, precision = 4)
    public Double getLuGuestRate() {
        return luGuestRate;
    }

    public void setLuGuestRate(Double luGuestRate) {
        this.luGuestRate = luGuestRate;
    }

    @Basic
    @Column(name = "lu_rack_rate", nullable = false, precision = 4)
    public Double getLuRackRate() {
        return luRackRate;
    }

    public void setLuRackRate(Double luRackRate) {
        this.luRackRate = luRackRate;
    }

    @Basic
    @Column(name = "cr_user_uid", nullable = false)
    public Integer getCrUserUid() {
        return crUserUid;
    }

    public void setCrUserUid(Integer crUserUid) {
        this.crUserUid = crUserUid;
    }

    @Basic
    @Column(name = "cr_datetime", nullable = false)
    public Date getCrDatetime() {
        return crDatetime;
    }

    public void setCrDatetime(Date crDatetime) {
        this.crDatetime = crDatetime;
    }

    @Basic
    @Column(name = "cr_session_id", nullable = true)
    public Integer getCrSessionId() {
        return crSessionId;
    }

    public void setCrSessionId(Integer crSessionId) {
        this.crSessionId = crSessionId;
    }

    @Basic
    @Column(name = "mfd_user_uid", nullable = true)
    public Integer getMfdUserUid() {
        return mfdUserUid;
    }

    public void setMfdUserUid(Integer mfdUserUid) {
        this.mfdUserUid = mfdUserUid;
    }

    @Basic
    @Column(name = "mfd_datetime", nullable = true)
    public Date getMfdDatetime() {
        return mfdDatetime;
    }

    public void setMfdDatetime(Date mfdDatetime) {
        this.mfdDatetime = mfdDatetime;
    }

    @Basic
    @Column(name = "mfd_session_id", nullable = true)
    public Integer getMfdSessionId() {
        return mfdSessionId;
    }

    public void setMfdSessionId(Integer mfdSessionId) {
        this.mfdSessionId = mfdSessionId;
    }

    @Basic
    @Column(name = "fnb_pos_covers", nullable = false)
    public Integer getFnbPosCovers() {
        return fnbPosCovers;
    }

    public void setFnbPosCovers(Integer fnbPosCovers) {
        this.fnbPosCovers = fnbPosCovers;
    }

    @Basic
    @Column(name = "fnb_pos_revenue", nullable = false, precision = 0)
    public Double getFnbPosRevenue() {
        return fnbPosRevenue;
    }

    public void setFnbPosRevenue(Double fnbPosRevenue) {
        this.fnbPosRevenue = fnbPosRevenue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuestAccountStats that = (GuestAccountStats) o;

        if (unitCode != null ? !unitCode.equals(that.unitCode) : that.unitCode != null) return false;
        if (guestUid != null ? !guestUid.equals(that.guestUid) : that.guestUid != null) return false;
        if (noOfReservations != null ? !noOfReservations.equals(that.noOfReservations) : that.noOfReservations != null)
            return false;
        if (noOfCancellations != null ? !noOfCancellations.equals(that.noOfCancellations) : that.noOfCancellations != null)
            return false;
        if (revenueRooms != null ? !revenueRooms.equals(that.revenueRooms) : that.revenueRooms != null) return false;
        if (revenueFnb != null ? !revenueFnb.equals(that.revenueFnb) : that.revenueFnb != null) return false;
        if (revenueOthers != null ? !revenueOthers.equals(that.revenueOthers) : that.revenueOthers != null)
            return false;
        if (revenueTotal != null ? !revenueTotal.equals(that.revenueTotal) : that.revenueTotal != null) return false;
        if (fnbCovers != null ? !fnbCovers.equals(that.fnbCovers) : that.fnbCovers != null) return false;
        if (fnbRevenue != null ? !fnbRevenue.equals(that.fnbRevenue) : that.fnbRevenue != null) return false;
        if (firstVisit != null ? !firstVisit.equals(that.firstVisit) : that.firstVisit != null) return false;
        if (lastVisit != null ? !lastVisit.equals(that.lastVisit) : that.lastVisit != null) return false;
        if (nofVisit != null ? !nofVisit.equals(that.nofVisit) : that.nofVisit != null) return false;
        if (luRoomType != null ? !luRoomType.equals(that.luRoomType) : that.luRoomType != null) return false;
        if (luRateCode != null ? !luRateCode.equals(that.luRateCode) : that.luRateCode != null) return false;
        if (luPayCode != null ? !luPayCode.equals(that.luPayCode) : that.luPayCode != null) return false;
        if (luRoomRate != null ? !luRoomRate.equals(that.luRoomRate) : that.luRoomRate != null) return false;
        if (luGuestRate != null ? !luGuestRate.equals(that.luGuestRate) : that.luGuestRate != null) return false;
        if (luRackRate != null ? !luRackRate.equals(that.luRackRate) : that.luRackRate != null) return false;
        if (crUserUid != null ? !crUserUid.equals(that.crUserUid) : that.crUserUid != null) return false;
        if (crDatetime != null ? !crDatetime.equals(that.crDatetime) : that.crDatetime != null) return false;
        if (crSessionId != null ? !crSessionId.equals(that.crSessionId) : that.crSessionId != null) return false;
        if (mfdUserUid != null ? !mfdUserUid.equals(that.mfdUserUid) : that.mfdUserUid != null) return false;
        if (mfdDatetime != null ? !mfdDatetime.equals(that.mfdDatetime) : that.mfdDatetime != null) return false;
        if (mfdSessionId != null ? !mfdSessionId.equals(that.mfdSessionId) : that.mfdSessionId != null) return false;
        if (fnbPosCovers != null ? !fnbPosCovers.equals(that.fnbPosCovers) : that.fnbPosCovers != null) return false;
        if (fnbPosRevenue != null ? !fnbPosRevenue.equals(that.fnbPosRevenue) : that.fnbPosRevenue != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unitCode != null ? unitCode.hashCode() : 0;
        result = 31 * result + (guestUid != null ? guestUid.hashCode() : 0);
        result = 31 * result + (noOfReservations != null ? noOfReservations.hashCode() : 0);
        result = 31 * result + (noOfCancellations != null ? noOfCancellations.hashCode() : 0);
        result = 31 * result + (revenueRooms != null ? revenueRooms.hashCode() : 0);
        result = 31 * result + (revenueFnb != null ? revenueFnb.hashCode() : 0);
        result = 31 * result + (revenueOthers != null ? revenueOthers.hashCode() : 0);
        result = 31 * result + (revenueTotal != null ? revenueTotal.hashCode() : 0);
        result = 31 * result + (fnbCovers != null ? fnbCovers.hashCode() : 0);
        result = 31 * result + (fnbRevenue != null ? fnbRevenue.hashCode() : 0);
        result = 31 * result + (firstVisit != null ? firstVisit.hashCode() : 0);
        result = 31 * result + (lastVisit != null ? lastVisit.hashCode() : 0);
        result = 31 * result + (nofVisit != null ? nofVisit.hashCode() : 0);
        result = 31 * result + (luRoomType != null ? luRoomType.hashCode() : 0);
        result = 31 * result + (luRateCode != null ? luRateCode.hashCode() : 0);
        result = 31 * result + (luPayCode != null ? luPayCode.hashCode() : 0);
        result = 31 * result + (luRoomRate != null ? luRoomRate.hashCode() : 0);
        result = 31 * result + (luGuestRate != null ? luGuestRate.hashCode() : 0);
        result = 31 * result + (luRackRate != null ? luRackRate.hashCode() : 0);
        result = 31 * result + (crUserUid != null ? crUserUid.hashCode() : 0);
        result = 31 * result + (crDatetime != null ? crDatetime.hashCode() : 0);
        result = 31 * result + (crSessionId != null ? crSessionId.hashCode() : 0);
        result = 31 * result + (mfdUserUid != null ? mfdUserUid.hashCode() : 0);
        result = 31 * result + (mfdDatetime != null ? mfdDatetime.hashCode() : 0);
        result = 31 * result + (mfdSessionId != null ? mfdSessionId.hashCode() : 0);
        result = 31 * result + (fnbPosCovers != null ? fnbPosCovers.hashCode() : 0);
        result = 31 * result + (fnbPosRevenue != null ? fnbPosRevenue.hashCode() : 0);
        return result;
    }
}
