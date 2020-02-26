package com.samasa.hspms.common.dto;

import java.util.Date;

public class LanguageDto {
	
	private String lngCode;
	private String lngName;
	private String lngNameNative;
	private String lngCodeIso;
	private String rtlEnabled;
	private String defaultLng;
	private int lngSortorder;
	private String status;
	private Integer crUserUid;
	private String crByFirstName;
	private String crByLastName;
	private Date crDatetime;
	private Integer crSessionId;
	private Integer mfdUserUid;
	private String mfdByFirstName;
	private String mfdByLastName;
	private Date mfdDatetime;
	private Integer mfdSessionId;
	
	public String getLngCode() {
		return lngCode;
	}
	public void setLngCode(String lngCode) {
		this.lngCode = lngCode;
	}
	public String getLngName() {
		return lngName;
	}
	public void setLngName(String lngName) {
		this.lngName = lngName;
	}
	public String getLngNameNative() {
		return lngNameNative;
	}
	public void setLngNameNative(String lngNameNative) {
		this.lngNameNative = lngNameNative;
	}
	public String getLngCodeIso() {
		return lngCodeIso;
	}
	public void setLngCodeIso(String lngCodeIso) {
		this.lngCodeIso = lngCodeIso;
	}
	public String getRtlEnabled() {
		return rtlEnabled;
	}
	public void setRtlEnabled(String rtlEnabled) {
		this.rtlEnabled = rtlEnabled;
	}
	public String getDefaultLng() {
		return defaultLng;
	}
	public void setDefaultLng(String defaultLng) {
		this.defaultLng = defaultLng;
	}
	public int getLngSortorder() {
		return lngSortorder;
	}
	public void setLngSortorder(int lngSortorder) {
		this.lngSortorder = lngSortorder;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getCrByFirstName() {
		return crByFirstName;
	}
	public void setCrByFirstName(String crByFirstName) {
		this.crByFirstName = crByFirstName;
	}
	public String getCrByLastName() {
		return crByLastName;
	}
	public void setCrByLastName(String crByLastName) {
		this.crByLastName = crByLastName;
	}
	public String getMfdByFirstName() {
		return mfdByFirstName;
	}
	public void setMfdByFirstName(String mfdByFirstName) {
		this.mfdByFirstName = mfdByFirstName;
	}
	public String getMfdByLastName() {
		return mfdByLastName;
	}
	public void setMfdByLastName(String mfdByLastName) {
		this.mfdByLastName = mfdByLastName;
	}

}
