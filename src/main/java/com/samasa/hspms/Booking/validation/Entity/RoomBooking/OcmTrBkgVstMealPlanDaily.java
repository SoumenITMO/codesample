package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "ocm_tr_bkg_vst_meal_plan_daily")
public class OcmTrBkgVstMealPlanDaily {
    private String unitCode;
    private Integer bkgMplanDUid;
    private Integer resvGUid;
    private Integer bkgUid;
    private Integer inHouseUid;
    private Date busDate;
    private Date cusmDate;
    private String mealPlanCode;
    private String curCode;
    private Integer paxAd;
    private Integer paxYt;
    private Integer paxCh;
    private Integer paxExAd;
    private Integer paxExYt;
    private Integer paxExCh;
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
    @Column(name = "bkg_mplan_d_uid", nullable = false)
    public Integer getBkgMplanDUid() {
        return bkgMplanDUid;
    }

    public void setBkgMplanDUid(Integer bkgMplanDUid) {
        this.bkgMplanDUid = bkgMplanDUid;
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

    @Column(name = "inhouse_uid", nullable = true)
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
    @Column(name = "cusm_date", nullable = false)
    public Date getCusmDate() {
        return cusmDate;
    }

    public void setCusmDate(Date cusmDate) {
        this.cusmDate = cusmDate;
    }

    @Basic
    @Column(name = "meal_plan_code", nullable = false, length = 4)
    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
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
    @Column(name = "pax_ad", nullable = true)
    public Integer getPaxAd() {
        return paxAd;
    }

    public void setPaxAd(Integer paxAd) {
        this.paxAd = paxAd;
    }

    @Basic
    @Column(name = "pax_yt", nullable = false)
    public Integer getPaxYt() {
        return paxYt;
    }

    public void setPaxYt(Integer paxYt) {
        this.paxYt = paxYt;
    }

    @Basic
    @Column(name = "pax_ch", nullable = false)
    public Integer getPaxCh() {
        return paxCh;
    }

    public void setPaxCh(Integer paxCh) {
        this.paxCh = paxCh;
    }

    @Basic
    @Column(name = "pax_ex_ad", nullable = false)
    public Integer getPaxExAd() {
        return paxExAd;
    }

    public void setPaxExAd(Integer paxExAd) {
        this.paxExAd = paxExAd;
    }

    @Basic
    @Column(name = "pax_ex_yt", nullable = false)
    public Integer getPaxExYt() {
        return paxExYt;
    }

    public void setPaxExYt(Integer paxExYt) {
        this.paxExYt = paxExYt;
    }

    @Basic
    @Column(name = "pax_ex_ch", nullable = false)
    public Integer getPaxExCh() {
        return paxExCh;
    }

    public void setPaxExCh(Integer paxExCh) {
        this.paxExCh = paxExCh;
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
