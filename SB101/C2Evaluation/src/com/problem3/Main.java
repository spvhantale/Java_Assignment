package com.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<>();
		list.add(new Student(101, "swapnil", 950, "latur"));
		list.add(new Student(102, "swapnil", 550, "aurangabad"));
		list.add(new Student(103, "swapnil", 650, "pune"));
		list.add(new Student(104, "swapnil", 750, "jalna"));
		list.add(new Student(105, "swapnil", 450, "mumbai"));
		List<Employee> elist=list.stream().filter(s->s.getMarks()>500).map(s->{
			Employee ec=new Employee(s.getRoll(), s.getName(), s.getMarks()*1000, s.getAddress());
			return ec;
		}).collect(Collectors.toList());
		System.out.println("Student Details");
		list.forEach(s->{
			System.out.println("Student Roll: "+s.getRoll());
			System.out.println("Student Name: "+s.getName());
			System.out.println("Student Marks: "+s.getMarks());
			System.out.println("Student Address: "+s.getAddress());
		});
		System.out.println("========================================");
		System.out.println("Employee Details");
		elist.forEach(s->{
			System.out.println("Employee Id: "+s.getEmpId());
			System.out.println("Employee Name: "+s.getName());
			System.out.println("Employee Salary: "+s.getSalary());
			System.out.println("Employee Address: "+s.getAddress());
		});
		System.out.println("========================================");
	}

}
