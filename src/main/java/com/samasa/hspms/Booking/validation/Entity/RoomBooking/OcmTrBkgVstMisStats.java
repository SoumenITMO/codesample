package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ocm_tr_bkg_vst_mis_stats")
public class OcmTrBkgVstMisStats implements Serializable {
    private String unitCode;
    private Integer bkgVstMisUid;
    private Integer resvGUid;
    private Integer bkgUid;
    private Integer inHouseUid;
    private String occTypeId;
    private String nationality;
    private String domicile;
    private String misMs;
    private String misBs;
    private String misGc;
    private String misSb;
    private String misSalesExe;
    private String isWalkinn;
    private String occRmType;
    private String rateCode;
    private String occInd;
    private String nationalityDefault;
    private String nationalityApplytoall;
    private String domicileDefault;
    private String domicileApplytoall;
    private String stat1;
    private String stat2;
    private char stat3;
    private String stat4;
    private char stat5;
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
    @Column(name = "bkg_vst_mis_uid", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getBkgVstMisUid() {
        return bkgVstMisUid;
    }

    public void setBkgVstMisUid(Integer bkgVstMisUid) {
        this.bkgVstMisUid = bkgVstMisUid;
    }

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "bkg_uid", referencedColumnName = "bkg_uid", insertable = false, updatable = false)
    public OcmTrListReservedGuest getOcmTrListReservedGuest() {
        return ocmTrListReservedGuest;
    }

    public void setOcmTrListReservedGuest(OcmTrListReservedGuest ocmTrListReservedGuest) {
        this.ocmTrListReservedGuest = ocmTrListReservedGuest;
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
    @Column(name = "occ_type_id", nullable = false, length = 2)
    public String getOccTypeId() {
        return occTypeId;
    }

    public void setOccTypeId(String occTypeId) {
        this.occTypeId = occTypeId;
    }

    @Basic
    @Column(name = "nationality", nullable = true, length = 3)
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "domicile", nullable = true, length = 3)
    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    @Basic
    @Column(name = "mis_ms", nullable = true, length = 4)
    public String getMisMs() {
        return misMs;
    }

    public void setMisMs(String misMs) {
        this.misMs = misMs;
    }

    @Basic
    @Column(name = "mis_bs", nullable = true, length = 4)
    public String getMisBs() {
        return misBs;
    }

    public void setMisBs(String misBs) {
        this.misBs = misBs;
    }

    @Basic
    @Column(name = "mis_gc", nullable = true, length = 4)
    public String getMisGc() {
        return misGc;
    }

    public void setMisGc(String misGc) {
        this.misGc = misGc;
    }

    @Basic
    @Column(name = "mis_sb", nullable = true, length = 4)
    public String getMisSb() {
        return misSb;
    }

    public void setMisSb(String misSb) {
        this.misSb = misSb;
    }

    @Basic
    @Column(name = "mis_sales_exe", nullable = true, length = 3)
    public String getMisSalesExe() {
        return misSalesExe;
    }

    public void setMisSalesExe(String misSalesExe) {
        this.misSalesExe = misSalesExe;
    }

    @Basic
    @Column(name = "is_walkinn", nullable = false, length = 1)
    public String getIsWalkinn() {
        return isWalkinn;
    }

    public void setIsWalkinn(String isWalkinn) {
        this.isWalkinn = isWalkinn;
    }

    @Basic
    @Column(name = "occ_rm_type", nullable = true, length = 5)
    public String getOccRmType() {
        return occRmType;
    }

    public void setOccRmType(String occRmType) {
        this.occRmType = occRmType;
    }

    @Basic
    @Column(name = "rate_code", nullable = true, length = 12)
    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    @Basic
    @Column(name = "occ_ind", nullable = true, length = 3)
    public String getOccInd() {
        return occInd;
    }

    public void setOccInd(String occInd) {
        this.occInd = occInd;
    }

    @Basic
    @Column(name = "nationality_default", nullable = true, length = 3)
    public String getNationalityDefault() {
        return nationalityDefault;
    }

    public void setNationalityDefault(String nationalityDefault) {
        this.nationalityDefault = nationalityDefault;
    }

    @Basic
    @Column(name = "nationality_applytoall", nullable = false, length = 1)
    public String getNationalityApplytoall() {
        return nationalityApplytoall;
    }

    public void setNationalityApplytoall(String nationalityApplytoall) {
        this.nationalityApplytoall = nationalityApplytoall;
    }

    @Basic
    @Column(name = "domicile_default", nullable = true, length = 3)
    public String getDomicileDefault() {
        return domicileDefault;
    }

    public void setDomicileDefault(String domicileDefault) {
        this.domicileDefault = domicileDefault;
    }

    @Basic
    @Column(name = "domicile_applytoall", nullable = false, length = 1)
    public String getDomicileApplytoall() {
        return domicileApplytoall;
    }

    public void setDomicileApplytoall(String domicileApplytoall) {
        this.domicileApplytoall = domicileApplytoall;
    }

    @Basic
    @Column(name = "stat1", nullable = true, length = 10)
    public String getStat1() {
        return stat1;
    }

    public void setStat1(String stat1) {
        this.stat1 = stat1;
    }

    @Basic
    @Column(name = "stat2", nullable = true, length = 10)
    public String getStat2() {
        return stat2;
    }

    public void setStat2(String stat2) {
        this.stat2 = stat2;
    }

    @Basic
    @Column(name = "stat3", nullable = true, length = 10)
    public char getStat3() {
        return stat3;
    }

    public void setStat3(char stat3) {
        this.stat3 = stat3;
    }

    @Basic
    @Column(name = "stat4", nullable = true, length = 10)
    public String getStat4() {
        return stat4;
    }

    public void setStat4(String stat4) {
        this.stat4 = stat4;
    }

    @Basic
    @Column(name = "stat5", nullable = true, length = 10)
    public char getStat5() {
        return stat5;
    }

    public void setStat5(char stat5) {
        this.stat5 = stat5;
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
