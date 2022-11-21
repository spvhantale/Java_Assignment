package com.swapnil.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swapnil.Exception.EmployeeException;
import com.swapnil.employeedto.EmployeeDTO;
import com.swapnil.employeedto.EmployeeLogin;
import com.swapnil.model.Employee;
import com.swapnil.service.EmployeeService;

@RestController
public class Mycontroller {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> registerEmployeedetail(@Valid@RequestBody Employee a) throws EmployeeException{
		
		Employee ac=service.registerEmployee(a);
		
		return new ResponseEntity<Employee>(ac, HttpStatus.OK);
		
	}
	@GetMapping("/employees/{empid}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("empid")Integer id) throws EmployeeException {
		
		Employee em=service.getEmployeeById(id);
		
		return  new ResponseEntity<Employee>(em, HttpStatus.OK); 
	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployees() throws EmployeeException {
		
		List<Employee> em=service.getAllEmployeeDetails();
		
		return  new ResponseEntity<List<Employee>>(em, HttpStatus.OK); 
	}
	@DeleteMapping("/employees/{empid}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("empid") Integer id) throws EmployeeException{
		
		Employee em=service.deleteEmployeeById(id);
		return new ResponseEntity<Employee>(em, HttpStatus.OK);
	}
	@PostMapping("/getemployee")
	public ResponseEntity<Employee> loginEmployee(@RequestBody EmployeeLogin em) throws EmployeeException{
		
		Employee e=service.loginEmployee(em.getEmail(), em.getPassword());
		return new ResponseEntity<Employee>(e,HttpStatus.OK);
	}
	
	@GetMapping("/employees/{address}")
public ResponseEntity<List<Employee>> getallEmployeenyaddress(@PathVariable("address") String address) throws EmployeeException{
		
		List<Employee> e=service.getEmployeeDetailsByAddress(address);
		return new ResponseEntity<List<Employee>>(e,HttpStatus.OK);
	}
	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee e) throws EmployeeException{
		
		Employee em=service.updateEmployee(e);
		
		return new ResponseEntity<Employee>(em,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/getemployeessalary")
	public ResponseEntity<List<EmployeeDTO>> getallEmployeewithnameandsalary() throws EmployeeException{
			
			List<EmployeeDTO> e=service.getNameAddressSalaryOfAllEmployee();
			return new ResponseEntity<List<EmployeeDTO>>(e,HttpStatus.OK);
		}
	
	
}
