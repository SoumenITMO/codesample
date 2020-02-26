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
@Table(name = "frm_rate_header")
@IdClass(FrmRateHeaderSearchPK.class)
public class FrmRateHeaderSearch {
    private Integer rateHeaderId;
    private String unitCode;
    private String mgdUnitCode;
    private String baseRateCode;
    private String rateType;
    private String rateCode;
    private String rateDesc;
    private String baseRateRemark;
    private String saleActive;
    private Integer stayDurMin;
    private Integer stayDurMax;
    private String packageInd;
    private String revpayCode;
    private String applicableDiscount;
    private String applicableComision;
    private String taxInclusive;
    private String mealInclusive;
    private String htngCode;
    private Integer crUserUid;
    private Timestamp crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;

    @Basic
    @Column(name = "rate_header_id")
    public Integer getRateHeaderId() {
        return rateHeaderId;
    }

    public void setRateHeaderId(Integer rateHeaderId) {
        this.rateHeaderId = rateHeaderId;
    }

    @Id
    @Column(name = "unit_code")
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Basic
    @Column(name = "mgd_unit_code")
    public String getMgdUnitCode() {
        return mgdUnitCode;
    }

    public void setMgdUnitCode(String mgdUnitCode) {
        this.mgdUnitCode = mgdUnitCode;
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
    @Column(name = "rate_type")
    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    @Id
    @Column(name = "rate_code")
    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    @Basic
    @Column(name = "rate_desc")
    public String getRateDesc() {
        return rateDesc;
    }

    public void setRateDesc(String rateDesc) {
        this.rateDesc = rateDesc;
    }

    @Basic
    @Column(name = "base_rate_remark")
    public String getBaseRateRemark() {
        return baseRateRemark;
    }

    public void setBaseRateRemark(String baseRateRemark) {
        this.baseRateRemark = baseRateRemark;
    }

    @Basic
    @Column(name = "sale_active")
    public String getSaleActive() {
        return saleActive;
    }

    public void setSaleActive(String saleActive) {
        this.saleActive = saleActive;
    }

    @Basic
    @Column(name = "stay_dur_min")
    public Integer getStayDurMin() {
        return stayDurMin;
    }

    public void setStayDurMin(Integer stayDurMin) {
        this.stayDurMin = stayDurMin;
    }

    @Basic
    @Column(name = "stay_dur_max")
    public Integer getStayDurMax() {
        return stayDurMax;
    }

    public void setStayDurMax(Integer stayDurMax) {
        this.stayDurMax = stayDurMax;
    }

    @Basic
    @Column(name = "package_ind")
    public String getPackageInd() {
        return packageInd;
    }

    public void setPackageInd(String packageInd) {
        this.packageInd = packageInd;
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
    @Column(name = "applicable_discount")
    public String getApplicableDiscount() {
        return applicableDiscount;
    }

    public void setApplicableDiscount(String applicableDiscount) {
        this.applicableDiscount = applicableDiscount;
    }

    @Basic
    @Column(name = "applicable_comision")
    public String getApplicableComision() {
        return applicableComision;
    }

    public void setApplicableComision(String applicableComision) {
        this.applicableComision = applicableComision;
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
    @Column(name = "htng_code")
    public String getHtngCode() {
        return htngCode;
    }

    public void setHtngCode(String htngCode) {
        this.htngCode = htngCode;
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
        FrmRateHeaderSearch that = (FrmRateHeaderSearch) o;
        return Objects.equal(rateHeaderId, that.rateHeaderId) &&
                Objects.equal(unitCode, that.unitCode) &&
                Objects.equal(mgdUnitCode, that.mgdUnitCode) &&
                Objects.equal(baseRateCode, that.baseRateCode) &&
                Objects.equal(rateType, that.rateType) &&
                Objects.equal(rateCode, that.rateCode) &&
                Objects.equal(rateDesc, that.rateDesc) &&
                Objects.equal(baseRateRemark, that.baseRateRemark) &&
                Objects.equal(saleActive, that.saleActive) &&
                Objects.equal(stayDurMin, that.stayDurMin) &&
                Objects.equal(stayDurMax, that.stayDurMax) &&
                Objects.equal(packageInd, that.packageInd) &&
                Objects.equal(revpayCode, that.revpayCode) &&
                Objects.equal(applicableDiscount, that.applicableDiscount) &&
                Objects.equal(applicableComision, that.applicableComision) &&
                Objects.equal(taxInclusive, that.taxInclusive) &&
                Objects.equal(mealInclusive, that.mealInclusive) &&
                Objects.equal(htngCode, that.htngCode) &&
                Objects.equal(crUserUid, that.crUserUid) &&
                Objects.equal(crDatetime, that.crDatetime) &&
                Objects.equal(crSessionId, that.crSessionId) &&
                Objects.equal(mfdUserUid, that.mfdUserUid) &&
                Objects.equal(mfdDatetime, that.mfdDatetime) &&
                Objects.equal(mfdSessionId, that.mfdSessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rateHeaderId, unitCode, mgdUnitCode, baseRateCode, rateType, rateCode, rateDesc, baseRateRemark, saleActive, stayDurMin, stayDurMax, packageInd, revpayCode, applicableDiscount, applicableComision, taxInclusive, mealInclusive, htngCode, crUserUid, crDatetime, crSessionId, mfdUserUid, mfdDatetime, mfdSessionId);
    }
}
