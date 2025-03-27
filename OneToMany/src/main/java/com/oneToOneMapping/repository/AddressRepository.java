package com.oneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneToOneMapping.Entities.Address;


public interface AddressRepository extends JpaRepository<Address, Long> {

}

