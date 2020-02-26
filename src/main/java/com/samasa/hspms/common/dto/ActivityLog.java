package com.samasa.hspms.common.dto;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;

public class ActivityLog {
	
	@Id
	private String id;
	
	private String productCode;
	private String moduleCode;
	private String formCode;
	private List<ActivityLogDtls> applicationLogDtls;
	
	private Integer crUserUid;
	private String crFirstName;
	private String crLastName;
	private Date crDatetime;
	private Integer crSessionId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public List<ActivityLogDtls> getApplicationLogDtls() {
		return applicationLogDtls;
	}
	public void setApplicationLogDtls(List<ActivityLogDtls> applicationLogDtls) {
		this.applicationLogDtls = applicationLogDtls;
	}
	public Integer getCrUserUid() {
		return crUserUid;
	}
	public void setCrUserUid(Integer crUserUid) {
		this.crUserUid = crUserUid;
	}
	public String getCrFirstName() {
		return crFirstName;
	}
	public void setCrFirstName(String crFirstName) {
		this.crFirstName = crFirstName;
	}
	public String getCrLastName() {
		return crLastName;
	}
	public void setCrLastName(String crLastName) {
		this.crLastName = crLastName;
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

}
