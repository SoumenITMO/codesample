package com.samasa.hspms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConstants {

	public static String ACTIVESTATUS;
	public static String INACTIVESTATUS;
	public static String DELETESTATUS;
	public static String SSID;
	public static String ALL;
	public static String YES;
	public static String NO;
	
	public static Integer RES_SUCCESS;
	public static Integer RES_SUCCESS_201;
	public static Integer RES_FAIL;
	public static Integer RES_EXCEPTION;
	public static Integer RES_ACCESS_DENIED;
	public static Integer RES_BAD_REQUEST;
	
	@Value("${res_success}")
	public void setSuccess(Integer success) {
		RES_SUCCESS = success;
	}
	
	@Value("${res_success_201}")
	public void setSuccess201(Integer success201) {
		RES_SUCCESS_201 = success201;
	}
	
	@Value("${res_fail}")
	public void setFail(Integer fail) {
		RES_FAIL = fail;
	}
	
	@Value("${all}")
	public void setAll(String all) {
		ALL = all;
	}
	
	@Value("${res_exception}")
	public void setException(Integer excption) {
		RES_EXCEPTION = excption;
	}
	
	@Value("${res_access_denied}")
	public void setAccessDenied(Integer accessDenied) {
		RES_ACCESS_DENIED = accessDenied;
	}
	
	@Value("${res_bad_request}")
	public void setBadRequest(Integer badReq) {
		RES_BAD_REQUEST = badReq;
	}

    @Value("${active_status}")
    public void setActiveStatus(String activeStatus) {
    	ACTIVESTATUS = activeStatus;
    }
    
    @Value("${ssid}")
    public void setSSID(String ssid) {
    	SSID = ssid;
    }
    
    @Value("${inactive_status}")
    public void setInactiveStatus(String inactiveStatus) {
    	INACTIVESTATUS = inactiveStatus;
    }
    
    @Value("${delete_status}")
    public void setDeleteStatus(String deleteStatus) {
    	DELETESTATUS = deleteStatus;
    }
    
    @Value("${yes}")
    public void setYes(String yes) {
    	YES = yes;
    }
    
    @Value("${no}")
    public void setNo(String no) {
    	NO = no;
    }
	
}
