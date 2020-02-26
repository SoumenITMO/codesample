package com.samasa.hspms.common.dto;

import com.fasterxml.jackson.databind.JsonNode;

public class TableLayoutDto {
	
	private String field;
	private String fieldCode;
	private int columnOrder;
	private String columnWidth;
	private String caption;
	private String columnMandatory;
	private String columnToggle;
	private String columnReorder;
	private JsonNode action;
	private String columnTypeCode;
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getFieldCode() {
		return fieldCode;
	}
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}
	public int getColumnOrder() {
		return columnOrder;
	}
	public void setColumnOrder(int columnOrder) {
		this.columnOrder = columnOrder;
	}
	public String getColumnWidth() {
		return columnWidth;
	}
	public void setColumnWidth(String columnWidth) {
		this.columnWidth = columnWidth;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getColumnMandatory() {
		return columnMandatory;
	}
	public void setColumnMandatory(String columnMandatory) {
		this.columnMandatory = columnMandatory;
	}
	public String getColumnToggle() {
		return columnToggle;
	}
	public void setColumnToggle(String columnToggle) {
		this.columnToggle = columnToggle;
	}
	public String getColumnReorder() {
		return columnReorder;
	}
	public void setColumnReorder(String columnReorder) {
		this.columnReorder = columnReorder;
	}
	public JsonNode getAction() {
		return action;
	}
	public void setAction(JsonNode action) {
		this.action = action;
	}
	public String getColumnTypeCode() {
		return columnTypeCode;
	}
	public void setColumnTypeCode(String columnTypeCode) {
		this.columnTypeCode = columnTypeCode;
	}

}
