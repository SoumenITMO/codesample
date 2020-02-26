package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.samasa.hspms.guest.Entity.GuestAccount;
import lombok.Data;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "ocm_tr_list_reserved_guest")
public class OcmTrListReservedGuest implements java.io.Serializable {
    private String unitCode;
    private Integer resvGUid;
    private Integer bkgUid;
    private Integer batchSeqId;
    private Integer bkgBlkRangeId;
    private Integer bkgBlkDailyId;
    private String bkgNbr;
    private Integer guestUid;
    private Date arrDate;
    private Time arrETime;
    private Date depDate;
    private Time depETime;
    private String paxType;
    private char primaryInd;
    private Integer sharesWithGuestUid;
    private Integer groupUid;
    private String occStautsId;
    private String arrPickReq;
    private String arrMode;
    private String arrModeRefNo;
    private String arrPickedUp;
    private String arrVehCode;
    private String depDropReq;
    private String depMode;
    private String depModeRefNo;
    private String depDropped;
    private String depVehCode;
    private Integer indvConfirmNumber;
    private String confirmMailSent;
    private String isRoomPicked;
    private String isRoomCxld;
    private String isCheckedIn;
    private String isCheckedOut;
    private String isUpsell;
    private String roomNo;
    private String mealPlanCode;
    private String rateCode;
    private float roomRate;
    private String occInd;
    private String curCode;
    private float upgradedRoomRate;
    private String statusEdit;
    private LocalDateTime crDatetime;
    private Integer crSessionId;
    private Integer crUserUid;
    private Integer mfdUserUid;
    private Integer mfdSessionId;
    private LocalDateTime mfdDatetime;
    private OcmTrBkgHdr ocmTrBkgHdr;
    private GuestAccount guestAccount;
    private OcmTrBkgVstMisStats ocmTrBkgVstMisStats;
    private OcmTrBkgVstMealPlanRange ocmTrBkgVstMealPlanRange;
    private OcmTrBkgVstPax ocmTrBkgVstPax;
    private OcmTrBkgVstBilling ocmTrBkgVstBilling;
    private OcmTrBkgVstSplServiceRange ocmTrBkgVstSplServiceRange;

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
    @Column(name = "resv_g_uid", nullable = false)
    public Integer getResvGUid() {
        return resvGUid;
    }

    public void setResvGUid(Integer resvGUid) {
        this.resvGUid = resvGUid;
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
    @Column(name = "batch_seq_id", nullable = false)
    public Integer getBatchSeqId() {
        return batchSeqId;
    }

    public void setBatchSeqId(Integer batchSeqId) {
        this.batchSeqId = batchSeqId;
    }


    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "bkg_uid", referencedColumnName = "bkg_uid", updatable = false, insertable = false)
    public OcmTrBkgVstPax getOcmTrBkgVstPax() {
        return this.ocmTrBkgVstPax;
    }

    public void setOcmTrBkgVstPax(OcmTrBkgVstPax ocmTrBkgVstPax) {
        this.ocmTrBkgVstPax = ocmTrBkgVstPax;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bkg_uid", referencedColumnName = "bkg_uid", insertable = false, updatable = false)
    public OcmTrBkgVstMealPlanRange getOcmTrBkgVstMealPlanRange() {
        return this.ocmTrBkgVstMealPlanRange;
    }

    public void setOcmTrBkgVstMealPlanRange(OcmTrBkgVstMealPlanRange ocmTrBkgVstMealPlanRange) {
        this.ocmTrBkgVstMealPlanRange = ocmTrBkgVstMealPlanRange;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "bkg_uid", insertable = false, updatable = false)
    @JsonIgnore
    public OcmTrBkgHdr getOcmTrBkgHdr() {
        return ocmTrBkgHdr;
    }

    public void setOcmTrBkgHdr(OcmTrBkgHdr ocmTrBkgHdr) {
        this.ocmTrBkgHdr = ocmTrBkgHdr;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "guest_uid", referencedColumnName = "guest_uid", insertable = false, updatable = false)
    public GuestAccount getGuestAccount() {
        return guestAccount;
    }

    public void setGuestAccount(GuestAccount guestAccount) {
        this.guestAccount = guestAccount;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "bkg_uid", referencedColumnName = "bkg_uid", insertable = false, updatable = false)
    public OcmTrBkgVstMisStats getOcmTrBkgVstMisStats() {
        return ocmTrBkgVstMisStats;
    }

    public void setOcmTrBkgVstMisStats(OcmTrBkgVstMisStats ocmTrBkgVstMisStats) {
        this.ocmTrBkgVstMisStats = ocmTrBkgVstMisStats;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "bkg_uid", referencedColumnName = "bkg_uid", insertable = false, updatable = false)
    public OcmTrBkgVstSplServiceRange getOcmTrBkgVstSplServiceRange() {
        return this.ocmTrBkgVstSplServiceRange;
    }

    public void setOcmTrBkgVstSplServiceRange(OcmTrBkgVstSplServiceRange ocmTrBkgVstSplServiceRange) {
        this.ocmTrBkgVstSplServiceRange = ocmTrBkgVstSplServiceRange;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "bkg_uid", referencedColumnName = "bkg_uid", insertable = false, updatable = false)
    public OcmTrBkgVstBilling getOcmTrBkgVstBilling() {
        return this.ocmTrBkgVstBilling;
    }

    public void setOcmTrBkgVstBilling(OcmTrBkgVstBilling ocmTrBkgVstBilling) {
        this.ocmTrBkgVstBilling = ocmTrBkgVstBilling;
    }

    @Basic
    @Column(name = "bkg_blk_range_id", nullable = false)
    public Integer getBkgBlkRangeId() {
        return bkgBlkRangeId;
    }

    public void setBkgBlkRangeId(Integer bkgBlkRangeId) {
        this.bkgBlkRangeId = bkgBlkRangeId;
    }

    @Basic
    @Column(name = "bkg_blk_daily_id", nullable = false)
    public Integer getBkgBlkDailyId() {
        return bkgBlkDailyId;
    }

    public void setBkgBlkDailyId(Integer bkgBlkDailyId) {
        this.bkgBlkDailyId = bkgBlkDailyId;
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
    @Column(name = "guest_uid", nullable = false)
    public Integer getGuestUid() {
        return guestUid;
    }

    public void setGuestUid(Integer guestUid) {
        this.guestUid = guestUid;
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
    @Column(name = "pax_type", nullable = false, length = 2)
    public String getPaxType() {
        return paxType;
    }

    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    @Basic
    @Column(name = "primary_ind", nullable = false, length = 1)
    public char getPrimaryInd() {
        return primaryInd;
    }

    public void setPrimaryInd(char primaryInd) {
        this.primaryInd = primaryInd;
    }

    @Basic
    @Column(name = "shares_with_guest_uid", nullable = false)
    public Integer getSharesWithGuestUid() {
        return sharesWithGuestUid;
    }

    public void setSharesWithGuestUid(Integer sharesWithGuestUid) {
        this.sharesWithGuestUid = sharesWithGuestUid;
    }

    @Basic
    @Column(name = "group_uid", nullable = false)
    public Integer getGroupUid() {
        return groupUid;
    }

    public void setGroupUid(Integer groupUid) {
        this.groupUid = groupUid;
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
    @Column(name = "arr_pick_req", nullable = false, length = 1)
    public String getArrPickReq() {
        return arrPickReq;
    }

    public void setArrPickReq(String arrPickReq) {
        this.arrPickReq = arrPickReq;
    }

    @Basic
    @Column(name = "arr_mode", nullable = false, length = 3)
    public String getArrMode() {
        return arrMode;
    }

    public void setArrMode(String arrMode) {
        this.arrMode = arrMode;
    }

    @Basic
    @Column(name = "arr_mode_ref_no", nullable = false, length = 20)
    public String getArrModeRefNo() {
        return arrModeRefNo;
    }

    public void setArrModeRefNo(String arrModeRefNo) {
        this.arrModeRefNo = arrModeRefNo;
    }

    @Basic
    @Column(name = "arr_picked_up", nullable = false, length = 1)
    public String getArrPickedUp() {
        return arrPickedUp;
    }

    public void setArrPickedUp(String arrPickedUp) {
        this.arrPickedUp = arrPickedUp;
    }

    @Basic
    @Column(name = "arr_veh_code", nullable = true, length = 3)
    public String getArrVehCode() {
        return arrVehCode;
    }

    public void setArrVehCode(String arrVehCode) {
        this.arrVehCode = arrVehCode;
    }

    @Basic
    @Column(name = "dep_drop_req", nullable = false, length = 1)
    public String getDepDropReq() {
        return depDropReq;
    }

    public void setDepDropReq(String depDropReq) {
        this.depDropReq = depDropReq;
    }

    @Basic
    @Column(name = "dep_mode", nullable = true, length = 3)
    public String getDepMode() {
        return depMode;
    }

    public void setDepMode(String depMode) {
        this.depMode = depMode;
    }

    @Basic
    @Column(name = "dep_mode_ref_no", nullable = true, length = 20)
    public String getDepModeRefNo() {
        return depModeRefNo;
    }

    public void setDepModeRefNo(String depModeRefNo) {
        this.depModeRefNo = depModeRefNo;
    }

    @Basic
    @Column(name = "dep_dropped", nullable = false, length = 1)
    public String getDepDropped() {
        return depDropped;
    }

    public void setDepDropped(String depDropped) {
        this.depDropped = depDropped;
    }

    @Basic
    @Column(name = "dep_veh_code", nullable = true, length = 3)
    public String getDepVehCode() {
        return depVehCode;
    }

    public void setDepVehCode(String depVehCode) {
        this.depVehCode = depVehCode;
    }

    @Basic
    @Column(name = "indv_confirm_number", nullable = true)
    public Integer getIndvConfirmNumber() {
        return indvConfirmNumber;
    }

    public void setIndvConfirmNumber(Integer indvConfirmNumber) {
        this.indvConfirmNumber = indvConfirmNumber;
    }

    @Basic
    @Column(name = "confirm_mail_sent", nullable = false, length = 1)
    public String getConfirmMailSent() {
        return confirmMailSent;
    }

    public void setConfirmMailSent(String confirmMailSent) {
        this.confirmMailSent = confirmMailSent;
    }

    @Basic
    @Column(name = "is_room_picked", nullable = false, length = 1)
    public String getIsRoomPicked() {
        return isRoomPicked;
    }

    public void setIsRoomPicked(String isRoomPicked) {
        this.isRoomPicked = isRoomPicked;
    }

    @Basic
    @Column(name = "is_room_cxld", nullable = false, length = 1)
    public String getIsRoomCxld() {
        return isRoomCxld;
    }

    public void setIsRoomCxld(String isRoomCxld) {
        this.isRoomCxld = isRoomCxld;
    }

    @Basic
    @Column(name = "is_checked_in", nullable = false, length = 1)
    public String getIsCheckedIn() {
        return isCheckedIn;
    }

    public void setIsCheckedIn(String isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }

    @Basic
    @Column(name = "is_checked_out", nullable = false, length = 1)
    public String getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(String isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
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
    @Column(name = "room_no", nullable = false, length = 10)
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
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
    @Column(name = "occ_ind", nullable = false, length = 2)
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
    @Column(name = "upgraded_room_rate", nullable = false, precision = 4)
    public float getUpgradedRoomRate() {
        return upgradedRoomRate;
    }

    public void setUpgradedRoomRate(float upgradedRoomRate) {
        this.upgradedRoomRate = upgradedRoomRate;
    }

    @Basic
    @Column(name = "status_edit", nullable = false, length = 1)
    public String getStatusEdit() {
        return statusEdit;
    }

    public void setStatusEdit(String statusEdit) {
        this.statusEdit = statusEdit;
    }

    @Basic
    @Column(name = "cr_datetime", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.NUMBER)
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
    @Column(name = "cr_user_uid", nullable = false)
    public Integer getCrUserUid() {
        return crUserUid;
    }

    public void setCrUserUid(Integer crUserUid) {
        this.crUserUid = crUserUid;
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
    @Column(name = "mfd_session_id", nullable = true)
    public Integer getMfdSessionId() {
        return mfdSessionId;
    }

    public void setMfdSessionId(Integer mfdSessionId) {
        this.mfdSessionId = mfdSessionId;
    }

    @Basic
    @Column(name = "mfd_datetime", nullable = true)
    public LocalDateTime getMfdDatetime() {
        return mfdDatetime;
    }

    public void setMfdDatetime(LocalDateTime mfdDatetime) {
        this.mfdDatetime = mfdDatetime;
    }
}
