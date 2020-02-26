package com.samasa.hspms.Booking.validation.Dto.SearchBookingInfo;

import java.sql.Date;

public class BookingInfo {
    private String fname;
    private String lname;
    private String title;
    private Integer bkgUid;
    private String profileId;
    private String pendingConfirmation;
    private Date confirmedOn;
    private char primary;
    private Integer companyTaTo;
    private Long NoOfNights;
    private String splSrvType;
    private Date arrDate;
    private Date deptDate;
    private String rmmType;
    private String occType;
    private Integer ad;
    private Integer yt;
    private Integer ch;
    private String rateCode;
    private float rmmRate;
    private String curCode;
    private String mealPlanCode;
    private String payMethod;
    private String cashOnly;
    private String allowPOS;
    private String billingInstruction;
    private String status;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public Integer getBkgUid() {
        return this.bkgUid;
    }

    public void setBkgUid(Integer bkgUid) {
        this.bkgUid = bkgUid;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getPendingConfirmation() {
        return pendingConfirmation;
    }

    public void setPendingConfirmation(String pendingConfirmation) {
        this.pendingConfirmation = pendingConfirmation;
    }

    public Date getConfirmedOn() {
        return confirmedOn;
    }

    public void setConfirmedOn(Date confirmedOn) {
        this.confirmedOn = confirmedOn;
    }

    public char getPrimary() {
        return primary;
    }

    public void setPrimary(char primary) {
        this.primary = primary;
    }

    public Integer getCompanyTaTo() {
        return companyTaTo;
    }

    public void setCompanyTaTo(Integer companyTaTo) {
        this.companyTaTo = companyTaTo;
    }

    public Long getNoOfNights() {
        return NoOfNights;
    }

    public void setNoOfNights(Long noOfNights) {
        NoOfNights = noOfNights;
    }

    public String getSplSrvType() {
        return splSrvType;
    }

    public void setSplSrvType(String splSrvType) {
        this.splSrvType = splSrvType;
    }

    public Date getArrDate() {
        return arrDate;
    }

    public void setArrDate(Date arrDate) {
        this.arrDate = arrDate;
    }

    public Date getDeptDate() {
        return deptDate;
    }

    public void setDeptDate(Date deptDate) {
        this.deptDate = deptDate;
    }

    public String getRmmType() {
        return rmmType;
    }

    public void setRmmType(String rmmType) {
        this.rmmType = rmmType;
    }

    public String getOccType() {
        return occType;
    }

    public void setOccType(String occType) {
        this.occType = occType;
    }

    public Integer getAd() {
        return ad;
    }

    public void setAd(Integer ad) {
        this.ad = ad;
    }

    public Integer getYt() {
        return yt;
    }

    public void setYt(Integer yt) {
        this.yt = yt;
    }

    public Integer getCh() {
        return ch;
    }

    public void setCh(Integer ch) {
        this.ch = ch;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public float getRmmRate() {
        return rmmRate;
    }

    public void setRmmRate(float rmmRate) {
        this.rmmRate = rmmRate;
    }

    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getCashOnly() {
        return cashOnly;
    }

    public void setCashOnly(String cashOnly) {
        this.cashOnly = cashOnly;
    }

    public String getAllowPOS() {
        return allowPOS;
    }

    public void setAllowPOS(String allowPOS) {
        this.allowPOS = allowPOS;
    }

    public String getBillingInstruction() {
        return billingInstruction;
    }

    public void setBillingInstruction(String billingInstruction) {
        this.billingInstruction = billingInstruction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
