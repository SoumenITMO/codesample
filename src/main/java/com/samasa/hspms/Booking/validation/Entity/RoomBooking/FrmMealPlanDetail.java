package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import com.google.common.base.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "frm_meal_plan_detail")
@IdClass(FrmMealPlanDetailPK.class)
public class FrmMealPlanDetail {
    private String unitCode;
    private String mealPlanCode;
    private String mealType;
    private String revpayCode;
    private String paxType;
    private String dow;
    private float mealRate;
    private String curCode;
    private String isApplicable;
    private String status;
    private int crUserUid;
    private Timestamp crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;

    @Id
    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Id
    @Column(name = "meal_plan_code", nullable = false, length = 4)
    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    @Id
    @Column(name = "meal_type", nullable = false, length = 4)
    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Basic
    @Column(name = "revpay_code", nullable = false, length = 4)
    public String getRevpayCode() {
        return revpayCode;
    }

    public void setRevpayCode(String revpayCode) {
        this.revpayCode = revpayCode;
    }

    @Id
    @Column(name = "pax_type", nullable = false, length = 2)
    public String getPaxType() {
        return paxType;
    }

    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    @Id
    @Column(name = "dow", nullable = false, length = 2)
    public String getDow() {
        return dow;
    }

    public void setDow(String dow) {
        this.dow = dow;
    }

    @Basic
    @Column(name = "meal_rate", nullable = false, precision = 4)
    public float getMealRate() {
        return mealRate;
    }

    public void setMealRate(float mealRate) {
        this.mealRate = mealRate;
    }

    @Id
    @Column(name = "cur_code", nullable = false, length = 3)
    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    @Basic
    @Column(name = "is_applicable", nullable = false, length = 1)
    public String getIsApplicable() {
        return isApplicable;
    }

    public void setIsApplicable(String isApplicable) {
        this.isApplicable = isApplicable;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "cr_user_uid", nullable = false)
    public int getCrUserUid() {
        return crUserUid;
    }

    public void setCrUserUid(int crUserUid) {
        this.crUserUid = crUserUid;
    }

    @Basic
    @Column(name = "cr_datetime", nullable = false)
    public Timestamp getCrDatetime() {
        return crDatetime;
    }

    public void setCrDatetime(Timestamp crDatetime) {
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
    public Timestamp getMfdDatetime() {
        return mfdDatetime;
    }

    public void setMfdDatetime(Timestamp mfdDatetime) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrmMealPlanDetail that = (FrmMealPlanDetail) o;
        return crUserUid == that.crUserUid &&
                Objects.equal(unitCode, that.unitCode) &&
                Objects.equal(mealPlanCode, that.mealPlanCode) &&
                Objects.equal(mealType, that.mealType) &&
                Objects.equal(revpayCode, that.revpayCode) &&
                Objects.equal(paxType, that.paxType) &&
                Objects.equal(dow, that.dow) &&
                Objects.equal(mealRate, that.mealRate) &&
                Objects.equal(curCode, that.curCode) &&
                Objects.equal(isApplicable, that.isApplicable) &&
                Objects.equal(status, that.status) &&
                Objects.equal(crDatetime, that.crDatetime) &&
                Objects.equal(crSessionId, that.crSessionId) &&
                Objects.equal(mfdUserUid, that.mfdUserUid) &&
                Objects.equal(mfdDatetime, that.mfdDatetime) &&
                Objects.equal(mfdSessionId, that.mfdSessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unitCode, mealPlanCode, mealType, revpayCode, paxType, dow, mealRate, curCode, isApplicable, status, crUserUid, crDatetime, crSessionId, mfdUserUid, mfdDatetime, mfdSessionId);
    }
}
