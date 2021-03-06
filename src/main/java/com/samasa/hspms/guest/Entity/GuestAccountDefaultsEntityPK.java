package com.samasa.hspms.guest.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class GuestAccountDefaultsEntityPK implements Serializable {
    private String unitCode;
    private Integer guestUid;

    @Column(name = "unit_code", nullable = false, length = 5)
    @Id
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Column(name = "guest_uid", nullable = false)
    @Id
    public Integer getGuestUid() {
        return guestUid;
    }

    public void setGuestUid(Integer guestUid) {
        this.guestUid = guestUid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuestAccountDefaultsEntityPK that = (GuestAccountDefaultsEntityPK) o;

        if (unitCode != null ? !unitCode.equals(that.unitCode) : that.unitCode != null) return false;
        if (guestUid != null ? !guestUid.equals(that.guestUid) : that.guestUid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unitCode != null ? unitCode.hashCode() : 0;
        result = 31 * result + (guestUid != null ? guestUid.hashCode() : 0);
        return result;
    }
}
