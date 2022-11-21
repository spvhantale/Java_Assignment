package com.swapnil.useCase;

import java.util.Scanner;

import com.swapnil.dao.EmployeeDao;
import com.swapnil.dao.EmployeeDaoImpl;
import com.swapnil.model.Department;

public class AddDepartmentCase {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department name");
		String name=sc.next();
		System.out.println("Enter the location");
		String loc=sc.next();
		EmployeeDao ed=new EmployeeDaoImpl();
		Department d1=new Department();
		d1.setDeptName(name);
		d1.setLocation(loc);
		ed.addDepartment(d1);
		
	}
}
