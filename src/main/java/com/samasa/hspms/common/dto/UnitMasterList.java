package com.samasa.hspms.common.dto;


import java.util.List;

public class UnitMasterList<T> {
	
	private List<String> selUnits;
	private List<T> masterDetails;
	
	
	public List<String> getSelUnits() {
		return selUnits;
	}
	public void setSelUnits(List<String> selUnits) {
		this.selUnits = selUnits;
	}
	public List<T> getMasterDetails() {
		return masterDetails;
	}
	public void setMasterDetails(List<T> masterDetails) {
		this.masterDetails = masterDetails;
	}
	
	

}
