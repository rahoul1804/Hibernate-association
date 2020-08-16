package com.hibernate.association.oneToOne.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class EmployeePojo {
	
	private int id;
	private String name;
	private String job_title;
	
    @JsonInclude(Include.NON_EMPTY)
	private List<AddressPojo> address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	
	public List<AddressPojo> getAddress() {
		return address;
	}

	public void setAddress(List<AddressPojo> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeePojo [id=" + id + ", name=" + name + ", job_title=" + job_title + ", address=" + address + "]";
	}
	
	

}
