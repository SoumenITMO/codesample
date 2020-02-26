package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import com.google.common.base.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "ocm_tr_bkg_vst_rev_daily")
public class OcmTrBkgVstRevDaily {
    private String unitCode;
    private int bkgRevDUid;
    private Integer resvGUid;
    private Integer bkgUid;
    private Integer inHouseUid;
    private Date busDate;
    private String curCode;
    private String oprCurCode;
    private float fxOprCur;
    private float roe;
    private String revpayCode;
    private float dayRateGross;
    private float dayRateNet;
    private int unitQty;
    private String mealPlanCode;
    private String mealPlanInclusive;
    private String splSrvType;
    private String splSrvInclusive;
    private String occInd;
    private int crUserUid;
    private LocalDateTime crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private LocalDateTime mfdDatetime;
    private Integer mfdSessionId;

    @Basic
    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bkg_rev_d_uid", nullable = false)
    public int getBkgRevDUid() {
        return bkgRevDUid;
    }

    public void setBkgRevDUid(int bkgRevDUid) {
        this.bkgRevDUid = bkgRevDUid;
    }

    @Column(name = "resv_g_uid", nullable = false)
    public Integer getResvGUid() {
        return resvGUid;
    }

    public void setResvGUid(Integer resvGUid) {
        this.resvGUid = resvGUid;
    }

    @Column(name = "bkg_uid", nullable = false)
    public Integer getBkgUid() {
        return bkgUid;
    }

    public void setBkgUid(Integer bkgUid) {
        this.bkgUid = bkgUid;
    }

    @Column(name = "inhouse_uid", nullable = false)
    public Integer getInHouseUid() {
        return inHouseUid;
    }

    public void setInHouseUid(Integer inHouseUid) {
        this.inHouseUid = inHouseUid;
    }

    @Basic
    @Column(name = "bus_date", nullable = false)
    public Date getBusDate() {
        return busDate;
    }

    public void setBusDate(Date busDate) {
        this.busDate = busDate;
    }

    @Basic
    @Column(name = "cur_code", nullable = false, length = 3)
    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    @Basic
    @Column(name = "opr_cur_code", nullable = false, length = 3)
    public String getOprCurCode() {
        return oprCurCode;
    }

    public void setOprCurCode(String oprCurCode) {
        this.oprCurCode = oprCurCode;
    }

    @Basic
    @Column(name = "fx_opr_cur", nullable = false, precision = 4)
    public float getFxOprCur() {
        return fxOprCur;
    }

    public void setFxOprCur(float fxOprCur) {
        this.fxOprCur = fxOprCur;
    }

    @Basic
    @Column(name = "roe", nullable = false, precision = 4)
    public float getRoe() {
        return roe;
    }

    public void setRoe(float roe) {
        this.roe = roe;
    }

    @Basic
    @Column(name = "revpay_code", nullable = false, length = 4)
    public String getRevpayCode() {
        return revpayCode;
    }

    public void setRevpayCode(String revpayCode) {
        this.revpayCode = revpayCode;
    }

    @Basic
    @Column(name = "day_rate_gross", nullable = false, precision = 4)
    public float getDayRateGross() {
        return dayRateGross;
    }

    public void setDayRateGross(float dayRateGross) {
        this.dayRateGross = dayRateGross;
    }

    @Basic
    @Column(name = "day_rate_net", nullable = false, precision = 4)
    public float getDayRateNet() {
        return dayRateNet;
    }

    public void setDayRateNet(float dayRateNet) {
        this.dayRateNet = dayRateNet;
    }

    @Basic
    @Column(name = "unit_qty", nullable = false)
    public int getUnitQty() {
        return unitQty;
    }

    public void setUnitQty(int unitQty) {
        this.unitQty = unitQty;
    }

    @Basic
    @Column(name = "meal_plan_code", nullable = true, length = 4)
    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    @Basic
    @Column(name = "meal_plan_inclusive", nullable = true, length = 4)
    public String getMealPlanInclusive() {
        return mealPlanInclusive;
    }

    public void setMealPlanInclusive(String mealPlanInclusive) {
        this.mealPlanInclusive = mealPlanInclusive;
    }

    @Basic
    @Column(name = "spl_srv_type", nullable = true, length = 4)
    public String getSplSrvType() {
        return splSrvType;
    }

    public void setSplSrvType(String splSrvType) {
        this.splSrvType = splSrvType;
    }

    @Basic
    @Column(name = "spl_srv_inclusive", nullable = true, length = 4)
    public String getSplSrvInclusive() {
        return splSrvInclusive;
    }

    public void setSplSrvInclusive(String splSrvInclusive) {
        this.splSrvInclusive = splSrvInclusive;
    }

    @Basic
    @Column(name = "occ_ind", nullable = false, length = 2)
    public String getOccInd() {
        return occInd;
    }

    public void setOccInd(String occInd) {
        this.occInd = occInd;
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
    public LocalDateTime getCrDatetime() {
        return crDatetime;
    }

    public void setCrDatetime(LocalDateTime crDatetime) {
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
    public LocalDateTime getMfdDatetime() {
        return mfdDatetime;
    }

    public void setMfdDatetime(LocalDateTime mfdDatetime) {
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
        OcmTrBkgVstRevDaily that = (OcmTrBkgVstRevDaily) o;
        return bkgRevDUid == that.bkgRevDUid &&
                unitQty == that.unitQty &&
                crUserUid == that.crUserUid &&
                Objects.equal(unitCode, that.unitCode) &&
                Objects.equal(busDate, that.busDate) &&
                Objects.equal(curCode, that.curCode) &&
                Objects.equal(oprCurCode, that.oprCurCode) &&
                Objects.equal(fxOprCur, that.fxOprCur) &&
                Objects.equal(roe, that.roe) &&
                Objects.equal(revpayCode, that.revpayCode) &&
                Objects.equal(dayRateGross, that.dayRateGross) &&
                Objects.equal(dayRateNet, that.dayRateNet) &&
                Objects.equal(mealPlanCode, that.mealPlanCode) &&
                Objects.equal(mealPlanInclusive, that.mealPlanInclusive) &&
                Objects.equal(splSrvType, that.splSrvType) &&
                Objects.equal(splSrvInclusive, that.splSrvInclusive) &&
                Objects.equal(occInd, that.occInd) &&
                Objects.equal(crDatetime, that.crDatetime) &&
                Objects.equal(crSessionId, that.crSessionId) &&
                Objects.equal(mfdUserUid, that.mfdUserUid) &&
                Objects.equal(mfdDatetime, that.mfdDatetime) &&
                Objects.equal(mfdSessionId, that.mfdSessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unitCode, bkgRevDUid, busDate, curCode, oprCurCode, fxOprCur, roe, revpayCode, dayRateGross, dayRateNet, unitQty, mealPlanCode, mealPlanInclusive, splSrvType, splSrvInclusive, occInd, crUserUid, crDatetime, crSessionId, mfdUserUid, mfdDatetime, mfdSessionId);
    }
}
