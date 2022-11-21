package com.swapnil.useCase;

import java.util.Scanner;

import com.swapnil.dao.EmployeeDao;
import com.swapnil.dao.EmployeeDaoImpl;
import com.swapnil.exception.DepartmentException;
import com.swapnil.exception.EmployeeException;

public class ResigsterEmployeeasDepartment {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the department id");
		int did=sc.nextInt();
		System.out.println("Enter the employee id");
		int eid=sc.nextInt();
		
		EmployeeDao ed=new EmployeeDaoImpl();
		try {
			ed.registerEmployeeTODepartment(eid, did);
		} catch (EmployeeException | DepartmentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
