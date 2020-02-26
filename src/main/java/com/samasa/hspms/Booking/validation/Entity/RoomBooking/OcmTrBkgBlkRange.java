package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import javax.persistence.*;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ocm_tr_bkg_blk_range")
public class OcmTrBkgBlkRange {
    private Integer bkgBlkRangeId;
    private String unitCode;
    private String bkgNbr;
    private Integer bkgUid;
    private Date arrDate;
    private Time arrETime;
    private Date depDate;
    private Time depETime;
    private String defltOccRmType;
    private String defltMealPlanCode;
    private String defltRateCode;
    private float defltRoomRate;
    private String defltCurCode;
    private String occStautsId;
    private String defltOccInd;
    private Integer crUserUid;
    private LocalDateTime crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bkg_blk_range_id", nullable = false)
    public Integer getBkgBlkRangeId() {
        return bkgBlkRangeId;
    }

    public void setBkgBlkRangeId(Integer bkgBlkRangeId) {
        this.bkgBlkRangeId = bkgBlkRangeId;
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
    @Column(name = "bkg_nbr", nullable = false)
    public String getBkgNbr() {
        return bkgNbr;
    }

    public void setBkgNbr(String bkgNbr) {
        this.bkgNbr = bkgNbr;
    }

    @Basic
    @Column(name = "bkg_uid", nullable = false)
    public Integer getBkgUid() {
        return bkgUid;
    }

    public void setBkgUid(Integer bkgUid) {
        this.bkgUid = bkgUid;
    }

    @Basic
    @Column(name = "arr_date", nullable = false)
    public Date getArrDate() {
        return arrDate;
    }

    public void setArrDate(Date arrDate) {
        this.arrDate = arrDate;
    }

    @Basic
    @Column(name = "arr_e_time", nullable = false)
    public Time getArrETime() {
        return arrETime;
    }

    public void setArrETime(Time arrETime) {
        this.arrETime = arrETime;
    }

    @Basic
    @Column(name = "dep_date", nullable = false)
    public Date getDepDate() {
        return depDate;
    }

    public void setDepDate(Date depDate) {
        this.depDate = depDate;
    }

    @Basic
    @Column(name = "dep_e_time", nullable = false)
    public Time getDepETime() {
        return depETime;
    }

    public void setDepETime(Time depETime) {
        this.depETime = depETime;
    }

    @Basic
    @Column(name = "deflt_occ_rm_type", nullable = true, length = 5)
    public String getDefltOccRmType() {
        return defltOccRmType;
    }

    public void setDefltOccRmType(String defltOccRmType) {
        this.defltOccRmType = defltOccRmType;
    }

    @Basic
    @Column(name = "deflt_meal_plan_code", nullable = true, length = 4)
    public String getDefltMealPlanCode() {
        return defltMealPlanCode;
    }

    public void setDefltMealPlanCode(String defltMealPlanCode) {
        this.defltMealPlanCode = defltMealPlanCode;
    }

    @Basic
    @Column(name = "deflt_rate_code", nullable = false, length = 12)
    public String getDefltRateCode() {
        return defltRateCode;
    }

    public void setDefltRateCode(String defltRateCode) {
        this.defltRateCode = defltRateCode;
    }

    @Basic
    @Column(name = "deflt_room_rate", nullable = false, length = 3)
    public float getDefltRoomRate() {
        return defltRoomRate;
    }

    public void setDefltRoomRate(float defltRoomRate) {
        this.defltRoomRate = defltRoomRate;
    }

    @Basic
    @Column(name = "deflt_cur_code", nullable = false, length = 3)
    public String getDefltCurCode() {
        return defltCurCode;
    }

    public void setDefltCurCode(String defltCurCode) {
        this.defltCurCode = defltCurCode;
    }

    @Basic
    @Column(name = "occ_stauts_id", nullable = false, length = 2)
    public String getOccStautsId() {
        return occStautsId;
    }

    public void setOccStautsId(String occStautsId) {
        this.occStautsId = occStautsId;
    }

    @Basic
    @Column(name = "deflt_occ_ind", nullable = false, length = 3)
    public String getDefltOccInd() {
        return defltOccInd;
    }

    public void setDefltOccInd(String defltOccInd) {
        this.defltOccInd = defltOccInd;
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
}
