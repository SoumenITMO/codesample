package com.samasa.hspms.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "bpm_log_header")
public class BpmLogHeader implements java.io.Serializable {

	private Integer seqnoId;
	private String productCode;
	private String moduleCode;
	private String formCode;
	private Date crDatetime;
	private Integer crSessionId;
	private int crUserUid;

	public BpmLogHeader() {
	}

	public BpmLogHeader(String productCode, String moduleCode, String formCode, Date crDatetime, int crUserUid, Integer crSessionId) {
		this.productCode = productCode;
		this.moduleCode = moduleCode;
		this.formCode = formCode;
		this.crDatetime = crDatetime;
		this.crUserUid = crUserUid;
		this.crSessionId = crSessionId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "seqno_id", unique = true, nullable = false)
	public Integer getSeqnoId() {
		return this.seqnoId;
	}

	public void setSeqnoId(Integer seqnoId) {
		this.seqnoId = seqnoId;
	}

	@Column(name = "product_code", nullable = false, length = 5)
	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Column(name = "module_code", nullable = false, length = 5)
	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	@Column(name = "form_code", nullable = false, length = 10)
	public String getFormCode() {
		return this.formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cr_datetime", nullable = false, length = 19)
	public Date getCrDatetime() {
		return this.crDatetime;
	}

	public void setCrDatetime(Date crDatetime) {
		this.crDatetime = crDatetime;
	}

	@Column(name = "cr_session_id")
	public Integer getCrSessionId() {
		return this.crSessionId;
	}

	public void setCrSessionId(Integer crSessionId) {
		this.crSessionId = crSessionId;
	}

	@Column(name = "cr_user_uid", nullable = false)
	public int getCrUserUid() {
		return this.crUserUid;
	}

	public void setCrUserUid(int crUserUid) {
		this.crUserUid = crUserUid;
	}

}
