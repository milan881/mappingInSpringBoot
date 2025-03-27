package com.oneToOneMapping.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oneToOneMapping.entites.Employee;
import com.oneToOneMapping.repository.EmployeeRepository;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;
			
		
		@RequestMapping("/saveEmp")
		public ResponseEntity<String> saveEmployee(@RequestBody Employee empData) {
		    empRepo.save(empData);
		    return ResponseEntity.ok("Employee saved successfully!");
		}

}	

