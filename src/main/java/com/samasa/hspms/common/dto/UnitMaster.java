package com.samasa.hspms.common.dto;

import java.util.List;

public class UnitMaster<T> {
	
	private List<String> selUnits;
	private T masterDetails;
	
	public List<String> getSelUnits() {
		return selUnits;
	}
	public void setSelUnits(List<String> selUnits) {
		this.selUnits = selUnits;
	}
	public T getMasterDetails() {
		return masterDetails;
	}
	public void setMasterDetails(T masterDetails) {
		this.masterDetails = masterDetails;
	}

}
