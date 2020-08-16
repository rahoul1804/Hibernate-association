package com.hibernate.association.oneToOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.association.oneToOne.entity.Address;

@Repository
public interface TestAddrepo extends JpaRepository<Address, Integer> {

	Address getAddressByAddId(Integer b);
}
