package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;

@Controller
public class RegistrationController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/registration")
	public String reg(Map<String, Object> model) {
		model.put("employee", new EmployeeDto());
		return "Registration";
	}
	
	@PostMapping("/home")
	public String createEmployee(@ModelAttribute("employee") EmployeeDto empDto) {
		employeeService.createOrUpdateEmployee(empDto);
		return "redirect:/list";	
	}
	
	@GetMapping("/list")
	public String listOfEmployee(Model model) {
		List<EmployeeDto> employeeList = employeeService.getAllEmployee();
		model.addAttribute("empList", employeeList);
		return "employeeList";
	}
	
	@PostMapping("/delete")
	public String deleteEmployee(@RequestParam("id") String id) {
		employeeService.deleteEmployee(Long.parseLong(id));
		return "redirect:/list";		
	}
	
	@GetMapping("/edit")
	public String editEmployee(@RequestParam("id") String id, Map<String, Object> model) {
		EmployeeDto empDTO = employeeService.editEmployee(Long.parseLong(id));
		model.put("employee", empDTO);
		return "Registration";
	}

}
