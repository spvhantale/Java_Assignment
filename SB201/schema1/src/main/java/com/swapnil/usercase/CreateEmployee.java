package com.swapnil.usercase;

import java.util.Scanner;

import com.swapnil.bean.Employee;
import com.swapnil.dao.EmployeeDao;
import com.swapnil.dao.EmployeeDaoImpl;
import com.swapnil.exeption.EmployeeException;

public class CreateEmployee {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the name");
		String name=sc.next();
		
		System.out.println("Enter the addresss");
		String ad=sc.next();
		
		System.out.println("Enter the salary");
		int sal=sc.nextInt();
		
		EmployeeDao emd=new EmployeeDaoImpl();
		Employee es=new Employee();
		es.setName(name);
		es.setSalary(sal);
		es.setAddress(ad);		
		try {
			Employee e = emd.registerEmployee(es);
			System.out.println(e);
		} catch (EmployeeException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		
		
		
		
		
	}

}
