package com.hibernate.association.oneToOne.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
//	@Column(name="add_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String birthPlace;
	private String state;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	Employee emp;
	
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
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
	@Override
	public String toString() {
		return "Address [id=" + id + ", birthPlace=" + birthPlace + ", state=" + state + ", emp=" + emp + "]";
	}
	
	
	

}
