package com.swapnil.useCase;

import java.util.Scanner;

import com.swapnil.dao.EmployeeDao;
import com.swapnil.dao.EmployeeDaoImpl;
import com.swapnil.model.Address;
import com.swapnil.model.Employee;

public class AddEmployeeuseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name");
		String name=sc.next();
		System.out.println("Enter the salary");
		int salary=sc.nextInt();
		System.out.println("Enter the address");
		System.out.println("Enter the city");
		String city=sc.next();
		System.out.println("Enter the state");
		String state=sc.next();
		System.out.println("Enter the pincode");
		String pincode=sc.next();
		
		Employee e=new Employee();
		e.setEmpName(name);
		e.setSalary(salary);
		e.setAddress(new Address(city, state, pincode));
		
		EmployeeDao ed=new EmployeeDaoImpl();
		ed.addEmployee(e);
		
		
		
		
		
	}

}
