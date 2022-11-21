package com.swapnil.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.swapnil.Exception.EmployeeException;
import com.swapnil.employeedto.EmployeeDTO;
import com.swapnil.model.Employee;
@Service
public interface EmployeeService {
	
	public Employee registerEmployee(Employee emp)throws EmployeeException;

	public Employee getEmployeeById(Integer empId)throws EmployeeException;
	
	public List<Employee> getAllEmployeeDetails()throws EmployeeException;
	
	public Employee deleteEmployeeById(Integer empId)throws EmployeeException;
	
	public Employee loginEmployee(String email, String password)throws EmployeeException;
	public List<Employee> getEmployeeDetailsByAddress(String address)throws
	EmployeeException;
	
	public Employee updateEmployee(Employee emp)throws EmployeeException;

	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee()throws
	EmployeeException;
}
