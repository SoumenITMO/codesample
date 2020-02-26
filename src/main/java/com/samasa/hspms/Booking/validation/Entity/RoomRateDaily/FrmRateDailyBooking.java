package com.samasa.hspms.Booking.validation.Entity.RoomRateDaily;

import com.google.common.base.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "frm_rate_daily")
public class FrmRateDailyBooking {
    private Integer id;
    private String unitCode;
    private String baseRateCode;
    private String rateCode;
    private String curCode;
    private Date busDate;
    private String dow;
    private String dowType;
    private String occRmType;
    private String occInd;
    private BigDecimal baseRate;
    private String ratexchType;
    private BigDecimal ratexchValue;
    private BigDecimal virtualRate;
    private BigDecimal ratexchToleranceValue;
    private float roomRate;
    private BigDecimal extraAdult;
    private BigDecimal extraYouth;
    private BigDecimal extraChild;
    private String mealPlanCode;
    private String splSrvType;
    private String revpayCode;
    private String ctrlLedger;
    private String taxInclusive;
    private String mealInclusive;
    private String isStopSell;
    private Integer crUserUid;
    private Timestamp crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "unit_code")
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Basic
    @Column(name = "base_rate_code")
    public String getBaseRateCode() {
        return baseRateCode;
    }

    public void setBaseRateCode(String baseRateCode) {
        this.baseRateCode = baseRateCode;
    }

    @Basic
    @Column(name = "rate_code")
    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    @Basic
    @Column(name = "cur_code")
    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    @Basic
    @Column(name = "bus_date")
    public Date getBusDate() {
        return busDate;
    }

    public void setBusDate(Date busDate) {
        this.busDate = busDate;
    }

    @Basic
    @Column(name = "dow")
    public String getDow() {
        return dow;
    }

    public void setDow(String dow) {
        this.dow = dow;
    }

    @Basic
    @Column(name = "dow_type")
    public String getDowType() {
        return dowType;
    }

    public void setDowType(String dowType) {
        this.dowType = dowType;
    }

    @Basic
    @Column(name = "occ_rm_type")
    public String getOccRmType() {
        return occRmType;
    }

    public void setOccRmType(String occRmType) {
        this.occRmType = occRmType;
    }

    @Basic
    @Column(name = "occ_ind")
    public String getOccInd() {
        return occInd;
    }

    public void setOccInd(String occInd) {
        this.occInd = occInd;
    }

    @Basic
    @Column(name = "base_rate")
    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    @Basic
    @Column(name = "ratexch_type")
    public String getRatexchType() {
        return ratexchType;
    }

    public void setRatexchType(String ratexchType) {
        this.ratexchType = ratexchType;
    }

    @Basic
    @Column(name = "ratexch_value")
    public BigDecimal getRatexchValue() {
        return ratexchValue;
    }

    public void setRatexchValue(BigDecimal ratexchValue) {
        this.ratexchValue = ratexchValue;
    }

    @Basic
    @Column(name = "virtual_rate")
    public BigDecimal getVirtualRate() {
        return virtualRate;
    }

    public void setVirtualRate(BigDecimal virtualRate) {
        this.virtualRate = virtualRate;
    }

    @Basic
    @Column(name = "ratexch_tolerance_value")
    public BigDecimal getRatexchToleranceValue() {
        return ratexchToleranceValue;
    }

    public void setRatexchToleranceValue(BigDecimal ratexchToleranceValue) {
        this.ratexchToleranceValue = ratexchToleranceValue;
    }

    @Basic
    @Column(name = "room_rate")
    public float getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(float roomRate) {
        this.roomRate = roomRate;
    }

    @Basic
    @Column(name = "extra_adult")
    public BigDecimal getExtraAdult() {
        return extraAdult;
    }

    public void setExtraAdult(BigDecimal extraAdult) {
        this.extraAdult = extraAdult;
    }

    @Basic
    @Column(name = "extra_youth")
    public BigDecimal getExtraYouth() {
        return extraYouth;
    }

    public void setExtraYouth(BigDecimal extraYouth) {
        this.extraYouth = extraYouth;
    }

    @Basic
    @Column(name = "extra_child")
    public BigDecimal getExtraChild() {
        return extraChild;
    }

    public void setExtraChild(BigDecimal extraChild) {
        this.extraChild = extraChild;
    }

    @Basic
    @Column(name = "meal_plan_code")
    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    @Basic
    @Column(name = "spl_srv_type")
    public String getSplSrvType() {
        return splSrvType;
    }

    public void setSplSrvType(String splSrvType) {
        this.splSrvType = splSrvType;
    }

    @Basic
    @Column(name = "revpay_code")
    public String getRevpayCode() {
        return revpayCode;
    }

    public void setRevpayCode(String revpayCode) {
        this.revpayCode = revpayCode;
    }

    @Basic
    @Column(name = "ctrl_ledger")
    public String getCtrlLedger() {
        return ctrlLedger;
    }

    public void setCtrlLedger(String ctrlLedger) {
        this.ctrlLedger = ctrlLedger;
    }

    @Basic
    @Column(name = "tax_inclusive")
    public String getTaxInclusive() {
        return taxInclusive;
    }

    public void setTaxInclusive(String taxInclusive) {
        this.taxInclusive = taxInclusive;
    }

    @Basic
    @Column(name = "meal_inclusive")
    public String getMealInclusive() {
        return mealInclusive;
    }

    public void setMealInclusive(String mealInclusive) {
        this.mealInclusive = mealInclusive;
    }

    @Basic
    @Column(name = "is_stop_sell")
    public String getIsStopSell() {
        return isStopSell;
    }

    public void setIsStopSell(String isStopSell) {
        this.isStopSell = isStopSell;
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
        FrmRateDailyBooking that = (FrmRateDailyBooking) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(unitCode, that.unitCode) &&
                Objects.equal(baseRateCode, that.baseRateCode) &&
                Objects.equal(rateCode, that.rateCode) &&
                Objects.equal(curCode, that.curCode) &&
                Objects.equal(busDate, that.busDate) &&
                Objects.equal(dow, that.dow) &&
                Objects.equal(dowType, that.dowType) &&
                Objects.equal(occRmType, that.occRmType) &&
                Objects.equal(occInd, that.occInd) &&
                Objects.equal(baseRate, that.baseRate) &&
                Objects.equal(ratexchType, that.ratexchType) &&
                Objects.equal(ratexchValue, that.ratexchValue) &&
                Objects.equal(virtualRate, that.virtualRate) &&
                Objects.equal(ratexchToleranceValue, that.ratexchToleranceValue) &&
                Objects.equal(roomRate, that.roomRate) &&
                Objects.equal(extraAdult, that.extraAdult) &&
                Objects.equal(extraYouth, that.extraYouth) &&
                Objects.equal(extraChild, that.extraChild) &&
                Objects.equal(mealPlanCode, that.mealPlanCode) &&
                Objects.equal(splSrvType, that.splSrvType) &&
                Objects.equal(revpayCode, that.revpayCode) &&
                Objects.equal(ctrlLedger, that.ctrlLedger) &&
                Objects.equal(taxInclusive, that.taxInclusive) &&
                Objects.equal(mealInclusive, that.mealInclusive) &&
                Objects.equal(isStopSell, that.isStopSell) &&
                Objects.equal(crUserUid, that.crUserUid) &&
                Objects.equal(crDatetime, that.crDatetime) &&
                Objects.equal(crSessionId, that.crSessionId) &&
                Objects.equal(mfdUserUid, that.mfdUserUid) &&
                Objects.equal(mfdDatetime, that.mfdDatetime) &&
                Objects.equal(mfdSessionId, that.mfdSessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, unitCode, baseRateCode, rateCode, curCode, busDate, dow, dowType, occRmType, occInd, baseRate, ratexchType, ratexchValue, virtualRate, ratexchToleranceValue, roomRate, extraAdult, extraYouth, extraChild, mealPlanCode, splSrvType, revpayCode, ctrlLedger, taxInclusive, mealInclusive, isStopSell, crUserUid, crDatetime, crSessionId, mfdUserUid, mfdDatetime, mfdSessionId);
    }
}
