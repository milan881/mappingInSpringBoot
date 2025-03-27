package com.oneToOneMapping.Entities;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empId")
	private long empId;
	
	@Column(name = "empName")
	private String empName;
	
	@Column(name = "empAge")
	private int empAge;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_emp_id",referencedColumnName = "empId")
	private List<Address> address;
	
}
