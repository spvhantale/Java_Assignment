package com.swapnil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolyee e1=new Empolyee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int numid=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		System.out.println("Enter the percentage");
		int perce=sc.nextInt();
		e1.setEmployeeId(numid);
		e1.setEmployeeName(name);
		e1.setSalary(salary);
		e1.calculateNetSalary(perce);
		System.out.println("Id:"+e1.getEmployeeId());
		System.out.println("Name:"+e1.getEmployeeName());
		System.out.println("Salay:"+e1.getSalary());
		System.out.println("Netsalay:"+e1.getNetSalary());
	}

}
