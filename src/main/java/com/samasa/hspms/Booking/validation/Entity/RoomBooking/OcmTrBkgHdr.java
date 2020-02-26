package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import lombok.Data;
import javax.persistence.*;
import com.samasa.hspms.Booking.validation.Entity.Corta.CortaAccount;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "ocm_tr_bkg_hdr")
public class OcmTrBkgHdr implements java.io.Serializable {
    private Integer bkgUid;
    private String unitCode;
    private String bkgNbr;
    private LocalDate bkgDate;
    private String bkgGenSource;
    private Date bkgDateFrom;
    private Date bkgDateTo;
    private Integer cortaGuestUid;
    private Integer cortaUid;
    private String cortaGuestAcType;
    private Integer groupUid;
    private String booker;
    private String resvContactPerson;
    private String resvContactNumber;
    private String confirmRequired;
    private Date confirmedOn;
    private String arrPickReq;
    private String arrMode;
    private String arrModeRefNo;
    private String arrVehCode;
    private String depDropReq;
    private String depMode;
    private String depModeRefNo;
    private String depVehCode;
    private String confirmMailSent;
    private String occStautsId;
    private String resvPropagation;
    private String externalBkgRefNo;
    private String externalPoRefNo;
    private String externalPoRefDate;
    private String statusEdit;
    private Integer crUserUid;
    private LocalDateTime crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;
    private OcmTrListReservedGuest reservedGuests;
    private CortaAccount cortaAccount;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bkg_uid", nullable = false)
    public Integer getBkgUid() {
        return bkgUid;
    }

    public void setBkgUid(Integer bkgUid) {
        this.bkgUid = bkgUid;
    }

    @Basic
    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "corta_guest_uid", referencedColumnName = "guest_uid", insertable = false, updatable = false)
    public OcmTrListReservedGuest getReservedGuests() {
        return reservedGuests;
    }

    public void setReservedGuests(OcmTrListReservedGuest ocmTrListReservedGuests) {
        this.reservedGuests = ocmTrListReservedGuests;
    }
    
	
   @OneToOne(cascade = CascadeType.PERSIST)
   @JoinColumn(name = "corta_uid", referencedColumnName = "corta_uid", insertable = false, updatable = false)
   public CortaAccount getCortaAccount() {
        return cortaAccount;
    }

   public void setCortaAccount(CortaAccount cortaAccount) {
        this.cortaAccount = cortaAccount;
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
    @Column(name = "bkg_date", nullable = false)
    public LocalDate getBkgDate() {
        return bkgDate;
    }

    public void setBkgDate(LocalDate bkgDate) {
        this.bkgDate = bkgDate;
    }

    @Basic
    @Column(name = "bkg_gen_source", nullable = false, length = 2)
    public String getBkgGenSource() {
        return bkgGenSource;
    }

    public void setBkgGenSource(String bkgGenSource) {
        this.bkgGenSource = bkgGenSource;
    }

    @Basic
    @Column(name = "bkg_date_from", nullable = false)
    public Date getBkgDateFrom() {
        return bkgDateFrom;
    }

    public void setBkgDateFrom(Date bkgDateFrom) {
        this.bkgDateFrom = bkgDateFrom;
    }

    @Basic
    @Column(name = "bkg_date_to", nullable = false)
    public Date getBkgDateTo() {
        return bkgDateTo;
    }

    public void setBkgDateTo(Date bkgDateTo) {
        this.bkgDateTo = bkgDateTo;
    }

    @Basic
    @Column(name = "corta_guest_uid", nullable = false)
    public Integer getCortaGuestUid() {
        return cortaGuestUid;
    }

    public void setCortaGuestUid(Integer cortaGuestUid) {
        this.cortaGuestUid = cortaGuestUid;
    }

    @Basic
    @Column(name = "corta_uid", nullable = true)
    public Integer getCortaUid() {
        return cortaUid;
    }

    public void setCortaUid(Integer cortaUid) {
        this.cortaUid = cortaUid;
    }

    @Basic
    @Column(name = "corta_guest_ac_type", nullable = false, length = 2)
    public String getCortaGuestAcType() {
        return cortaGuestAcType;
    }

    public void setCortaGuestAcType(String cortaGuestAcType) {
        this.cortaGuestAcType = cortaGuestAcType;
    }

    @Basic
    @Column(name = "group_uid", nullable = true)
    public Integer getGroupUid() {
        return groupUid;
    }

    public void setGroupUid(Integer groupUid) {
        this.groupUid = groupUid;
    }

    @Basic
    @Column(name = "booker", nullable = true, length = 30)
    public String getBooker() {
        return booker;
    }

    public void setBooker(String booker) {
        this.booker = booker;
    }

    @Basic
    @Column(name = "resv_contact_person", nullable = true, length = 30)
    public String getResvContactPerson() {
        return resvContactPerson;
    }

    public void setResvContactPerson(String resvContactPerson) {
        this.resvContactPerson = resvContactPerson;
    }

    @Basic
    @Column(name = "resv_contact_number", nullable = true, length = 30)
    public String getResvContactNumber() {
        return resvContactNumber;
    }

    public void setResvContactNumber(String resvContactNumber) {
        this.resvContactNumber = resvContactNumber;
    }

    @Basic
    @Column(name = "confirm_required", nullable = false, length = 1)
    public String getConfirmRequired() {
        return confirmRequired;
    }

    public void setConfirmRequired(String confirmRequired) {
        this.confirmRequired = confirmRequired;
    }

    @Basic
    @Column(name = "confirmed_on", nullable = true)
    public Date getConfirmedOn() {
        return confirmedOn;
    }

    public void setConfirmedOn(Date confirmedOn) {
        this.confirmedOn = confirmedOn;
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
    @Column(name = "arr_mode", nullable = true, length = 3)
    public String getArrMode() {
        return arrMode;
    }

    public void setArrMode(String arrMode) {
        this.arrMode = arrMode;
    }

    @Basic
    @Column(name = "arr_mode_ref_no", nullable = true, length = 20)
    public String getArrModeRefNo() {
        return arrModeRefNo;
    }

    public void setArrModeRefNo(String arrModeRefNo) {
        this.arrModeRefNo = arrModeRefNo;
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
    @Column(name = "dep_veh_code", nullable = true, length = 3)
    public String getDepVehCode() {
        return depVehCode;
    }

    public void setDepVehCode(String depVehCode) {
        this.depVehCode = depVehCode;
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
    @Column(name = "occ_stauts_id", nullable = false, length = 2)
    public String getOccStautsId() {
        return occStautsId;
    }

    public void setOccStautsId(String occStautsId) {
        this.occStautsId = occStautsId;
    }

    @Basic
    @Column(name = "resv_propagation", nullable = false, length = 1)
    public String getResvPropagation() {
        return resvPropagation;
    }

    public void setResvPropagation(String resvPropagation) {
        this.resvPropagation = resvPropagation;
    }

    @Basic
    @Column(name = "external_bkg_ref_no", nullable = true, length = 20)
    public String getExternalBkgRefNo() {
        return externalBkgRefNo;
    }

    public void setExternalBkgRefNo(String externalBkgRefNo) {
        this.externalBkgRefNo = externalBkgRefNo;
    }

    @Basic
    @Column(name = "external_po_ref_no", nullable = true, length = 20)
    public String getExternalPoRefNo() {
        return externalPoRefNo;
    }

    public void setExternalPoRefNo(String externalPoRefNo) {
        this.externalPoRefNo = externalPoRefNo;
    }

    @Basic
    @Column(name = "external_po_ref_date", nullable = true, length = 20)
    public String getExternalPoRefDate() {
        return externalPoRefDate;
    }

    public void setExternalPoRefDate(String externalPoRefDate) {
        this.externalPoRefDate = externalPoRefDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OcmTrBkgHdr that = (OcmTrBkgHdr) o;

        if (bkgUid != null ? !bkgUid.equals(that.bkgUid) : that.bkgUid != null) return false;
        if (unitCode != null ? !unitCode.equals(that.unitCode) : that.unitCode != null) return false;
        if (bkgNbr != null ? !bkgNbr.equals(that.bkgNbr) : that.bkgNbr != null) return false;
        if (bkgDate != null ? !bkgDate.equals(that.bkgDate) : that.bkgDate != null) return false;
        if (bkgGenSource != null ? !bkgGenSource.equals(that.bkgGenSource) : that.bkgGenSource != null) return false;
        if (bkgDateFrom != null ? !bkgDateFrom.equals(that.bkgDateFrom) : that.bkgDateFrom != null) return false;
        if (bkgDateTo != null ? !bkgDateTo.equals(that.bkgDateTo) : that.bkgDateTo != null) return false;
        if (cortaGuestUid != null ? !cortaGuestUid.equals(that.cortaGuestUid) : that.cortaGuestUid != null)
            return false;
        if (cortaUid != null ? !cortaUid.equals(that.cortaUid) : that.cortaUid != null) return false;
        if (cortaGuestAcType != null ? !cortaGuestAcType.equals(that.cortaGuestAcType) : that.cortaGuestAcType != null)
            return false;
        if (groupUid != null ? !groupUid.equals(that.groupUid) : that.groupUid != null) return false;
        if (booker != null ? !booker.equals(that.booker) : that.booker != null) return false;
        if (resvContactPerson != null ? !resvContactPerson.equals(that.resvContactPerson) : that.resvContactPerson != null)
            return false;
        if (resvContactNumber != null ? !resvContactNumber.equals(that.resvContactNumber) : that.resvContactNumber != null)
            return false;
        if (confirmRequired != null ? !confirmRequired.equals(that.confirmRequired) : that.confirmRequired != null)
            return false;
        if (confirmedOn != null ? !confirmedOn.equals(that.confirmedOn) : that.confirmedOn != null) return false;
        if (arrPickReq != null ? !arrPickReq.equals(that.arrPickReq) : that.arrPickReq != null) return false;
        if (arrMode != null ? !arrMode.equals(that.arrMode) : that.arrMode != null) return false;
        if (arrModeRefNo != null ? !arrModeRefNo.equals(that.arrModeRefNo) : that.arrModeRefNo != null) return false;
        if (arrVehCode != null ? !arrVehCode.equals(that.arrVehCode) : that.arrVehCode != null) return false;
        if (depDropReq != null ? !depDropReq.equals(that.depDropReq) : that.depDropReq != null) return false;
        if (depMode != null ? !depMode.equals(that.depMode) : that.depMode != null) return false;
        if (depModeRefNo != null ? !depModeRefNo.equals(that.depModeRefNo) : that.depModeRefNo != null) return false;
        if (depVehCode != null ? !depVehCode.equals(that.depVehCode) : that.depVehCode != null) return false;
        if (confirmMailSent != null ? !confirmMailSent.equals(that.confirmMailSent) : that.confirmMailSent != null)
            return false;
        if (occStautsId != null ? !occStautsId.equals(that.occStautsId) : that.occStautsId != null) return false;
        if (resvPropagation != null ? !resvPropagation.equals(that.resvPropagation) : that.resvPropagation != null)
            return false;
        if (externalBkgRefNo != null ? !externalBkgRefNo.equals(that.externalBkgRefNo) : that.externalBkgRefNo != null)
            return false;
        if (externalPoRefNo != null ? !externalPoRefNo.equals(that.externalPoRefNo) : that.externalPoRefNo != null)
            return false;
        if (externalPoRefDate != null ? !externalPoRefDate.equals(that.externalPoRefDate) : that.externalPoRefDate != null)
            return false;
        if (statusEdit != null ? !statusEdit.equals(that.statusEdit) : that.statusEdit != null) return false;
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
        int result = bkgUid != null ? bkgUid.hashCode() : 0;
        result = 31 * result + (unitCode != null ? unitCode.hashCode() : 0);
        result = 31 * result + (bkgNbr != null ? bkgNbr.hashCode() : 0);
        result = 31 * result + (bkgDate != null ? bkgDate.hashCode() : 0);
        result = 31 * result + (bkgGenSource != null ? bkgGenSource.hashCode() : 0);
        result = 31 * result + (bkgDateFrom != null ? bkgDateFrom.hashCode() : 0);
        result = 31 * result + (bkgDateTo != null ? bkgDateTo.hashCode() : 0);
        result = 31 * result + (cortaGuestUid != null ? cortaGuestUid.hashCode() : 0);
        result = 31 * result + (cortaUid != null ? cortaUid.hashCode() : 0);
        result = 31 * result + (cortaGuestAcType != null ? cortaGuestAcType.hashCode() : 0);
        result = 31 * result + (groupUid != null ? groupUid.hashCode() : 0);
        result = 31 * result + (booker != null ? booker.hashCode() : 0);
        result = 31 * result + (resvContactPerson != null ? resvContactPerson.hashCode() : 0);
        result = 31 * result + (resvContactNumber != null ? resvContactNumber.hashCode() : 0);
        result = 31 * result + (confirmRequired != null ? confirmRequired.hashCode() : 0);
        result = 31 * result + (confirmedOn != null ? confirmedOn.hashCode() : 0);
        result = 31 * result + (arrPickReq != null ? arrPickReq.hashCode() : 0);
        result = 31 * result + (arrMode != null ? arrMode.hashCode() : 0);
        result = 31 * result + (arrModeRefNo != null ? arrModeRefNo.hashCode() : 0);
        result = 31 * result + (arrVehCode != null ? arrVehCode.hashCode() : 0);
        result = 31 * result + (depDropReq != null ? depDropReq.hashCode() : 0);
        result = 31 * result + (depMode != null ? depMode.hashCode() : 0);
        result = 31 * result + (depModeRefNo != null ? depModeRefNo.hashCode() : 0);
        result = 31 * result + (depVehCode != null ? depVehCode.hashCode() : 0);
        result = 31 * result + (confirmMailSent != null ? confirmMailSent.hashCode() : 0);
        result = 31 * result + (occStautsId != null ? occStautsId.hashCode() : 0);
        result = 31 * result + (resvPropagation != null ? resvPropagation.hashCode() : 0);
        result = 31 * result + (externalBkgRefNo != null ? externalBkgRefNo.hashCode() : 0);
        result = 31 * result + (externalPoRefNo != null ? externalPoRefNo.hashCode() : 0);
        result = 31 * result + (externalPoRefDate != null ? externalPoRefDate.hashCode() : 0);
        result = 31 * result + (statusEdit != null ? statusEdit.hashCode() : 0);
        result = 31 * result + (crUserUid != null ? crUserUid.hashCode() : 0);
        result = 31 * result + (crDatetime != null ? crDatetime.hashCode() : 0);
        result = 31 * result + (crSessionId != null ? crSessionId.hashCode() : 0);
        result = 31 * result + (mfdUserUid != null ? mfdUserUid.hashCode() : 0);
        result = 31 * result + (mfdDatetime != null ? mfdDatetime.hashCode() : 0);
        result = 31 * result + (mfdSessionId != null ? mfdSessionId.hashCode() : 0);
        return result;
    }
}
