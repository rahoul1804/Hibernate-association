package com.hibernate.association.oneToOne.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id()
	@Column(name="emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private String job_title;
	
	@OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "xx" /* ,updatable = false, insertable = false */ )
	private Address addressInEmp;
	
	public Address getAddressInEmp() {
		return addressInEmp;
	}
	public void setAddressInEmp(Address addressInEmp) {
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
