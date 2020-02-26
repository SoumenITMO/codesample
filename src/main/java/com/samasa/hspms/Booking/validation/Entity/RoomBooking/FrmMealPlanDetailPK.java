package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FrmMealPlanDetailPK implements Serializable {
    private String unitCode;
    private String mealPlanCode;
    private String mealType;
    private String paxType;
    private String dow;
    private String curCode;

    @Column(name = "unit_code", nullable = false, length = 5)
    @Id
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Column(name = "meal_plan_code", nullable = false, length = 4)
    @Id
    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    @Column(name = "meal_type", nullable = false, length = 4)
    @Id
    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Column(name = "pax_type", nullable = false, length = 2)
    @Id
    public String getPaxType() {
        return paxType;
    }

    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    @Column(name = "dow", nullable = false, length = 2)
    @Id
    public String getDow() {
        return dow;
    }

    public void setDow(String dow) {
        this.dow = dow;
    }

    @Column(name = "cur_code", nullable = false, length = 3)
    @Id
    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrmMealPlanDetailPK that = (FrmMealPlanDetailPK) o;
        return Objects.equal(unitCode, that.unitCode) &&
                Objects.equal(mealPlanCode, that.mealPlanCode) &&
                Objects.equal(mealType, that.mealType) &&
                Objects.equal(paxType, that.paxType) &&
                Objects.equal(dow, that.dow) &&
                Objects.equal(curCode, that.curCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unitCode, mealPlanCode, mealType, paxType, dow, curCode);
    }
}
