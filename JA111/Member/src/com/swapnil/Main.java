package com.swapnil;

public class Main {
	
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Swapnil";
		e1.age=18;
		e1.phoneNumber="9960318010";
		e1.address="latur";
		e1.salary=50000;
		System.out.println("Name=>"+e1.name);
		System.out.println("Age=>"+e1.age);
		System.out.println("Phone Number =>"+e1.phoneNumber);
		System.out.println("Address =>"+e1.address);
		e1.printSalary();
		System.out.println("======================");
		Manager m1=new Manager();
		m1.name="Vhantale";
		m1.age=20;
		m1.phoneNumber="8329732688";
		m1.address="Pune";
		m1.salary=90000;
		System.out.println("Name=>"+e1.name);
		System.out.println("Age=>"+e1.age);
		System.out.println("Phone Number =>"+e1.phoneNumber);
		System.out.println("Address =>"+e1.address);
		m1.printSalary();
		System.out.println("======================");
		}
	
}
