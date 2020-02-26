package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

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
@Table(name = "ocm_tr_bkg_vst_rate_daily")
public class OcmTrBkgVstRateDaily {
    private String unitCode;
    private Integer bkgGstRateDUid;
    private Integer resvGUid;
    private Integer bkgUid;
    private Integer inHouseUid;
    private Date busDate;
    private String curCode;
    private String rateCode;
    private float roomRate;
    private String mealPlanCode;
    private String splSrvType;
    private String occInd;
    private Integer crUserUid;
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
    @Column(name = "bkg_gst_rate_d_uid", nullable = false)
    public Integer getBkgGstRateDUid() {
        return bkgGstRateDUid;
    }

    public void setBkgGstRateDUid(Integer bkgGstRateDUid) {
        this.bkgGstRateDUid = bkgGstRateDUid;
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
    @Column(name = "rate_code", nullable = false, length = 12)
    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    @Basic
    @Column(name = "room_rate", nullable = false, precision = 4)
    public float getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(float roomRate) {
        this.roomRate = roomRate;
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
    @Column(name = "spl_srv_type", nullable = true, length = 4)
    public String getSplSrvType() {
        return splSrvType;
    }

    public void setSplSrvType(String splSrvType) {
        this.splSrvType = splSrvType;
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
