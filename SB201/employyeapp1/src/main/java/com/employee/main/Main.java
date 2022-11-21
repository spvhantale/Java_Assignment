package com.employee.main;

import java.util.Scanner;

import com.employee.bean.Employee;
import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean f=true;
		while(f) {
		
System.out.println("Please the option below"+"\n"+"1.Insert Employee"+"\n"+"2.Get employee address"+"\n"+"3.Give bonus to employee"+"\n"+"4.delete employee details"+"\n"+"5.exit");

Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
EmployeeDao emp=new EmployeeDaoImpl();
if(num==1) {
	System.out.println("Enter the Employee id");
	int empid=sc.nextInt();
	System.out.println("Enter the Employee name");
	String name=sc.next();
	System.out.println("Enter the employee address");
	String ad=sc.next();
	System.out.println("Enter the employee salary");
	int salary=sc.nextInt();
	Employee e=new Employee(empid, name, ad, salary);
	emp.save(e);
}else if(num==2) {
	
	System.out.println("Enter the employee id");
	
	int n=sc.nextInt();
	
	String ad=emp.getAddress(n);
	
	System.out.println(ad);
	
}else if(num==3) {
	System.out.println("Enter the employee id");
	int n=sc.nextInt();
	System.out.println("Enter the bonus");
	int bonus=sc.nextInt();
	
	String s=emp.giveBonusToEmployee(n, bonus);
	System.out.println(s);
}else if(num==4) {
	
	System.out.println("Enter the employee id");
	int n=sc.nextInt();
	
	boolean flag=emp.deleteEmployee(n);
	
	if(flag) 
		System.out.println("Employee details deleted");
	else
		System.out.println("Employee details not found");
		
}else {
	System.out.println("thank you");
	f=false;
	
}


		
		
		
		}	
		
	}
	

}
