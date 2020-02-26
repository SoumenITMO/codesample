package com.samasa.hspms.Booking.validation.Entity;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FrmRateHeaderSearchPK implements Serializable {
    private String unitCode;
    private String rateCode;

    @Column(name = "unit_code")
    @Id
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Column(name = "rate_code")
    @Id
    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrmRateHeaderSearchPK that = (FrmRateHeaderSearchPK) o;
        return Objects.equal(unitCode, that.unitCode) &&
                Objects.equal(rateCode, that.rateCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unitCode, rateCode);
    }
}
