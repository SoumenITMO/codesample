package com.samasa.hspms.Booking.validation.Entity;

import com.google.common.base.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "frm_meal_plan_header")
@IdClass(FrmMealPlanHeaderSearchPK.class)
public class FrmMealPlanHeaderSearch {
    private String unitCode;
    private String mealPlanCode;
    private String mealPlanName;
    private Timestamp mpDatefrom;
    private Timestamp mpDateto;
    private String clubWithRooms;
    private String calcType;
    private String chargeInd;
    private String htngCode;
    private String status;
    private Integer crUserUid;
    private Timestamp crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;

    @Id
    @Column(name = "unit_code")
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Id
    @Column(name = "meal_plan_code")
    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    @Basic
    @Column(name = "meal_plan_name")
    public String getMealPlanName() {
        return mealPlanName;
    }

    public void setMealPlanName(String mealPlanName) {
        this.mealPlanName = mealPlanName;
    }

    @Basic
    @Column(name = "mp_datefrom")
    public Timestamp getMpDatefrom() {
        return mpDatefrom;
    }

    public void setMpDatefrom(Timestamp mpDatefrom) {
        this.mpDatefrom = mpDatefrom;
    }

    @Basic
    @Column(name = "mp_dateto")
    public Timestamp getMpDateto() {
        return mpDateto;
    }

    public void setMpDateto(Timestamp mpDateto) {
        this.mpDateto = mpDateto;
    }

    @Basic
    @Column(name = "club_with_rooms")
    public String getClubWithRooms() {
        return clubWithRooms;
    }

    public void setClubWithRooms(String clubWithRooms) {
        this.clubWithRooms = clubWithRooms;
    }

    @Basic
    @Column(name = "calc_type")
    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType;
    }

    @Basic
    @Column(name = "charge_ind")
    public String getChargeInd() {
        return chargeInd;
    }

    public void setChargeInd(String chargeInd) {
        this.chargeInd = chargeInd;
    }

    @Basic
    @Column(name = "htng_code")
    public String getHtngCode() {
        return htngCode;
    }

    public void setHtngCode(String htngCode) {
        this.htngCode = htngCode;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "cr_user_uid")
    public Integer getCrUserUid() {
        return crUserUid;
    }

    public void setCrUserUid(Integer crUserUid) {
        this.crUserUid = crUserUid;
    }

    @Basic
    @Column(name = "cr_datetime")
    public Timestamp getCrDatetime() {
        return crDatetime;
    }

    public void setCrDatetime(Timestamp crDatetime) {
        this.crDatetime = crDatetime;
    }

    @Basic
    @Column(name = "cr_session_id")
    public Integer getCrSessionId() {
        return crSessionId;
    }

    public void setCrSessionId(Integer crSessionId) {
        this.crSessionId = crSessionId;
    }

    @Basic
    @Column(name = "mfd_user_uid")
    public Integer getMfdUserUid() {
        return mfdUserUid;
    }

    public void setMfdUserUid(Integer mfdUserUid) {
        this.mfdUserUid = mfdUserUid;
    }

    @Basic
    @Column(name = "mfd_datetime")
    public Timestamp getMfdDatetime() {
        return mfdDatetime;
    }

    public void setMfdDatetime(Timestamp mfdDatetime) {
        this.mfdDatetime = mfdDatetime;
    }

    @Basic
    @Column(name = "mfd_session_id")
    public Integer getMfdSessionId() {
        return mfdSessionId;
    }

    public void setMfdSessionId(Integer mfdSessionId) {
        this.mfdSessionId = mfdSessionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrmMealPlanHeaderSearch that = (FrmMealPlanHeaderSearch) o;
        return Objects.equal(unitCode, that.unitCode) &&
                Objects.equal(mealPlanCode, that.mealPlanCode) &&
                Objects.equal(mealPlanName, that.mealPlanName) &&
                Objects.equal(mpDatefrom, that.mpDatefrom) &&
                Objects.equal(mpDateto, that.mpDateto) &&
                Objects.equal(clubWithRooms, that.clubWithRooms) &&
                Objects.equal(calcType, that.calcType) &&
                Objects.equal(chargeInd, that.chargeInd) &&
                Objects.equal(htngCode, that.htngCode) &&
                Objects.equal(status, that.status) &&
                Objects.equal(crUserUid, that.crUserUid) &&
                Objects.equal(crDatetime, that.crDatetime) &&
                Objects.equal(crSessionId, that.crSessionId) &&
                Objects.equal(mfdUserUid, that.mfdUserUid) &&
                Objects.equal(mfdDatetime, that.mfdDatetime) &&
                Objects.equal(mfdSessionId, that.mfdSessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unitCode, mealPlanCode, mealPlanName, mpDatefrom, mpDateto, clubWithRooms, calcType, chargeInd, htngCode, status, crUserUid, crDatetime, crSessionId, mfdUserUid, mfdDatetime, mfdSessionId);
    }
}
