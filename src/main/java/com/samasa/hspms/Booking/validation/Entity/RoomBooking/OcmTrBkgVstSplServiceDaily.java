package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "ocm_tr_bkg_vst_spl_service_daily")
public class OcmTrBkgVstSplServiceDaily {
    private String unitCode;
    private Integer bkgSplsrDUid;
    private Integer resvGUid;
    private Integer bkgUid;
    private Integer inHouseUid;
    private Date busDate;
    private String splSrvType;
    private String curCode;
    private Integer paxAdCount;
    private Integer paxYtCount;
    private Integer paxChCount;
    private Integer paxExAdCount;
    private Integer paxExYtCount;
    private Integer paxExChCount;
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
    @Column(name = "bkg_splsr_d_uid", nullable = false)
    public Integer getBkgSplsrDUid() {
        return bkgSplsrDUid;
    }

    public void setBkgSplsrDUid(Integer bkgSplsrDUid) {
        this.bkgSplsrDUid = bkgSplsrDUid;
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
    @Column(name = "spl_srv_type", nullable = false, length = 4)
    public String getSplSrvType() {
        return splSrvType;
    }

    public void setSplSrvType(String splSrvType) {
        this.splSrvType = splSrvType;
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
    @Column(name = "pax_ad_count", nullable = false)
    public Integer getPaxAdCount() {
        return paxAdCount;
    }

    public void setPaxAdCount(Integer paxAdCount) {
        this.paxAdCount = paxAdCount;
    }

    @Basic
    @Column(name = "pax_yt_count", nullable = false)
    public Integer getPaxYtCount() {
        return paxYtCount;
    }

    public void setPaxYtCount(Integer paxYtCount) {
        this.paxYtCount = paxYtCount;
    }

    @Basic
    @Column(name = "pax_ch_count", nullable = false)
    public Integer getPaxChCount() {
        return paxChCount;
    }

    public void setPaxChCount(Integer paxChCount) {
        this.paxChCount = paxChCount;
    }

    @Basic
    @Column(name = "pax_ex_ad_count", nullable = false)
    public Integer getPaxExAdCount() {
        return paxExAdCount;
    }

    public void setPaxExAdCount(Integer paxExAdCount) {
        this.paxExAdCount = paxExAdCount;
    }

    @Basic
    @Column(name = "pax_ex_yt_count", nullable = false)
    public Integer getPaxExYtCount() {
        return paxExYtCount;
    }

    public void setPaxExYtCount(Integer paxExYtCount) {
        this.paxExYtCount = paxExYtCount;
    }

    @Basic
    @Column(name = "pax_ex_ch_count", nullable = false)
    public Integer getPaxExChCount() {
        return paxExChCount;
    }

    public void setPaxExChCount(Integer paxExChCount) {
        this.paxExChCount = paxExChCount;
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
