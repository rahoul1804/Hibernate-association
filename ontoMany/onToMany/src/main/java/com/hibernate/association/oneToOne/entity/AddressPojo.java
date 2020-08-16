package com.hibernate.association.oneToOne.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class AddressPojo {

private int id;
	
	private String birthPlace;
	private String state;
    @JsonInclude(Include.NON_EMPTY)
	EmployeePojo emp;
	
	
	@Override
	public String toString() {
		return "AddressPojo [id=" + id + ", birthPlace=" + birthPlace + ", state=" + state + ", emp=" + emp + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public EmployeePojo getEmp() {
		return emp;
	}

	public void setEmp(EmployeePojo emp) {
		this.emp = emp;
	}

	
}
