package com.samasa.hspms.common.dto;

import java.util.Date;

public class DayOfTheWeekDto {
	
	private String unitCode;
	private String dow;
	private int dowSeq;
	private String dowType;
	private String dowSname;
	private String dowLname;
	private String dowColor;
	private String dowTypeSname;
	private String dowTypeColor;
	private String status;
	private int crUserUid;
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
	public String getDow() {
		return dow;
	}
	public void setDow(String dow) {
		this.dow = dow;
	}
	public int getDowSeq() {
		return dowSeq;
	}
	public void setDowSeq(int dowSeq) {
		this.dowSeq = dowSeq;
	}
	public String getDowType() {
		return dowType;
	}
	public void setDowType(String dowType) {
		this.dowType = dowType;
	}
	public String getDowSname() {
		return dowSname;
	}
	public void setDowSname(String dowSname) {
		this.dowSname = dowSname;
	}
	public String getDowLname() {
		return dowLname;
	}
	public void setDowLname(String dowLname) {
		this.dowLname = dowLname;
	}
	public String getDowColor() {
		return dowColor;
	}
	public void setDowColor(String dowColor) {
		this.dowColor = dowColor;
	}
	public String getDowTypeSname() {
		return dowTypeSname;
	}
	public void setDowTypeSname(String dowTypeSname) {
		this.dowTypeSname = dowTypeSname;
	}
	public String getDowTypeColor() {
		return dowTypeColor;
	}
	public void setDowTypeColor(String dowTypeColor) {
		this.dowTypeColor = dowTypeColor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCrUserUid() {
		return crUserUid;
	}
	public void setCrUserUid(int crUserUid) {
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

}
