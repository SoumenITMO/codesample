package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "ocm_tr_bkg_blk_daily")
public class OcmTrBkgBlkDaily {
    private String unitCode;
    private Integer bkgBlkDailyId;
    private Integer batchSeqId;
    private Integer bkgUid;
    private String bkgNbr;
    private Integer bkgRangeId;
    private Date busDate;
    private String occRmType;
    private Integer nfRoomBkd;
    private Integer nfRoomCxl;
    private Integer nfRoomPicked;
    private Integer nfRoomInhouse;
    private Integer nfRoomUsedAllot;
    private String isUpsell;
    private String nfRoomUpsell;
    private String mealPlanCode;
    private String rateCode;
    private float roomRate;
    private String occInd;
    private String curCode;
    private String occStautsId;
    private Integer crUserUid;
    private LocalDateTime crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
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
    @Column(name = "bkg_blk_daily_id", nullable = false)
    public Integer getBkgBlkDailyId() {
        return bkgBlkDailyId;
    }

    public void setBkgBlkDailyId(Integer bkgBlkDailyId) {
        this.bkgBlkDailyId = bkgBlkDailyId;
    }

    @Basic
    @Column(name = "batch_seq_id", nullable = false, length = 11)
    public Integer getBatchSeqId() {
        return batchSeqId;
    }

    public void setBatchSeqId(Integer batchSeqId) {
        this.batchSeqId = batchSeqId;
    }

    @Basic
    @Column(name = "bkg_uid", nullable = false, length = 11)
    public Integer getBkgUid() {
        return bkgUid;
    }

    public void setBkgUid(Integer bkgUid) {
        this.bkgUid = bkgUid;
    }

    @Basic
    @Column(name = "bkg_nbr", nullable = false, length = 11)
    public String getBkgNbr() {
        return bkgNbr;
    }

    public void setBkgNbr(String bkgNbr) {
        this.bkgNbr = bkgNbr;
    }

    @Basic
    @Column(name = "bkg_blk_range_id", nullable = false, length = 11)
    public Integer getBkgRangeId() {
        return bkgRangeId;
    }

    public void setBkgRangeId(Integer bkgRangeId) {
        this.bkgRangeId = bkgRangeId;
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
    @Column(name = "occ_rm_type", nullable = false, length = 5)
    public String getOccRmType() {
        return occRmType;
    }

    public void setOccRmType(String occRmType) {
        this.occRmType = occRmType;
    }

    @Basic
    @Column(name = "nf_room_bkd", nullable = true)
    public Integer getNfRoomBkd() {
        return nfRoomBkd;
    }

    public void setNfRoomBkd(Integer nfRoomBkd) {
        this.nfRoomBkd = nfRoomBkd;
    }

    @Basic
    @Column(name = "nf_room_cxl", nullable = false)
    public Integer getNfRoomCxl() {
        return nfRoomCxl;
    }

    public void setNfRoomCxl(Integer nfRoomCxl) {
        this.nfRoomCxl = nfRoomCxl;
    }

    @Basic
    @Column(name = "nf_room_picked", nullable = false)
    public Integer getNfRoomPicked() {
        return nfRoomPicked;
    }

    public void setNfRoomPicked(Integer nfRoomPicked) {
        this.nfRoomPicked = nfRoomPicked;
    }

    @Basic
    @Column(name = "nf_room_inhouse", nullable = false)
    public Integer getNfRoomInhouse() {
        return nfRoomInhouse;
    }

    public void setNfRoomInhouse(Integer nfRoomInhouse) {
        this.nfRoomInhouse = nfRoomInhouse;
    }

    @Basic
    @Column(name = "nf_room_used_allot", nullable = false)
    public Integer getNfRoomUsedAllot() {
        return nfRoomUsedAllot;
    }

    public void setNfRoomUsedAllot(Integer nfRoomUsedAllot) {
        this.nfRoomUsedAllot = nfRoomUsedAllot;
    }

    @Basic
    @Column(name = "is_upsell", nullable = false, length = 1)
    public String getIsUpsell() {
        return isUpsell;
    }

    public void setIsUpsell(String isUpsell) {
        this.isUpsell = isUpsell;
    }

    @Basic
    @Column(name = "nf_room_upsell", nullable = false, length = 3)
    public String getNfRoomUpsell() {
        return nfRoomUpsell;
    }

    public void setNfRoomUpsell(String nfRoomUpsell) {
        this.nfRoomUpsell = nfRoomUpsell;
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
    @Column(name = "occ_ind", nullable = false, length = 3)
    public String getOccInd() {
        return occInd;
    }

    public void setOccInd(String occInd) {
        this.occInd = occInd;
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
    @Column(name = "occ_stauts_id", nullable = false, length = 2)
    public String getOccStautsId() {
        return occStautsId;
    }

    public void setOccStautsId(String occStautsId) {
        this.occStautsId = occStautsId;
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
