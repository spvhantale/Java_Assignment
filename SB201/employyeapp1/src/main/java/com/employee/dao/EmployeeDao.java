package com.employee.dao;

import com.employee.bean.Employee;

public interface EmployeeDao {

	public void save(Employee emp);
	public String getAddress(int empid);
	public String giveBonusToEmployee(int empid,int bonus);
	public boolean deleteEmployee(int empid);	
}
