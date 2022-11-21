package com.swapnil.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swapnil.model.Employee;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	public String getWelcome() {
		return "Welcome to Spring Boot";
	}
	@RequestMapping("/employee")
	public Employee getEmployee() {
		return new Employee(101, "Swapnil", "Latur", 450000);
	}
	@RequestMapping("/employees")
	public List<Employee> getlistEmployee(){
		List<Employee> list= new ArrayList<>();
		list.add(new Employee(101, "Swapnil", "Latur", 450000));
		list.add(new Employee(102, "Vhantale", "Pune", 550000));
		list.add(new Employee(103, "Kunal", "Amravati", 750000));
		list.add(new Employee(104, "Hole", "Jalna", 850000));
		list.add(new Employee(105, "Ranjit", "Mumbai", 950000));
		return list;
		
		
	}
	

}
