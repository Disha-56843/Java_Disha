package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDto;

public interface EmployeeService {

	public void createOrUpdateEmployee(EmployeeDto empDTO);
	
	public List<EmployeeDto> getAllEmployee();
	
	public void deleteEmployee(Long id);
	
	public EmployeeDto editEmployee(Long id);
	
}
