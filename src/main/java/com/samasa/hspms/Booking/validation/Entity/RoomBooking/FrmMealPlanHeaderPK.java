package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FrmMealPlanHeaderPK implements Serializable {
    private String unitCode;
    private String mealPlanCode;

    @Column(name = "unit_code")
    @Id
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Column(name = "meal_plan_code")
    @Id
    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrmMealPlanHeaderPK that = (FrmMealPlanHeaderPK) o;
        return Objects.equal(unitCode, that.unitCode) &&
                Objects.equal(mealPlanCode, that.mealPlanCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unitCode, mealPlanCode);
    }
}
