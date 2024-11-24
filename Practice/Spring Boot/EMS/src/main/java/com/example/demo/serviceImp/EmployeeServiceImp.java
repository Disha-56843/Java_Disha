package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import com.example.repo.UserRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public void createOrUpdateEmployee(EmployeeDto empDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public EmployeeDto editEmployee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
