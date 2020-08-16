package com.hibernate.association.oneToOne.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class AddressPojo {

	private int addId;
	private String birthPlace;
	private String state;
    @JsonInclude(Include.NON_EMPTY)
	  private EmployeePojo employeInAddress;
	  
	  
	  public EmployeePojo getEmployeInAddress() { return employeInAddress; }
	  
	  public void setEmployeInAddress(EmployeePojo employeInAddress) {
	  this.employeInAddress = employeInAddress; }
	 
	 
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
