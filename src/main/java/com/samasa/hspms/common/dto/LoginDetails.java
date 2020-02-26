package com.samasa.hspms.common.dto;

public class LoginDetails {
	
	private Integer userId;
	private String corpId;
	private String unitCode;
	private String productCode;
	private String moduleCode;
	private String formCode;
	private String isformControl;
	private String sessionToken;
	private Integer sessionId;
	private String lngCode;
	private String unitBusDate;
	private String userType;
	private Integer userConcurrentId;
	private String accessToken;
	private String method;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCorpId() {
		return corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public String getFormCode() {
		return formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}
	public String getIsformControl() {
		return isformControl;
	}
	public void setIsformControl(String isformControl) {
		this.isformControl = isformControl;
	}
	public String getSessionToken() {
		return sessionToken;
	}
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}
	public String getLngCode() {
		return lngCode;
	}
	public String getUnitBusDate() {
		return unitBusDate;
	}
	public void setUnitBusDate(String unitBusDate) {
		this.unitBusDate = unitBusDate;
	}
	public void setLngCode(String lngCode) {
		this.lngCode = lngCode;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Integer getUserConcurrentId() {
		return userConcurrentId;
	}
	public void setUserConcurrentId(Integer userConcurrentId) {
		this.userConcurrentId = userConcurrentId;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}

}
