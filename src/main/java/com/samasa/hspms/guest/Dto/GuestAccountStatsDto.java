package com.samasa.hspms.guest.Dto;

import java.sql.Timestamp;
import java.util.Date;

public class GuestAccountStatsDto {
	
	private String unitCode;
	private int guestUid;
	private int noOfReservations;
	private int noOfCancellations;
	private double revenueRooms;
	private double revenueFnb;
	private double revenueOthers;
	private double revenueTotal;
	private int fnbPosCovers;
	private double fnbPosRevenue;
	private Date firstVisit;
	private Date lastVisit;
	private int nofVisit;
	private String luRoomType;
	private String luRateCode;
	private String luPayCode;
	private double luRoomRate;
	private double luGuestRate;
	private double luRackRate;
	private Integer crUserUid;
	private Date crDatetime;
	private Integer crSessionId;
	private Integer mfdUserUid;
	private Date mfdDatetime;
	private Integer mfdSessionId;
	
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public int getGuestUid() {
		return guestUid;
	}
	public void setGuestUid(int guestUid) {
		this.guestUid = guestUid;
	}
	public int getNoOfReservations() {
		return noOfReservations;
	}
	public void setNoOfReservations(int noOfReservations) {
		this.noOfReservations = noOfReservations;
	}
	public int getNoOfCancellations() {
		return noOfCancellations;
	}
	public void setNoOfCancellations(int noOfCancellations) {
		this.noOfCancellations = noOfCancellations;
	}
	public double getRevenueRooms() {
		return revenueRooms;
	}
	public void setRevenueRooms(double revenueRooms) {
		this.revenueRooms = revenueRooms;
	}
	public double getRevenueFnb() {
		return revenueFnb;
	}
	public void setRevenueFnb(double revenueFnb) {
		this.revenueFnb = revenueFnb;
	}
	public double getRevenueOthers() {
		return revenueOthers;
	}
	public void setRevenueOthers(double revenueOthers) {
		this.revenueOthers = revenueOthers;
	}
	public double getRevenueTotal() {
		return revenueTotal;
	}
	public void setRevenueTotal(double revenueTotal) {
		this.revenueTotal = revenueTotal;
	}
	public int getFnbPosCovers() {
		return fnbPosCovers;
	}
	public void setFnbPosCovers(int fnbPosCovers) {
		this.fnbPosCovers = fnbPosCovers;
	}
	public double getFnbPosRevenue() {
		return fnbPosRevenue;
	}
	public void setFnbPosRevenue(double fnbPosRevenue) {
		this.fnbPosRevenue = fnbPosRevenue;
	}
	public Date getFirstVisit() {
		return firstVisit;
	}
	public void setFirstVisit(Date firstVisit) {
		this.firstVisit = firstVisit;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	public int getNofVisit() {
		return nofVisit;
	}
	public void setNofVisit(int nofVisit) {
		this.nofVisit = nofVisit;
	}
	public String getLuRoomType() {
		return luRoomType;
	}
	public void setLuRoomType(String luRoomType) {
		this.luRoomType = luRoomType;
	}
	public String getLuRateCode() {
		return luRateCode;
	}
	public Integer getCrUserUid() {
		return crUserUid;
	}
	public void setCrUserUid(Integer crUserUid) {
		this.crUserUid = crUserUid;
	}
	public Date getCrDatetime() {
		return crDatetime;
	}
	public void setCrDatetime(Date crDatetime) {
		this.crDatetime = crDatetime;
	}
	public Integer getCrSessionId() {
		return crSessionId;
	}
	public void setCrSessionId(Integer crSessionId) {
		this.crSessionId = crSessionId;
	}
	public Integer getMfdUserUid() {
		return mfdUserUid;
	}
	public void setMfdUserUid(Integer mfdUserUid) {
		this.mfdUserUid = mfdUserUid;
	}
	public Date getMfdDatetime() {
		return mfdDatetime;
	}
	public void setMfdDatetime(Date mfdDatetime) {
		this.mfdDatetime = mfdDatetime;
	}
	public Integer getMfdSessionId() {
		return mfdSessionId;
	}
	public void setMfdSessionId(Integer mfdSessionId) {
		this.mfdSessionId = mfdSessionId;
	}
	public void setLuRateCode(String luRateCode) {
		this.luRateCode = luRateCode;
	}
	public String getLuPayCode() {
		return luPayCode;
	}
	public void setLuPayCode(String luPayCode) {
		this.luPayCode = luPayCode;
	}
	public double getLuRoomRate() {
		return luRoomRate;
	}
	public void setLuRoomRate(double luRoomRate) {
		this.luRoomRate = luRoomRate;
	}
	public double getLuGuestRate() {
		return luGuestRate;
	}
	public void setLuGuestRate(double luGuestRate) {
		this.luGuestRate = luGuestRate;
	}
	public double getLuRackRate() {
		return luRackRate;
	}
	public void setLuRackRate(double luRackRate) {
		this.luRackRate = luRackRate;
	}

	
}
