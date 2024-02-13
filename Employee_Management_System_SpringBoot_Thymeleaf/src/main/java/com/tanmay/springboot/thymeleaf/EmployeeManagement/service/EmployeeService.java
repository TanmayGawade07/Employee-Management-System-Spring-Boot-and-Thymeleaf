package com.tanmay.springboot.thymeleaf.EmployeeManagement.service;

import java.util.List;

import com.tanmay.springboot.thymeleaf.EmployeeManagement.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
