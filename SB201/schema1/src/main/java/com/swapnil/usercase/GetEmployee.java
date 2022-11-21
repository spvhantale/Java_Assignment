package com.swapnil.usercase;

import java.util.Scanner;

import com.swapnil.bean.Employee;
import com.swapnil.dao.EmployeeDao;
import com.swapnil.dao.EmployeeDaoImpl;
import com.swapnil.exeption.EmployeeException;

public class GetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		EmployeeDao emd=new EmployeeDaoImpl();
		
		
	try {
		Employee e=emd.getEmployeeById(id);
		
		System.out.println(e);
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
		
		
	}

}
