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
public class Address {

	@Id
	@Column(name="add_id")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addId;
	private String birthPlace;
	private String state;

	
	
	@OneToOne(cascade = CascadeType.ALL  , mappedBy = "addressInEmp"  )
	//@JoinColumn(name = "yy" /* ,updatable = false, insertable = false */ )
	  // @PrimaryKeyJoinColumn  
	  private Employee employeInAddress;
	  
	  
	  public Employee getEmployeInAddress() { return employeInAddress; }
	  
	  public void setEmployeInAddress(Employee employeInAddress) {
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
