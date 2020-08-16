package com.hibernate.association.oneToOne.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.association.oneToOne.entity.Address;

@Repository
public interface TestAddrepo extends CrudRepository<Address, Integer> {

	Address getAddressById(Integer i);

}
