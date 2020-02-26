package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

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
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "ocm_tr_bkg_vst_billing")
public class OcmTrBkgVstBilling implements Serializable {
    private String unitCode;
    private Integer bkgVstBillingUid;
    private Integer resvGUid;
    private Integer bkgUid;
    private Integer inhouseUid;
    private String payCode;
    private String curCode;
    private String billingInstGuest;
    private String billingRemarkHotel;
    private String creditCardType;
    private String creditCardNo;
    private Date creditCardExipry;
    private String statusCreditAllowed;
    private String slUid;
    private String statusCashOnly;
    private String statusBlacklist;
    private float creditLimit;
    private String allowPos;
    private String allowInternet;
    private String allowTeleCalls;
    private String allowHealthClub;
    private String allowBillOnHold;
    private String allowRateChange;
    private Integer billmaskTempId;
    private Integer biilingCycle;
    private Date biilingLastBilled;
    private Date biilingNextDate;
    private String gtdResv;
    private String gtdId;
    private String roomUpgradeInd;
    private String taxvatExmpId;
    private Integer crUserUid;
    private LocalDateTime crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private LocalDateTime mfdDatetime;
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
    @Column(name = "bkg_vst_billing_uid", nullable = false)
    public Integer getBkgVstBillingUid() {
        return bkgVstBillingUid;
    }

    public void setBkgVstBillingUid(Integer bkgVstBillingUid) {
        this.bkgVstBillingUid = bkgVstBillingUid;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bkg_uid", referencedColumnName = "bkg_uid", updatable = false, insertable = false)
    public OcmTrListReservedGuest getOcmTrListReservedGuest() {
        return this.ocmTrListReservedGuest;
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
    public Integer getInhouseUid() {
        return inhouseUid;
    }

    public void setInhouseUid(Integer inhouseUid) {
        this.inhouseUid = inhouseUid;
    }

    @Basic
    @Column(name = "pay_code", nullable = true, length = 12)
    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    @Basic
    @Column(name = "cur_code", nullable = true, length = 3)
    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    @Basic
    @Column(name = "billing_inst_guest", nullable = true, length = 255)
    public String getBillingInstGuest() {
        return billingInstGuest;
    }

    public void setBillingInstGuest(String billingInstGuest) {
        this.billingInstGuest = billingInstGuest;
    }

    @Basic
    @Column(name = "billing_remark_hotel", nullable = true, length = 1000)
    public String getBillingRemarkHotel() {
        return billingRemarkHotel;
    }

    public void setBillingRemarkHotel(String billingRemarkHotel) {
        this.billingRemarkHotel = billingRemarkHotel;
    }

    @Basic
    @Column(name = "credit_card_type", nullable = true, length = 4)
    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    @Basic
    @Column(name = "credit_card_no", nullable = true, length = 100)
    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Basic
    @Column(name = "credit_card_exipry", nullable = true)
    public Date getCreditCardExipry() {
        return creditCardExipry;
    }

    public void setCreditCardExipry(Date creditCardExipry) {
        this.creditCardExipry = creditCardExipry;
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
    @Column(name = "sl_uid", nullable = true, length = 12)
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
    @Column(name = "credit_limit", nullable = false, precision = 4)
    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Basic
    @Column(name = "allow_pos", nullable = true, length = 1)
    public String getAllowPos() {
        return allowPos;
    }

    public void setAllowPos(String allowPos) {
        this.allowPos = allowPos;
    }

    @Basic
    @Column(name = "allow_internet", nullable = true, length = 1)
    public String getAllowInternet() {
        return allowInternet;
    }

    public void setAllowInternet(String allowInternet) {
        this.allowInternet = allowInternet;
    }

    @Basic
    @Column(name = "allow_tele_calls", nullable = true, length = 1)
    public String getAllowTeleCalls() {
        return allowTeleCalls;
    }

    public void setAllowTeleCalls(String allowTeleCalls) {
        this.allowTeleCalls = allowTeleCalls;
    }

    @Basic
    @Column(name = "allow_health_club", nullable = true, length = 1)
    public String getAllowHealthClub() {
        return allowHealthClub;
    }

    public void setAllowHealthClub(String allowHealthClub) {
        this.allowHealthClub = allowHealthClub;
    }

    @Basic
    @Column(name = "allow_bill_on_hold", nullable = true, length = 1)
    public String getAllowBillOnHold() {
        return allowBillOnHold;
    }

    public void setAllowBillOnHold(String allowBillOnHold) {
        this.allowBillOnHold = allowBillOnHold;
    }

    @Basic
    @Column(name = "allow_rate_change", nullable = true, length = 1)
    public String getAllowRateChange() {
        return allowRateChange;
    }

    public void setAllowRateChange(String allowRateChange) {
        this.allowRateChange = allowRateChange;
    }

    @Basic
    @Column(name = "billmask_temp_id", nullable = true)
    public Integer getBillmaskTempId() {
        return billmaskTempId;
    }

    public void setBillmaskTempId(Integer billmaskTempId) {
        this.billmaskTempId = billmaskTempId;
    }

    @Basic
    @Column(name = "biiling_cycle", nullable = true)
    public Integer getBiilingCycle() {
        return biilingCycle;
    }

    public void setBiilingCycle(Integer biilingCycle) {
        this.biilingCycle = biilingCycle;
    }

    @Basic
    @Column(name = "biiling_last_billed", nullable = true)
    public Date getBiilingLastBilled() {
        return biilingLastBilled;
    }

    public void setBiilingLastBilled(Date biilingLastBilled) {
        this.biilingLastBilled = biilingLastBilled;
    }

    @Basic
    @Column(name = "biiling_next_date", nullable = true)
    public Date getBiilingNextDate() {
        return biilingNextDate;
    }

    public void setBiilingNextDate(Date biilingNextDate) {
        this.biilingNextDate = biilingNextDate;
    }

    @Basic
    @Column(name = "gtd_resv", nullable = false, length = 1)
    public String getGtdResv() {
        return gtdResv;
    }

    public void setGtdResv(String gtdResv) {
        this.gtdResv = gtdResv;
    }

    @Basic
    @Column(name = "gtd_id", nullable = false, length = 3)
    public String getGtdId() {
        return gtdId;
    }

    public void setGtdId(String gtdId) {
        this.gtdId = gtdId;
    }

    @Basic
    @Column(name = "room_upgrade_ind", nullable = false, length = 1)
    public String getRoomUpgradeInd() {
        return roomUpgradeInd;
    }

    public void setRoomUpgradeInd(String roomUpgradeInd) {
        this.roomUpgradeInd = roomUpgradeInd;
    }

    @Basic
    @Column(name = "taxvat_exmp_id", nullable = true, length = 4)
    public String getTaxvatExmpId() {
        return taxvatExmpId;
    }

    public void setTaxvatExmpId(String taxvatExmpId) {
        this.taxvatExmpId = taxvatExmpId;
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
