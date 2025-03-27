package com.oneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneToOneMapping.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
