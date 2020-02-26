package com.samasa.hspms.Booking.validation.Entity.Corta;

import javax.persistence.*;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgHdr;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "corta_account")
public class CortaAccount implements Serializable {
    private Integer id;
    private String corpId;
    private String unitCode;
    private Integer cortaUid;
    private String cortaCode;
    private String mgdUnitCode;
    private String allowUnitLevelUpdate;
    private String cortaAcType;
    private String cortaName;
    private String cortaSortName;
    private Integer cortaAccountParentUid;
    private String activeManagerId;
    private String statusMarketing;
    private String statusCreditAllowed;
    private String slUid;
    private String statusCashOnly;
    private String statusBlacklist;
    private String cortaGroupId;
    private String cortaTypeId;
    private String cortaCatgId;
    private String cortaIndId;
    private String cortaBusRegId;
    private String cortaHtngCode;
    private String statusPotential;
    private String cortaLngCode;
    private String cortaComment;
    private String cortaFoRelated;
    private String cortaEventsRelated;
    private Integer cortaGstVatNumber;
    private Integer crUserUid;
    private Timestamp crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;
    private OcmTrBkgHdr ocmTrBkgHdr;

    @Basic
    @Id
    @Column(name = "id", nullable = false, length = 10)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "corp_id", nullable = false, length = 10)
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Column(name = "corta_uid", nullable = false)
    public Integer getCortaUid() {
        return cortaUid;
    }

    public void setCortaUid(Integer cortaUid) {
        this.cortaUid = cortaUid;
    }

    @Basic
    @Column(name = "corta_code", nullable = false, length = 20)
    public String getCortaCode() {
        return cortaCode;
    }

    public void setCortaCode(String cortaCode) {
        this.cortaCode = cortaCode;
    }

    @Basic
    @Column(name = "mgd_unit_code", nullable = false, length = 5)
    public String getMgdUnitCode() {
        return mgdUnitCode;
    }

    public void setMgdUnitCode(String mgdUnitCode) {
        this.mgdUnitCode = mgdUnitCode;
    }

    @Basic
    @Column(name = "allow_unit_level_update", nullable = false, length = 1)
    public String getAllowUnitLevelUpdate() {
        return allowUnitLevelUpdate;
    }

    public void setAllowUnitLevelUpdate(String allowUnitLevelUpdate) {
        this.allowUnitLevelUpdate = allowUnitLevelUpdate;
    }

    @Basic
    @Column(name = "corta_ac_type", nullable = false, length = 3)
    public String getCortaAcType() {
        return cortaAcType;
    }

    public void setCortaAcType(String cortaAcType) {
        this.cortaAcType = cortaAcType;
    }

    @Basic
    @Column(name = "corta_name", nullable = false, length = 100)
    public String getCortaName() {
        return cortaName;
    }

    public void setCortaName(String cortaName) {
        this.cortaName = cortaName;
    }

    @Basic
    @Column(name = "corta_sort_name", nullable = false, length = 30)
    public String getCortaSortName() {
        return cortaSortName;
    }

    public void setCortaSortName(String cortaSortName) {
        this.cortaSortName = cortaSortName;
    }

    @Basic
    @Column(name = "corta_account_parent_uid", nullable = false)
    public Integer getCortaAccountParentUid() {
        return cortaAccountParentUid;
    }

    public void setCortaAccountParentUid(Integer cortaAccountParentUid) {
        this.cortaAccountParentUid = cortaAccountParentUid;
    }

    @Basic
    @Column(name = "active_manager_id", nullable = false, length = 3)
    public String getActiveManagerId() {
        return activeManagerId;
    }

    public void setActiveManagerId(String activeManagerId) {
        this.activeManagerId = activeManagerId;
    }

    @Basic
    @Column(name = "status_marketing", nullable = false, length = 1)
    public String getStatusMarketing() {
        return statusMarketing;
    }

    public void setStatusMarketing(String statusMarketing) {
        this.statusMarketing = statusMarketing;
    }

    @Basic
    @Column(name = "status_credit_allowed", nullable = false, length = 1)
    public String getStatusCreditAllowed() {
        return statusCreditAllowed;
    }

    public void setStatusCreditAllowed(String statusCreditAllowed) {
        this.statusCreditAllowed = statusCreditAllowed;
    }

    @Basic
    @Column(name = "sl_uid", nullable = false, length = 12)
    public String getSlUid() {
        return slUid;
    }

    public void setSlUid(String slUid) {
        this.slUid = slUid;
    }

    @Basic
    @Column(name = "status_cash_only", nullable = false, length = 1)
    public String getStatusCashOnly() {
        return statusCashOnly;
    }

    public void setStatusCashOnly(String statusCashOnly) {
        this.statusCashOnly = statusCashOnly;
    }

    @Basic
    @Column(name = "status_blacklist", nullable = false, length = 1)
    public String getStatusBlacklist() {
        return statusBlacklist;
    }

    public void setStatusBlacklist(String statusBlacklist) {
        this.statusBlacklist = statusBlacklist;
    }

    @Basic
    @Column(name = "corta_group_id", nullable = false, length = 3)
    public String getCortaGroupId() {
        return cortaGroupId;
    }

    public void setCortaGroupId(String cortaGroupId) {
        this.cortaGroupId = cortaGroupId;
    }

    @Basic
    @Column(name = "corta_type_id", nullable = false, length = 3)
    public String getCortaTypeId() {
        return cortaTypeId;
    }

    public void setCortaTypeId(String cortaTypeId) {
        this.cortaTypeId = cortaTypeId;
    }

    @Basic
    @Column(name = "corta_catg_id", nullable = false, length = 3)
    public String getCortaCatgId() {
        return cortaCatgId;
    }

    public void setCortaCatgId(String cortaCatgId) {
        this.cortaCatgId = cortaCatgId;
    }

    @Basic
    @Column(name = "corta_ind_id", nullable = false, length = 3)
    public String getCortaIndId() {
        return cortaIndId;
    }

    public void setCortaIndId(String cortaIndId) {
        this.cortaIndId = cortaIndId;
    }

    @Basic
    @Column(name = "corta_bus_reg_id", nullable = false, length = 3)
    public String getCortaBusRegId() {
        return cortaBusRegId;
    }

    public void setCortaBusRegId(String cortaBusRegId) {
        this.cortaBusRegId = cortaBusRegId;
    }

    @Basic
    @Column(name = "corta_htng_code", nullable = true, length = 20)
    public String getCortaHtngCode() {
        return cortaHtngCode;
    }

    public void setCortaHtngCode(String cortaHtngCode) {
        this.cortaHtngCode = cortaHtngCode;
    }

    @Basic
    @Column(name = "status_potential", nullable = false, length = 2)
    public String getStatusPotential() {
        return statusPotential;
    }

    public void setStatusPotential(String statusPotential) {
        this.statusPotential = statusPotential;
    }

    @Basic
    @Column(name = "corta_lng_code", nullable = false, length = 3)
    public String getCortaLngCode() {
        return cortaLngCode;
    }

    public void setCortaLngCode(String cortaLngCode) {
        this.cortaLngCode = cortaLngCode;
    }

    @Basic
    @Column(name = "corta_comment", nullable = false, length = 255)
    public String getCortaComment() {
        return cortaComment;
    }

    public void setCortaComment(String cortaComment) {
        this.cortaComment = cortaComment;
    }

    @Basic
    @Column(name = "corta_fo_related", nullable = false, length = 1)
    public String getCortaFoRelated() {
        return cortaFoRelated;
    }

    public void setCortaFoRelated(String cortaFoRelated) {
        this.cortaFoRelated = cortaFoRelated;
    }

    @Basic
    @Column(name = "corta_events_related", nullable = false, length = 1)
    public String getCortaEventsRelated() {
        return cortaEventsRelated;
    }

    public void setCortaEventsRelated(String cortaEventsRelated) {
        this.cortaEventsRelated = cortaEventsRelated;
    }

    @Basic
    @Column(name = "corta_gst_vat_number", nullable = false)
    public Integer getCortaGstVatNumber() {
        return cortaGstVatNumber;
    }

    public void setCortaGstVatNumber(Integer cortaGstVatNumber) {
        this.cortaGstVatNumber = cortaGstVatNumber;
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
    public Timestamp getCrDatetime() {
        return crDatetime;
    }

    public void setCrDatetime(Timestamp crDatetime) {
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
    
	
	  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  @JoinColumn(name = "corta_uid", referencedColumnName = "corta_uid",
	  insertable = false, updatable = false) public OcmTrBkgHdr getOcmTrBkgHdr() {
	  return ocmTrBkgHdr; }
	  
	  public void setOcmTrBkgHdr(OcmTrBkgHdr ocmTrBkgHdr) { this.ocmTrBkgHdr =
	  ocmTrBkgHdr; }
	 
}
