package com.samasa.hspms.Booking.validation.Dto.SubSections.RoomTypeAvailable;

import java.sql.Date;
import java.sql.Timestamp;

public class RoomTypeAvailableDto {

    private Integer roomNoAvalId;
    private String unitCode;
    private Date busDate;
    private String roomNo;
    private String roomStautsId;
    private String occClstatusId;
    private String occInd;
    private String roomType;
    private String occRmType;
    private Integer crUserUid;
    private Timestamp crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;

    public Integer getRoomNoAvalId() {
        return roomNoAvalId;
    }

    public void setRoomNoAvalId(Integer roomNoAvalId) {
        this.roomNoAvalId = roomNoAvalId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Date getBusDate() {
        return busDate;
    }

    public void setBusDate(Date busDate) {
        this.busDate = busDate;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomStautsId() {
        return roomStautsId;
    }

    public void setRoomStautsId(String roomStautsId) {
        this.roomStautsId = roomStautsId;
    }

    public String getOccClstatusId() {
        return occClstatusId;
    }

    public void setOccClstatusId(String occClstatusId) {
        this.occClstatusId = occClstatusId;
    }

    public String getOccInd() {
        return occInd;
    }

    public void setOccInd(String occInd) {
        this.occInd = occInd;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getOccRmType() {
        return occRmType;
    }

    public void setOccRmType(String occRmType) {
        this.occRmType = occRmType;
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
