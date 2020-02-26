package com.samasa.hspms.guest.Entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "guest_account_defaults", schema = "hs_pmsm", catalog = "")
@IdClass(GuestAccountDefaultsEntityPK.class)
public class GuestAccountDefaultsEntity {
    private String unitCode;
    private Integer guestUid;
    private String defaultBillingInstG;
    private String defaultBillingRemarkH;
    private BigDecimal defaultCreditLimit;
    private String defaultPosAllow;
    private String defaultCurCode;
    private String defaultMsgMis;
    private String defaultGclMis;
    private String defaultSrcMis;
    private Integer defaultBillmaskTempId;
    private String defaultRateType;
    private String defaultRateCode;
    private String defaultPayCode;
    private String defaultRmFeatureId1;
    private String defaultRmFeatureId2;
    private String defaultRmFeatureId3;
    private String defaultRmFeatureId4;
    private String defaultRmFeatureId5;
    private String defaultSplSrvCode1;
    private String defaultSplSrvCode2;
    private String defaultSplSrvCode3;
    private String defaultSplSrvCode4;
    private String defaultSplSrvCode5;
    private Integer crUserUid;
    private Timestamp crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;

    @Id
    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Id
    @Column(name = "guest_uid", nullable = false)
    public Integer getGuestUid() {
        return guestUid;
    }

    public void setGuestUid(Integer guestUid) {
        this.guestUid = guestUid;
    }

    @Basic
    @Column(name = "default_billing_inst_g", nullable = true, length = 255)
    public String getDefaultBillingInstG() {
        return defaultBillingInstG;
    }

    public void setDefaultBillingInstG(String defaultBillingInstG) {
        this.defaultBillingInstG = defaultBillingInstG;
    }

    @Basic
    @Column(name = "default_billing_remark_h", nullable = true, length = 1000)
    public String getDefaultBillingRemarkH() {
        return defaultBillingRemarkH;
    }

    public void setDefaultBillingRemarkH(String defaultBillingRemarkH) {
        this.defaultBillingRemarkH = defaultBillingRemarkH;
    }

    @Basic
    @Column(name = "default_credit_limit", nullable = false, precision = 4)
    public BigDecimal getDefaultCreditLimit() {
        return defaultCreditLimit;
    }

    public void setDefaultCreditLimit(BigDecimal defaultCreditLimit) {
        this.defaultCreditLimit = defaultCreditLimit;
    }

    @Basic
    @Column(name = "default_pos_allow", nullable = true, length = 1)
    public String getDefaultPosAllow() {
        return defaultPosAllow;
    }

    public void setDefaultPosAllow(String defaultPosAllow) {
        this.defaultPosAllow = defaultPosAllow;
    }

    @Basic
    @Column(name = "default_cur_code", nullable = true, length = 3)
    public String getDefaultCurCode() {
        return defaultCurCode;
    }

    public void setDefaultCurCode(String defaultCurCode) {
        this.defaultCurCode = defaultCurCode;
    }

    @Basic
    @Column(name = "default_msg_mis", nullable = true, length = 4)
    public String getDefaultMsgMis() {
        return defaultMsgMis;
    }

    public void setDefaultMsgMis(String defaultMsgMis) {
        this.defaultMsgMis = defaultMsgMis;
    }

    @Basic
    @Column(name = "default_gcl_mis", nullable = true, length = 4)
    public String getDefaultGclMis() {
        return defaultGclMis;
    }

    public void setDefaultGclMis(String defaultGclMis) {
        this.defaultGclMis = defaultGclMis;
    }

    @Basic
    @Column(name = "default_src_mis", nullable = true, length = 4)
    public String getDefaultSrcMis() {
        return defaultSrcMis;
    }

    public void setDefaultSrcMis(String defaultSrcMis) {
        this.defaultSrcMis = defaultSrcMis;
    }

    @Basic
    @Column(name = "default_billmask_temp_id", nullable = true)
    public Integer getDefaultBillmaskTempId() {
        return defaultBillmaskTempId;
    }

    public void setDefaultBillmaskTempId(Integer defaultBillmaskTempId) {
        this.defaultBillmaskTempId = defaultBillmaskTempId;
    }

    @Basic
    @Column(name = "default_rate_type", nullable = true, length = 12)
    public String getDefaultRateType() {
        return defaultRateType;
    }

    public void setDefaultRateType(String defaultRateType) {
        this.defaultRateType = defaultRateType;
    }

    @Basic
    @Column(name = "default_rate_code", nullable = true, length = 12)
    public String getDefaultRateCode() {
        return defaultRateCode;
    }

    public void setDefaultRateCode(String defaultRateCode) {
        this.defaultRateCode = defaultRateCode;
    }

    @Basic
    @Column(name = "default_pay_code", nullable = true, length = 12)
    public String getDefaultPayCode() {
        return defaultPayCode;
    }

    public void setDefaultPayCode(String defaultPayCode) {
        this.defaultPayCode = defaultPayCode;
    }

    @Basic
    @Column(name = "default_rm_feature_id1", nullable = true, length = 3)
    public String getDefaultRmFeatureId1() {
        return defaultRmFeatureId1;
    }

    public void setDefaultRmFeatureId1(String defaultRmFeatureId1) {
        this.defaultRmFeatureId1 = defaultRmFeatureId1;
    }

    @Basic
    @Column(name = "default_rm_feature_id2", nullable = true, length = 3)
    public String getDefaultRmFeatureId2() {
        return defaultRmFeatureId2;
    }

    public void setDefaultRmFeatureId2(String defaultRmFeatureId2) {
        this.defaultRmFeatureId2 = defaultRmFeatureId2;
    }

    @Basic
    @Column(name = "default_rm_feature_id3", nullable = true, length = 3)
    public String getDefaultRmFeatureId3() {
        return defaultRmFeatureId3;
    }

    public void setDefaultRmFeatureId3(String defaultRmFeatureId3) {
        this.defaultRmFeatureId3 = defaultRmFeatureId3;
    }

    @Basic
    @Column(name = "default_rm_feature_id4", nullable = true, length = 3)
    public String getDefaultRmFeatureId4() {
        return defaultRmFeatureId4;
    }

    public void setDefaultRmFeatureId4(String defaultRmFeatureId4) {
        this.defaultRmFeatureId4 = defaultRmFeatureId4;
    }

    @Basic
    @Column(name = "default_rm_feature_id5", nullable = true, length = 3)
    public String getDefaultRmFeatureId5() {
        return defaultRmFeatureId5;
    }

    public void setDefaultRmFeatureId5(String defaultRmFeatureId5) {
        this.defaultRmFeatureId5 = defaultRmFeatureId5;
    }

    @Basic
    @Column(name = "default_spl_srv_code1", nullable = true, length = 3)
    public String getDefaultSplSrvCode1() {
        return defaultSplSrvCode1;
    }

    public void setDefaultSplSrvCode1(String defaultSplSrvCode1) {
        this.defaultSplSrvCode1 = defaultSplSrvCode1;
    }

    @Basic
    @Column(name = "default_spl_srv_code2", nullable = true, length = 3)
    public String getDefaultSplSrvCode2() {
        return defaultSplSrvCode2;
    }

    public void setDefaultSplSrvCode2(String defaultSplSrvCode2) {
        this.defaultSplSrvCode2 = defaultSplSrvCode2;
    }

    @Basic
    @Column(name = "default_spl_srv_code3", nullable = true, length = 3)
    public String getDefaultSplSrvCode3() {
        return defaultSplSrvCode3;
    }

    public void setDefaultSplSrvCode3(String defaultSplSrvCode3) {
        this.defaultSplSrvCode3 = defaultSplSrvCode3;
    }

    @Basic
    @Column(name = "default_spl_srv_code4", nullable = true, length = 3)
    public String getDefaultSplSrvCode4() {
        return defaultSplSrvCode4;
    }

    public void setDefaultSplSrvCode4(String defaultSplSrvCode4) {
        this.defaultSplSrvCode4 = defaultSplSrvCode4;
    }

    @Basic
    @Column(name = "default_spl_srv_code5", nullable = true, length = 3)
    public String getDefaultSplSrvCode5() {
        return defaultSplSrvCode5;
    }

    public void setDefaultSplSrvCode5(String defaultSplSrvCode5) {
        this.defaultSplSrvCode5 = defaultSplSrvCode5;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuestAccountDefaultsEntity that = (GuestAccountDefaultsEntity) o;

        if (unitCode != null ? !unitCode.equals(that.unitCode) : that.unitCode != null) return false;
        if (guestUid != null ? !guestUid.equals(that.guestUid) : that.guestUid != null) return false;
        if (defaultBillingInstG != null ? !defaultBillingInstG.equals(that.defaultBillingInstG) : that.defaultBillingInstG != null)
            return false;
        if (defaultBillingRemarkH != null ? !defaultBillingRemarkH.equals(that.defaultBillingRemarkH) : that.defaultBillingRemarkH != null)
            return false;
        if (defaultCreditLimit != null ? !defaultCreditLimit.equals(that.defaultCreditLimit) : that.defaultCreditLimit != null)
            return false;
        if (defaultPosAllow != null ? !defaultPosAllow.equals(that.defaultPosAllow) : that.defaultPosAllow != null)
            return false;
        if (defaultCurCode != null ? !defaultCurCode.equals(that.defaultCurCode) : that.defaultCurCode != null)
            return false;
        if (defaultMsgMis != null ? !defaultMsgMis.equals(that.defaultMsgMis) : that.defaultMsgMis != null)
            return false;
        if (defaultGclMis != null ? !defaultGclMis.equals(that.defaultGclMis) : that.defaultGclMis != null)
            return false;
        if (defaultSrcMis != null ? !defaultSrcMis.equals(that.defaultSrcMis) : that.defaultSrcMis != null)
            return false;
        if (defaultBillmaskTempId != null ? !defaultBillmaskTempId.equals(that.defaultBillmaskTempId) : that.defaultBillmaskTempId != null)
            return false;
        if (defaultRateType != null ? !defaultRateType.equals(that.defaultRateType) : that.defaultRateType != null)
            return false;
        if (defaultRateCode != null ? !defaultRateCode.equals(that.defaultRateCode) : that.defaultRateCode != null)
            return false;
        if (defaultPayCode != null ? !defaultPayCode.equals(that.defaultPayCode) : that.defaultPayCode != null)
            return false;
        if (defaultRmFeatureId1 != null ? !defaultRmFeatureId1.equals(that.defaultRmFeatureId1) : that.defaultRmFeatureId1 != null)
            return false;
        if (defaultRmFeatureId2 != null ? !defaultRmFeatureId2.equals(that.defaultRmFeatureId2) : that.defaultRmFeatureId2 != null)
            return false;
        if (defaultRmFeatureId3 != null ? !defaultRmFeatureId3.equals(that.defaultRmFeatureId3) : that.defaultRmFeatureId3 != null)
            return false;
        if (defaultRmFeatureId4 != null ? !defaultRmFeatureId4.equals(that.defaultRmFeatureId4) : that.defaultRmFeatureId4 != null)
            return false;
        if (defaultRmFeatureId5 != null ? !defaultRmFeatureId5.equals(that.defaultRmFeatureId5) : that.defaultRmFeatureId5 != null)
            return false;
        if (defaultSplSrvCode1 != null ? !defaultSplSrvCode1.equals(that.defaultSplSrvCode1) : that.defaultSplSrvCode1 != null)
            return false;
        if (defaultSplSrvCode2 != null ? !defaultSplSrvCode2.equals(that.defaultSplSrvCode2) : that.defaultSplSrvCode2 != null)
            return false;
        if (defaultSplSrvCode3 != null ? !defaultSplSrvCode3.equals(that.defaultSplSrvCode3) : that.defaultSplSrvCode3 != null)
            return false;
        if (defaultSplSrvCode4 != null ? !defaultSplSrvCode4.equals(that.defaultSplSrvCode4) : that.defaultSplSrvCode4 != null)
            return false;
        if (defaultSplSrvCode5 != null ? !defaultSplSrvCode5.equals(that.defaultSplSrvCode5) : that.defaultSplSrvCode5 != null)
            return false;
        if (crUserUid != null ? !crUserUid.equals(that.crUserUid) : that.crUserUid != null) return false;
        if (crDatetime != null ? !crDatetime.equals(that.crDatetime) : that.crDatetime != null) return false;
        if (crSessionId != null ? !crSessionId.equals(that.crSessionId) : that.crSessionId != null) return false;
        if (mfdUserUid != null ? !mfdUserUid.equals(that.mfdUserUid) : that.mfdUserUid != null) return false;
        if (mfdDatetime != null ? !mfdDatetime.equals(that.mfdDatetime) : that.mfdDatetime != null) return false;
        if (mfdSessionId != null ? !mfdSessionId.equals(that.mfdSessionId) : that.mfdSessionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unitCode != null ? unitCode.hashCode() : 0;
        result = 31 * result + (guestUid != null ? guestUid.hashCode() : 0);
        result = 31 * result + (defaultBillingInstG != null ? defaultBillingInstG.hashCode() : 0);
        result = 31 * result + (defaultBillingRemarkH != null ? defaultBillingRemarkH.hashCode() : 0);
        result = 31 * result + (defaultCreditLimit != null ? defaultCreditLimit.hashCode() : 0);
        result = 31 * result + (defaultPosAllow != null ? defaultPosAllow.hashCode() : 0);
        result = 31 * result + (defaultCurCode != null ? defaultCurCode.hashCode() : 0);
        result = 31 * result + (defaultMsgMis != null ? defaultMsgMis.hashCode() : 0);
        result = 31 * result + (defaultGclMis != null ? defaultGclMis.hashCode() : 0);
        result = 31 * result + (defaultSrcMis != null ? defaultSrcMis.hashCode() : 0);
        result = 31 * result + (defaultBillmaskTempId != null ? defaultBillmaskTempId.hashCode() : 0);
        result = 31 * result + (defaultRateType != null ? defaultRateType.hashCode() : 0);
        result = 31 * result + (defaultRateCode != null ? defaultRateCode.hashCode() : 0);
        result = 31 * result + (defaultPayCode != null ? defaultPayCode.hashCode() : 0);
        result = 31 * result + (defaultRmFeatureId1 != null ? defaultRmFeatureId1.hashCode() : 0);
        result = 31 * result + (defaultRmFeatureId2 != null ? defaultRmFeatureId2.hashCode() : 0);
        result = 31 * result + (defaultRmFeatureId3 != null ? defaultRmFeatureId3.hashCode() : 0);
        result = 31 * result + (defaultRmFeatureId4 != null ? defaultRmFeatureId4.hashCode() : 0);
        result = 31 * result + (defaultRmFeatureId5 != null ? defaultRmFeatureId5.hashCode() : 0);
        result = 31 * result + (defaultSplSrvCode1 != null ? defaultSplSrvCode1.hashCode() : 0);
        result = 31 * result + (defaultSplSrvCode2 != null ? defaultSplSrvCode2.hashCode() : 0);
        result = 31 * result + (defaultSplSrvCode3 != null ? defaultSplSrvCode3.hashCode() : 0);
        result = 31 * result + (defaultSplSrvCode4 != null ? defaultSplSrvCode4.hashCode() : 0);
        result = 31 * result + (defaultSplSrvCode5 != null ? defaultSplSrvCode5.hashCode() : 0);
        result = 31 * result + (crUserUid != null ? crUserUid.hashCode() : 0);
        result = 31 * result + (crDatetime != null ? crDatetime.hashCode() : 0);
        result = 31 * result + (crSessionId != null ? crSessionId.hashCode() : 0);
        result = 31 * result + (mfdUserUid != null ? mfdUserUid.hashCode() : 0);
        result = 31 * result + (mfdDatetime != null ? mfdDatetime.hashCode() : 0);
        result = 31 * result + (mfdSessionId != null ? mfdSessionId.hashCode() : 0);
        return result;
    }
}
