package com.hibernate.association.oneToOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.association.oneToOne.entity.Employee;

@Repository
public interface TestEmpRepo  extends JpaRepository<Employee, Integer> {

	Employee getEmployeeById(Integer i);
}
