package com.samasa.hspms.Booking.validation.Entity.RoomTypeAvailable;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "tr_ocm_room_type_aval")
public class TrOcmRoomTypeAvalEntity {
    private Integer roomTypeAvalId;
    private String unitCode;
    private Date busDate;
    private String occRmType;
    private String roomType;
    private String suiteInd;
    private String dummyInd;
    private Integer phyCount;
    private Integer tooCount;
    private Integer pooCount;
    private Integer upSellCount;
    private Integer sellCount;
    private Integer allotCount;
    private Integer bkgConfCount;
    private Integer bkgConfIndvl;
    private Integer bkgConfGprs;
    private Integer bkgUpsellCount;
    private Integer bkgUncnfCount;
    private Integer bkgClxdCount;
    private Integer avalCount;
    private Integer gnteeCount;
    private String stopSell;
    private String cldForArr;
    private String cldForDep;
    private Integer extraBeds;
    private Integer bedsExtraYt;
    private Integer bedsExtraCount;
    private Integer bedsExtraCh;
    private Integer bedsExtraAd;
    private Integer crUserUid;
    private Timestamp crDatetime;
    private Integer crSessionId;
    private Integer mfdUserUid;
    private Timestamp mfdDatetime;
    private Integer mfdSessionId;

    @Id
    @Column(name = "room_type_aval_id", nullable = false)
    public Integer getRoomTypeAvalId() {
        return roomTypeAvalId;
    }

    public void setRoomTypeAvalId(Integer roomTypeAvalId) {
        this.roomTypeAvalId = roomTypeAvalId;
    }

    @Basic
    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
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
    @Column(name = "room_type", nullable = false, length = 5)
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Basic
    @Column(name = "suite_ind", nullable = false, length = 1)
    public String getSuiteInd() {
        return suiteInd;
    }

    public void setSuiteInd(String suiteInd) {
        this.suiteInd = suiteInd;
    }

    @Basic
    @Column(name = "dummy_ind", nullable = false, length = 1)
    public String getDummyInd() {
        return dummyInd;
    }

    public void setDummyInd(String dummyInd) {
        this.dummyInd = dummyInd;
    }

    @Basic
    @Column(name = "phy_count", nullable = false)
    public Integer getPhyCount() {
        return phyCount;
    }

    public void setPhyCount(Integer phyCount) {
        this.phyCount = phyCount;
    }

    @Basic
    @Column(name = "too_count", nullable = false)
    public Integer getTooCount() {
        return tooCount;
    }

    public void setTooCount(Integer tooCount) {
        this.tooCount = tooCount;
    }

    @Basic
    @Column(name = "poo_count", nullable = false)
    public Integer getPooCount() {
        return pooCount;
    }

    public void setPooCount(Integer pooCount) {
        this.pooCount = pooCount;
    }

    @Basic
    @Column(name = "up_sell_count", nullable = false)
    public Integer getUpSellCount() {
        return upSellCount;
    }

    public void setUpSellCount(Integer upSellCount) {
        this.upSellCount = upSellCount;
    }

    @Basic
    @Column(name = "sell_count", nullable = false)
    public Integer getSellCount() {
        return sellCount;
    }

    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

    @Basic
    @Column(name = "allot_count", nullable = false)
    public Integer getAllotCount() {
        return allotCount;
    }

    public void setAllotCount(Integer allotCount) {
        this.allotCount = allotCount;
    }

    @Basic
    @Column(name = "bkg_conf_count", nullable = false)
    public Integer getBkgConfCount() {
        return bkgConfCount;
    }

    public void setBkgConfCount(Integer bkgConfCount) {
        this.bkgConfCount = bkgConfCount;
    }

    @Basic
    @Column(name = "bkg_conf_indvl", nullable = false)
    public Integer getBkgConfIndvl() {
        return bkgConfIndvl;
    }

    public void setBkgConfIndvl(Integer bkgConfIndvl) {
        this.bkgConfIndvl = bkgConfIndvl;
    }

    @Basic
    @Column(name = "bkg_conf_gprs", nullable = false)
    public Integer getBkgConfGprs() {
        return bkgConfGprs;
    }

    public void setBkgConfGprs(Integer bkgConfGprs) {
        this.bkgConfGprs = bkgConfGprs;
    }

    @Basic
    @Column(name = "bkg_upsell_count", nullable = false)
    public Integer getBkgUpsellCount() {
        return bkgUpsellCount;
    }

    public void setBkgUpsellCount(Integer bkgUpsellCount) {
        this.bkgUpsellCount = bkgUpsellCount;
    }

    @Basic
    @Column(name = "bkg_uncnf_count", nullable = false)
    public Integer getBkgUncnfCount() {
        return bkgUncnfCount;
    }

    public void setBkgUncnfCount(Integer bkgUncnfCount) {
        this.bkgUncnfCount = bkgUncnfCount;
    }

    @Basic
    @Column(name = "bkg_clxd_count", nullable = false)
    public Integer getBkgClxdCount() {
        return bkgClxdCount;
    }

    public void setBkgClxdCount(Integer bkgClxdCount) {
        this.bkgClxdCount = bkgClxdCount;
    }

    @Basic
    @Column(name = "aval_count", nullable = false)
    public Integer getAvalCount() {
        return avalCount;
    }

    public void setAvalCount(Integer avalCount) {
        this.avalCount = avalCount;
    }

    @Basic
    @Column(name = "gntee_count", nullable = false)
    public Integer getGnteeCount() {
        return gnteeCount;
    }

    public void setGnteeCount(Integer gnteeCount) {
        this.gnteeCount = gnteeCount;
    }

    @Basic
    @Column(name = "stop_sell", nullable = false, length = 1)
    public String getStopSell() {
        return stopSell;
    }

    public void setStopSell(String stopSell) {
        this.stopSell = stopSell;
    }

    @Basic
    @Column(name = "cld_for_arr", nullable = false, length = 1)
    public String getCldForArr() {
        return cldForArr;
    }

    public void setCldForArr(String cldForArr) {
        this.cldForArr = cldForArr;
    }

    @Basic
    @Column(name = "cld_for_dep", nullable = false, length = 1)
    public String getCldForDep() {
        return cldForDep;
    }

    public void setCldForDep(String cldForDep) {
        this.cldForDep = cldForDep;
    }

    @Basic
    @Column(name = "extra_beds", nullable = false)
    public Integer getExtraBeds() {
        return extraBeds;
    }

    public void setExtraBeds(Integer extraBeds) {
        this.extraBeds = extraBeds;
    }

    @Basic
    @Column(name = "beds_extra_yt", nullable = false)
    public Integer getBedsExtraYt() {
        return bedsExtraYt;
    }

    public void setBedsExtraYt(Integer bedsExtraYt) {
        this.bedsExtraYt = bedsExtraYt;
    }

    @Basic
    @Column(name = "beds_extra_count", nullable = false)
    public Integer getBedsExtraCount() {
        return bedsExtraCount;
    }

    public void setBedsExtraCount(Integer bedsExtraCount) {
        this.bedsExtraCount = bedsExtraCount;
    }

    @Basic
    @Column(name = "beds_extra_ch", nullable = false)
    public Integer getBedsExtraCh() {
        return bedsExtraCh;
    }

    public void setBedsExtraCh(Integer bedsExtraCh) {
        this.bedsExtraCh = bedsExtraCh;
    }

    @Basic
    @Column(name = "beds_extra_ad", nullable = false)
    public Integer getBedsExtraAd() {
        return bedsExtraAd;
    }

    public void setBedsExtraAd(Integer bedsExtraAd) {
        this.bedsExtraAd = bedsExtraAd;
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
    @Column(name = "cr_datetime", nullable = true)
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

        TrOcmRoomTypeAvalEntity that = (TrOcmRoomTypeAvalEntity) o;

        if (roomTypeAvalId != null ? !roomTypeAvalId.equals(that.roomTypeAvalId) : that.roomTypeAvalId != null)
            return false;
        if (unitCode != null ? !unitCode.equals(that.unitCode) : that.unitCode != null) return false;
        if (busDate != null ? !busDate.equals(that.busDate) : that.busDate != null) return false;
        if (occRmType != null ? !occRmType.equals(that.occRmType) : that.occRmType != null) return false;
        if (roomType != null ? !roomType.equals(that.roomType) : that.roomType != null) return false;
        if (suiteInd != null ? !suiteInd.equals(that.suiteInd) : that.suiteInd != null) return false;
        if (dummyInd != null ? !dummyInd.equals(that.dummyInd) : that.dummyInd != null) return false;
        if (phyCount != null ? !phyCount.equals(that.phyCount) : that.phyCount != null) return false;
        if (tooCount != null ? !tooCount.equals(that.tooCount) : that.tooCount != null) return false;
        if (pooCount != null ? !pooCount.equals(that.pooCount) : that.pooCount != null) return false;
        if (upSellCount != null ? !upSellCount.equals(that.upSellCount) : that.upSellCount != null) return false;
        if (sellCount != null ? !sellCount.equals(that.sellCount) : that.sellCount != null) return false;
        if (allotCount != null ? !allotCount.equals(that.allotCount) : that.allotCount != null) return false;
        if (bkgConfCount != null ? !bkgConfCount.equals(that.bkgConfCount) : that.bkgConfCount != null) return false;
        if (bkgConfIndvl != null ? !bkgConfIndvl.equals(that.bkgConfIndvl) : that.bkgConfIndvl != null) return false;
        if (bkgConfGprs != null ? !bkgConfGprs.equals(that.bkgConfGprs) : that.bkgConfGprs != null) return false;
        if (bkgUpsellCount != null ? !bkgUpsellCount.equals(that.bkgUpsellCount) : that.bkgUpsellCount != null)
            return false;
        if (bkgUncnfCount != null ? !bkgUncnfCount.equals(that.bkgUncnfCount) : that.bkgUncnfCount != null)
            return false;
        if (bkgClxdCount != null ? !bkgClxdCount.equals(that.bkgClxdCount) : that.bkgClxdCount != null) return false;
        if (avalCount != null ? !avalCount.equals(that.avalCount) : that.avalCount != null) return false;
        if (gnteeCount != null ? !gnteeCount.equals(that.gnteeCount) : that.gnteeCount != null) return false;
        if (stopSell != null ? !stopSell.equals(that.stopSell) : that.stopSell != null) return false;
        if (cldForArr != null ? !cldForArr.equals(that.cldForArr) : that.cldForArr != null) return false;
        if (cldForDep != null ? !cldForDep.equals(that.cldForDep) : that.cldForDep != null) return false;
        if (extraBeds != null ? !extraBeds.equals(that.extraBeds) : that.extraBeds != null) return false;
        if (bedsExtraYt != null ? !bedsExtraYt.equals(that.bedsExtraYt) : that.bedsExtraYt != null) return false;
        if (bedsExtraCount != null ? !bedsExtraCount.equals(that.bedsExtraCount) : that.bedsExtraCount != null)
            return false;
        if (bedsExtraCh != null ? !bedsExtraCh.equals(that.bedsExtraCh) : that.bedsExtraCh != null) return false;
        if (bedsExtraAd != null ? !bedsExtraAd.equals(that.bedsExtraAd) : that.bedsExtraAd != null) return false;
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
        int result = roomTypeAvalId != null ? roomTypeAvalId.hashCode() : 0;
        result = 31 * result + (unitCode != null ? unitCode.hashCode() : 0);
        result = 31 * result + (busDate != null ? busDate.hashCode() : 0);
        result = 31 * result + (occRmType != null ? occRmType.hashCode() : 0);
        result = 31 * result + (roomType != null ? roomType.hashCode() : 0);
        result = 31 * result + (suiteInd != null ? suiteInd.hashCode() : 0);
        result = 31 * result + (dummyInd != null ? dummyInd.hashCode() : 0);
        result = 31 * result + (phyCount != null ? phyCount.hashCode() : 0);
        result = 31 * result + (tooCount != null ? tooCount.hashCode() : 0);
        result = 31 * result + (pooCount != null ? pooCount.hashCode() : 0);
        result = 31 * result + (upSellCount != null ? upSellCount.hashCode() : 0);
        result = 31 * result + (sellCount != null ? sellCount.hashCode() : 0);
        result = 31 * result + (allotCount != null ? allotCount.hashCode() : 0);
        result = 31 * result + (bkgConfCount != null ? bkgConfCount.hashCode() : 0);
        result = 31 * result + (bkgConfIndvl != null ? bkgConfIndvl.hashCode() : 0);
        result = 31 * result + (bkgConfGprs != null ? bkgConfGprs.hashCode() : 0);
        result = 31 * result + (bkgUpsellCount != null ? bkgUpsellCount.hashCode() : 0);
        result = 31 * result + (bkgUncnfCount != null ? bkgUncnfCount.hashCode() : 0);
        result = 31 * result + (bkgClxdCount != null ? bkgClxdCount.hashCode() : 0);
        result = 31 * result + (avalCount != null ? avalCount.hashCode() : 0);
        result = 31 * result + (gnteeCount != null ? gnteeCount.hashCode() : 0);
        result = 31 * result + (stopSell != null ? stopSell.hashCode() : 0);
        result = 31 * result + (cldForArr != null ? cldForArr.hashCode() : 0);
        result = 31 * result + (cldForDep != null ? cldForDep.hashCode() : 0);
        result = 31 * result + (extraBeds != null ? extraBeds.hashCode() : 0);
        result = 31 * result + (bedsExtraYt != null ? bedsExtraYt.hashCode() : 0);
        result = 31 * result + (bedsExtraCount != null ? bedsExtraCount.hashCode() : 0);
        result = 31 * result + (bedsExtraCh != null ? bedsExtraCh.hashCode() : 0);
        result = 31 * result + (bedsExtraAd != null ? bedsExtraAd.hashCode() : 0);
        result = 31 * result + (crUserUid != null ? crUserUid.hashCode() : 0);
        result = 31 * result + (crDatetime != null ? crDatetime.hashCode() : 0);
        result = 31 * result + (crSessionId != null ? crSessionId.hashCode() : 0);
        result = 31 * result + (mfdUserUid != null ? mfdUserUid.hashCode() : 0);
        result = 31 * result + (mfdDatetime != null ? mfdDatetime.hashCode() : 0);
        result = 31 * result + (mfdSessionId != null ? mfdSessionId.hashCode() : 0);
        return result;
    }
}
