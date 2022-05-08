package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.modal.Employee;

@Controller
public class HelloController {

	@Autowired
	EmployeeRepo repo;//Database Operation
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		
		 repo.save(employee);
		 return"home.jsp";
		 
	}
}
