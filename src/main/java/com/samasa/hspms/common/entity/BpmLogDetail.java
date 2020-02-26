package com.samasa.hspms.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "bpm_log_detail")
public class BpmLogDetail implements java.io.Serializable {

	private Integer seqno;
	private BpmLogHeader bpmLogHeader;
	private String referenceId;
	private String fieldCode;
	private String formCode;
	private String productCode;
	private String moduleCode;
	private String fieldOldvalue;
	private String fieldNewvalue;
	private String activityType;
	private int crUserUid;
	private Date crDatetime;
	private Integer crSessionId;

	public BpmLogDetail() {
	}

	public BpmLogDetail(BpmLogHeader bpmLogHeader, String referenceId, String fieldCode, String formCode,
			String productCode, String moduleCode, String fieldOldvalue, String fieldNewvalue, String activityType,
			int crUserUid, Date crDatetime, Integer crSessionId) {
		this.bpmLogHeader = bpmLogHeader;
		this.referenceId = referenceId;
		this.fieldCode = fieldCode;
		this.formCode = formCode;
		this.productCode = productCode;
		this.moduleCode = moduleCode;
		this.fieldOldvalue = fieldOldvalue;
		this.fieldNewvalue = fieldNewvalue;
		this.activityType = activityType;
		this.crUserUid = crUserUid;
		this.crDatetime = crDatetime;
		this.crSessionId = crSessionId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "seqno", unique = true, nullable = false)
	public Integer getSeqno() {
		return this.seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seqno_id", nullable = false)
	public BpmLogHeader getBpmLogHeader() {
		return this.bpmLogHeader;
	}

	public void setBpmLogHeader(BpmLogHeader bpmLogHeader) {
		this.bpmLogHeader = bpmLogHeader;
	}

	@Column(name = "reference_id")
	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	@Column(name = "field_code", nullable = false, length = 50)
	public String getFieldCode() {
		return this.fieldCode;
	}

	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	@Column(name = "form_code", nullable = false, length = 10)
	public String getFormCode() {
		return this.formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
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

	@Column(name = "field_oldvalue", length = 100)
	public String getFieldOldvalue() {
		return this.fieldOldvalue;
	}

	public void setFieldOldvalue(String fieldOldvalue) {
		this.fieldOldvalue = fieldOldvalue;
	}

	@Column(name = "field_newvalue", length = 100)
	public String getFieldNewvalue() {
		return this.fieldNewvalue;
	}

	public void setFieldNewvalue(String fieldNewvalue) {
		this.fieldNewvalue = fieldNewvalue;
	}

	@Column(name = "activity_type", nullable = false, length = 8)
	public String getActivityType() {
		return this.activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	@Column(name = "cr_user_uid", nullable = false)
	public int getCrUserUid() {
		return this.crUserUid;
	}

	public void setCrUserUid(int crUserUid) {
		this.crUserUid = crUserUid;
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

}
