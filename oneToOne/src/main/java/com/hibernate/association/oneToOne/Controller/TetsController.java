package com.hibernate.association.oneToOne.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.association.oneToOne.entity.Address;
import com.hibernate.association.oneToOne.entity.Employee;
import com.hibernate.association.oneToOne.pojo.AddressPojo;
import com.hibernate.association.oneToOne.pojo.EmployeePojo;
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
		//a1.setAddId(101);
		a1.setBirthPlace("kne");
		a1.setState("bihar");
		testaddrepo.save(a1);
		
		Employee e = new Employee();
		e.setEmpId(1);
		e.setJob_title("software_eng");
		e.setName("Rahul");
		e.setAddressInEmp(a1);
		a1.setEmployeInAddress(e);

		testrepo.save(e);
		
		return "Welcome in Cart";
	}
	
	@GetMapping("/b")
	public EmployeePojo getEmployeePojo() {
		
		Employee e = testrepo.getEmployeeByEmpId(1);
		
		EmployeePojo ep = new EmployeePojo();
		ep.setEmpId(e.getEmpId());
		ep.setJob_title(e.getJob_title());
		ep.setName(e.getName());
		AddressPojo ap =new AddressPojo();
		ap.setAddId(e.getAddressInEmp().getAddId());
		ap.setBirthPlace(e.getAddressInEmp().getBirthPlace());
		ap.setState(e.getAddressInEmp().getState());
		ep.setAddressInEmp(ap);
		return ep;
	
	}
	
	@GetMapping("/c")
	public Address getHelloc() {
		
		return testaddrepo.getAddressByAddId(0);
		
//		return "got";
	
	}
	
		
	
}
