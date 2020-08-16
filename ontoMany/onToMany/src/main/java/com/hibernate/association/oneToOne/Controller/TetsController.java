package com.hibernate.association.oneToOne.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.association.oneToOne.entity.Address;
import com.hibernate.association.oneToOne.entity.AddressPojo;
import com.hibernate.association.oneToOne.entity.Employee;
import com.hibernate.association.oneToOne.entity.EmployeePojo;
import com.hibernate.association.oneToOne.repo.TestAddrepo;
import com.hibernate.association.oneToOne.repo.TestEmpRepo;

@RestController
@RequestMapping("/test")
public class TetsController {

	
	@Autowired
	TestEmpRepo testrepo;
	
	@Autowired
	TestAddrepo testaddrepo;
	
	@GetMapping("/a")
	public String getHello() {
		
		Address a1 = new Address();
		//a1.setId(101);
		a1.setBirthPlace("kne");
		a1.setState("bihar");
		
		
		Address a2 = new Address();
		a2.setBirthPlace("bangalore");
		a2.setState("karnataka"); 
		
		
		List<Address> l = new ArrayList<>();
		l.add(a1);
		l.add(a2);
		
		Employee e = new Employee();
		//e.setEmpId(1);
		e.setJob_title("software_eng");
		e.setName("Rahul");
		e.setAddress(l);
		//e.setAddressInEmp(a1);
		//a1.setEmployeInAddress(e);
		
		testrepo.save(e);
		
		a1.setEmp(e);
		a2.setEmp(e);
		testaddrepo.save(a2);
		testaddrepo.save(a1);
		
		
		
		return "Welcome in Cart";
	}
	
	@GetMapping("/b")
	public EmployeePojo getHellob() {
		
		Employee e = testrepo.getEmployeeById(1);
		
		EmployeePojo ep = new EmployeePojo();
		List<AddressPojo> la = new ArrayList<>();
		for (Address e1 : e.getAddress()) {
			AddressPojo addressPojo = new AddressPojo();
			addressPojo.setBirthPlace(e1.getBirthPlace());
			addressPojo.setId(e1.getId());
			addressPojo.setState(e1.getState());
			la.add(addressPojo);
		}
		ep.setAddress(la);
		ep.setId(e.getId());
		ep.setJob_title(e.getJob_title());
		ep.setName(e.getName());
		return ep;
	
	}
	
	@GetMapping("/c")
	public AddressPojo getHelloc() {
		
		Address ad = testaddrepo.getAddressById(2);
		AddressPojo adp = new AddressPojo();
		adp.setBirthPlace(ad.getBirthPlace());
		adp.setId(ad.getId());
		adp.setState(ad.getState());
		
		EmployeePojo ep = new EmployeePojo();
		ep.setId(ad.getEmp().getId());
		ep.setJob_title(ad.getEmp().getJob_title());
		ep.setName(ad.getEmp().getName());
		
		adp.setEmp(ep);
		return adp;
	
	}
	
}
