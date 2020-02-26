package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "tr_ocm_room_no_aval")
public class TrOcmRoomNoAval {
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
    private LocalDateTime crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private LocalDateTime mfdDatetime;
    private Integer mfdSessionId;

    @Id
    @Column(name = "room_no_aval_id", nullable = false)
    public Integer getRoomNoAvalId() {
        return roomNoAvalId;
    }

    public void setRoomNoAvalId(Integer roomNoAvalId) {
        this.roomNoAvalId = roomNoAvalId;
    }

    @Basic
    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
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
    @Column(name = "room_no", nullable = false, length = 10)
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    @Basic
    @Column(name = "room_stauts_id", nullable = false, length = 2)
    public String getRoomStautsId() {
        return roomStautsId;
    }

    public void setRoomStautsId(String roomStautsId) {
        this.roomStautsId = roomStautsId;
    }

    @Basic
    @Column(name = "occ_clstatus_id", nullable = false, length = 2)
    public String getOccClstatusId() {
        return occClstatusId;
    }

    public void setOccClstatusId(String occClstatusId) {
        this.occClstatusId = occClstatusId;
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
    @Column(name = "room_type", nullable = false, length = 5)
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Basic
    @Column(name = "occ_rm_type", nullable = false, length = 5)
    public String getOccRmType() {
        return occRmType;
    }

    public void setOccRmType(String occRmType) {
        this.occRmType = occRmType;
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
}
