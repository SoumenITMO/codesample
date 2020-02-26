package com.samasa.hspms.Booking.validation.Dto.SubSections.RoomType;

import java.sql.Date;

public class RoomTypeDto {

    private String unitCode;
    private Date busDate;
    private String occRoomType;
    private Integer upSellCount;
    private Integer sellCount;
    private Integer avalCount;
    private String stopSell;
    private Date cldForArr;
    private Date cldForDep;

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Date getBusDate() {
        return busDate;
    }

    public void setBusDate(Date busDate) {
        this.busDate = busDate;
    }

    public String getOccRoomType() {
        return occRoomType;
    }

    public void setOccRoomType(String occRoomType) {
        this.occRoomType = occRoomType;
    }

    public Integer getUpSellCount() {
        return upSellCount;
    }

    public void setUpSellCount(Integer upSellCount) {
        this.upSellCount = upSellCount;
    }

    public Integer getSellCount() {
        return sellCount;
    }

    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

    public Integer getAvalCount() {
        return avalCount;
    }

    public void setAvalCount(Integer avalCount) {
        this.avalCount = avalCount;
    }

    public String getStopSell() {
        return stopSell;
    }

    public void setStopSell(String stopSell) {
        this.stopSell = stopSell;
    }

    public Date getCldForArr() {
        return cldForArr;
    }

    public void setCldForArr(Date cldForArr) {
        this.cldForArr = cldForArr;
    }

    public Date getCldForDep() {
        return cldForDep;
    }

    public void setCldForDep(Date cldForDep) {
        this.cldForDep = cldForDep;
    }
}
