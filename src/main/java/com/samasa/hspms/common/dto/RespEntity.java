package com.samasa.hspms.common.dto;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RespEntity<T> {
	
	private int status;
	private JsonNode data;
	
	public RespEntity() {
		
	}
	
	public RespEntity(int status,T entity) {
		this.status = status;
		this.data =  new ObjectMapper().convertValue(entity, JsonNode.class);
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public JsonNode getData() {
		return data;
	}
	public void setData(JsonNode data) {
		this.data = data;
	}


}
