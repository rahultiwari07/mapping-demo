package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmloyeeService;

@RestController
public class IndexController {
	
	@Autowired EmloyeeService employeeService;
	
	@GetMapping("/index")
	public String indexPage() {
		
		return "hello";
	}
	
	@PostMapping("saveEmployee")
	public void saveEmployee(@RequestBody Employee employee) {
		
		System.out.println("employee name : " + employee.getEmpName());
		if(employee.getEmpName() != null) {
			employeeService.saveEmployee(employee);
		}
	}
		

}
