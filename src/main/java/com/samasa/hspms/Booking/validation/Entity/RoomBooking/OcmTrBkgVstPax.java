package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import lombok.Data;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "ocm_tr_bkg_vst_pax")
public class OcmTrBkgVstPax implements Serializable {
    private String unitCode;
    private Integer bkgVstPaxUid;
    private Integer resvGUid;
    private Integer bkgUid;
    private Integer inHouseUid;
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
    private OcmTrListReservedGuest ocmTrListReservedGuest;

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
    @Column(name = "bkg_vst_pax_uid", nullable = false)
    public Integer getBkgVstPaxUid() {
        return bkgVstPaxUid;
    }

    public void setBkgVstPaxUid(Integer bkgVstPaxUid) {
        this.bkgVstPaxUid = bkgVstPaxUid;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "bkg_uid", referencedColumnName = "bkg_uid", updatable = false, insertable = false)
    public OcmTrListReservedGuest getOcmTrListReservedGuest() {
        return this.ocmTrListReservedGuest;
    }

    public void setOcmTrListReservedGuest(OcmTrListReservedGuest ocmTrListReservedGuest) {
        this.ocmTrListReservedGuest = ocmTrListReservedGuest;
    }

    public void setOcmTrListReservedGuest() {
        this.ocmTrListReservedGuest = ocmTrListReservedGuest;
    }

    @Column(name = "resv_g_uid", nullable = true)
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
    @Column(name = "pax_ad", nullable = false)
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
