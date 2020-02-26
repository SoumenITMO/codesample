package com.samasa.hspms.Booking.validation.Dto.SubSections.RateDailiy;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class RateDailyDto {

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
    private BigDecimal roomRate;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getBaseRateCode() {
        return baseRateCode;
    }

    public void setBaseRateCode(String baseRateCode) {
        this.baseRateCode = baseRateCode;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    public Date getBusDate() {
        return busDate;
    }

    public void setBusDate(Date busDate) {
        this.busDate = busDate;
    }

    public String getDow() {
        return dow;
    }

    public void setDow(String dow) {
        this.dow = dow;
    }

    public String getDowType() {
        return dowType;
    }

    public void setDowType(String dowType) {
        this.dowType = dowType;
    }

    public String getOccRmType() {
        return occRmType;
    }

    public void setOccRmType(String occRmType) {
        this.occRmType = occRmType;
    }

    public String getOccInd() {
        return occInd;
    }

    public void setOccInd(String occInd) {
        this.occInd = occInd;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    public String getRatexchType() {
        return ratexchType;
    }

    public void setRatexchType(String ratexchType) {
        this.ratexchType = ratexchType;
    }

    public BigDecimal getRatexchValue() {
        return ratexchValue;
    }

    public void setRatexchValue(BigDecimal ratexchValue) {
        this.ratexchValue = ratexchValue;
    }

    public BigDecimal getVirtualRate() {
        return virtualRate;
    }

    public void setVirtualRate(BigDecimal virtualRate) {
        this.virtualRate = virtualRate;
    }

    public BigDecimal getRatexchToleranceValue() {
        return ratexchToleranceValue;
    }

    public void setRatexchToleranceValue(BigDecimal ratexchToleranceValue) {
        this.ratexchToleranceValue = ratexchToleranceValue;
    }

    public BigDecimal getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(BigDecimal roomRate) {
        this.roomRate = roomRate;
    }

    public BigDecimal getExtraAdult() {
        return extraAdult;
    }

    public void setExtraAdult(BigDecimal extraAdult) {
        this.extraAdult = extraAdult;
    }

    public BigDecimal getExtraYouth() {
        return extraYouth;
    }

    public void setExtraYouth(BigDecimal extraYouth) {
        this.extraYouth = extraYouth;
    }

    public BigDecimal getExtraChild() {
        return extraChild;
    }

    public void setExtraChild(BigDecimal extraChild) {
        this.extraChild = extraChild;
    }

    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    public String getSplSrvType() {
        return splSrvType;
    }

    public void setSplSrvType(String splSrvType) {
        this.splSrvType = splSrvType;
    }

    public String getRevpayCode() {
        return revpayCode;
    }

    public void setRevpayCode(String revpayCode) {
        this.revpayCode = revpayCode;
    }

    public String getCtrlLedger() {
        return ctrlLedger;
    }

    public void setCtrlLedger(String ctrlLedger) {
        this.ctrlLedger = ctrlLedger;
    }

    public String getTaxInclusive() {
        return taxInclusive;
    }

    public void setTaxInclusive(String taxInclusive) {
        this.taxInclusive = taxInclusive;
    }

    public String getMealInclusive() {
        return mealInclusive;
    }

    public void setMealInclusive(String mealInclusive) {
        this.mealInclusive = mealInclusive;
    }

    public String getIsStopSell() {
        return isStopSell;
    }

    public void setIsStopSell(String isStopSell) {
        this.isStopSell = isStopSell;
    }

    public Integer getCrUserUid() {
        return crUserUid;
    }

    public void setCrUserUid(Integer crUserUid) {
        this.crUserUid = crUserUid;
    }

    public Timestamp getCrDatetime() {
        return crDatetime;
    }

    public void setCrDatetime(Timestamp crDatetime) {
        this.crDatetime = crDatetime;
    }

    public Integer getCrSessionId() {
        return crSessionId;
    }

    public void setCrSessionId(Integer crSessionId) {
        this.crSessionId = crSessionId;
    }

    public Integer getMfdUserUid() {
        return mfdUserUid;
    }

    public void setMfdUserUid(Integer mfdUserUid) {
        this.mfdUserUid = mfdUserUid;
    }

    public Timestamp getMfdDatetime() {
        return mfdDatetime;
    }

    public void setMfdDatetime(Timestamp mfdDatetime) {
        this.mfdDatetime = mfdDatetime;
    }

    public Integer getMfdSessionId() {
        return mfdSessionId;
    }

    public void setMfdSessionId(Integer mfdSessionId) {
        this.mfdSessionId = mfdSessionId;
    }
}
