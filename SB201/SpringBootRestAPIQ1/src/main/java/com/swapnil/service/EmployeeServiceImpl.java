package com.swapnil.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swapnil.Exception.EmployeeException;
import com.swapnil.JPA.JPAInterface;
import com.swapnil.employeedto.EmployeeDTO;
import com.swapnil.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private JPAInterface jpadata;
	
	

	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
			Employee a=jpadata.save(emp);
		
		if(a!=null)return a;
		else {
			throw new EmployeeException("account not created");
		}
	}



	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		
		
Optional<Employee>	opj=jpadata.findById(empId);
		if(opj.isPresent()) {
			return opj.get();
		}else {
			throw new EmployeeException("employee not found");
		}

		
	}



	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		
		List<Employee> list=jpadata.findAll();
		if(list.size()==0) {
			throw new EmployeeException("Employees not present");
		}
		
		return list;
	}



	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		
		Optional<Employee>	opj=jpadata.findById(empId);
		if(opj.isPresent()) {
			jpadata.deleteById(empId);
			return opj.get();
			
		}else {
			throw new EmployeeException("employee not found");
		}
		
	}



	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		
		Employee em=jpadata.findByEmailAndPassword(email, password);
		
		if(em!=null) {
			return em;
		}else {
			throw new EmployeeException("USername or password is wrong");
		}
		
		
	}



	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		
		List<Employee> em=jpadata.findByAddress(address);
		
		if(em.size()==0) {
			throw new EmployeeException("Data not found");
		}else {
			return em;
		}
		
	}



	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		
		Optional<Employee> e=jpadata.findById(emp.getEmpId());
		if(e.isPresent()) {
			Employee em=e.get();
			em=emp;
			return em;
		}else {
			throw new EmployeeException("data not found");
		}
		
	}



	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		
		List<EmployeeDTO>d=jpadata.getemployees();
		if(d==null) {
			throw new EmployeeException("Employee not present");
		}
		return d;
	}

}
