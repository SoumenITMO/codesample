package com.samasa.hspms.Booking.validation.Dto.SubSections.RoomBooking;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.sql.Timestamp;

public class RoomBooking {

    private Integer bkgUid;
    private String unitCode;
    private String bkgNbr;
    private LocalDate bkgDate;
    private String bkgGenSource;
    private Date bkgDateFrom;
    private Date bkgDateTo;
    private Integer cortaGuestUid;
    private Integer cortaUid;
    private String cortaGuestAcType;
    private Integer groupUid;
    private String booker;
    private String resvContactPerson;
    private String resvContactNumber;
    private String confirmRequired;
    private Date confirmedOn;
    private String arrPickReq;
    private String arrMode;
    private String arrModeRefNo;
    private String arrVehCode;
    private String depDropReq;
    private String depMode;
    private String depModeRefNo;
    private String depVehCode;
    private String confirmMailSent;
    private String occStautsId;
    private String resvPropagation;
    private String externalBkgRefNo;
    private String externalPoRefNo;
    private String externalPoRefDate;
    private String statusEdit;
    private Integer crUserUid;
    private LocalDateTime crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;

    public Integer getBkgUid() {
        return bkgUid;
    }

    public void setBkgUid(Integer bkgUid) {
        this.bkgUid = bkgUid;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getBkgNbr() {
        return bkgNbr;
    }

    public void setBkgNbr(String bkgNbr) {
        this.bkgNbr = bkgNbr;
    }

    public LocalDate getBkgDate() {
        return bkgDate;
    }

    public void setBkgDate(LocalDate bkgDate) {
        this.bkgDate = bkgDate;
    }

    public String getBkgGenSource() {
        return bkgGenSource;
    }

    public void setBkgGenSource(String bkgGenSource) {
        this.bkgGenSource = bkgGenSource;
    }

    public Date getBkgDateFrom() {
        return bkgDateFrom;
    }

    public void setBkgDateFrom(Date bkgDateFrom) {
        this.bkgDateFrom = bkgDateFrom;
    }

    public Date getBkgDateTo() {
        return bkgDateTo;
    }

    public void setBkgDateTo(Date bkgDateTo) {
        this.bkgDateTo = bkgDateTo;
    }

    public Integer getCortaGuestUid() {
        return cortaGuestUid;
    }

    public void setCortaGuestUid(Integer cortaGuestUid) {
        this.cortaGuestUid = cortaGuestUid;
    }

    public Integer getCortaUid() {
        return cortaUid;
    }

    public void setCortaUid(Integer cortaUid) {
        this.cortaUid = cortaUid;
    }

    public String getCortaGuestAcType() {
        return cortaGuestAcType;
    }

    public void setCortaGuestAcType(String cortaGuestAcType) {
        this.cortaGuestAcType = cortaGuestAcType;
    }

    public Integer getGroupUid() {
        return groupUid;
    }

    public void setGroupUid(Integer groupUid) {
        this.groupUid = groupUid;
    }

    public String getBooker() {
        return booker;
    }

    public void setBooker(String booker) {
        this.booker = booker;
    }

    public String getResvContactPerson() {
        return resvContactPerson;
    }

    public void setResvContactPerson(String resvContactPerson) {
        this.resvContactPerson = resvContactPerson;
    }

    public String getResvContactNumber() {
        return resvContactNumber;
    }

    public void setResvContactNumber(String resvContactNumber) {
        this.resvContactNumber = resvContactNumber;
    }

    public String getConfirmRequired() {
        return confirmRequired;
    }

    public void setConfirmRequired(String confirmRequired) {
        this.confirmRequired = confirmRequired;
    }

    public Date getConfirmedOn() {
        return confirmedOn;
    }

    public void setConfirmedOn(Date confirmedOn) {
        this.confirmedOn = confirmedOn;
    }

    public String getArrPickReq() {
        return arrPickReq;
    }

    public void setArrPickReq(String arrPickReq) {
        this.arrPickReq = arrPickReq;
    }

    public String getArrMode() {
        return arrMode;
    }

    public void setArrMode(String arrMode) {
        this.arrMode = arrMode;
    }

    public String getArrModeRefNo() {
        return arrModeRefNo;
    }

    public void setArrModeRefNo(String arrModeRefNo) {
        this.arrModeRefNo = arrModeRefNo;
    }

    public String getArrVehCode() {
        return arrVehCode;
    }

    public void setArrVehCode(String arrVehCode) {
        this.arrVehCode = arrVehCode;
    }

    public String getDepDropReq() {
        return depDropReq;
    }

    public void setDepDropReq(String depDropReq) {
        this.depDropReq = depDropReq;
    }

    public String getDepMode() {
        return depMode;
    }

    public void setDepMode(String depMode) {
        this.depMode = depMode;
    }

    public String getDepModeRefNo() {
        return depModeRefNo;
    }

    public void setDepModeRefNo(String depModeRefNo) {
        this.depModeRefNo = depModeRefNo;
    }

    public String getDepVehCode() {
        return depVehCode;
    }

    public void setDepVehCode(String depVehCode) {
        this.depVehCode = depVehCode;
    }

    public String getConfirmMailSent() {
        return confirmMailSent;
    }

    public void setConfirmMailSent(String confirmMailSent) {
        this.confirmMailSent = confirmMailSent;
    }

    public String getOccStautsId() {
        return occStautsId;
    }

    public void setOccStautsId(String occStautsId) {
        this.occStautsId = occStautsId;
    }

    public String getResvPropagation() {
        return resvPropagation;
    }

    public void setResvPropagation(String resvPropagation) {
        this.resvPropagation = resvPropagation;
    }

    public String getExternalBkgRefNo() {
        return externalBkgRefNo;
    }

    public void setExternalBkgRefNo(String externalBkgRefNo) {
        this.externalBkgRefNo = externalBkgRefNo;
    }

    public String getExternalPoRefNo() {
        return externalPoRefNo;
    }

    public void setExternalPoRefNo(String externalPoRefNo) {
        this.externalPoRefNo = externalPoRefNo;
    }

    public String getExternalPoRefDate() {
        return externalPoRefDate;
    }

    public void setExternalPoRefDate(String externalPoRefDate) {
        this.externalPoRefDate = externalPoRefDate;
    }

    public String getStatusEdit() {
        return statusEdit;
    }

    public void setStatusEdit(String statusEdit) {
        this.statusEdit = statusEdit;
    }

    public Integer getCrUserUid() {
        return crUserUid;
    }

    public void setCrUserUid(Integer crUserUid) {
        this.crUserUid = crUserUid;
    }

    public LocalDateTime getCrDatetime() {
        return crDatetime;
    }

    public void setCrDatetime(LocalDateTime crDatetime) {
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
