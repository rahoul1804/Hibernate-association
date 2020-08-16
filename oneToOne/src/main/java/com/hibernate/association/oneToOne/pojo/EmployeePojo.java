package com.hibernate.association.oneToOne.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class EmployeePojo {
	
	private int empId;
	private String name;
	private String job_title;
    @JsonInclude(Include.NON_EMPTY)
	private AddressPojo addressInEmp;
	
	public AddressPojo getAddressInEmp() {
		return addressInEmp;
	}
	public void setAddressInEmp(AddressPojo addressInEmp) {
		this.addressInEmp = addressInEmp;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

}
