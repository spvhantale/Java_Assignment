package com.swapnil.userCase;

import java.util.Scanner;

import com.swapnil.dao.TrainingDao;
import com.swapnil.dao.TrainingDaoImpl;
import com.swapnil.exception.CourseException;
import com.swapnil.model.Student;

public class RegisterStudent {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the student name");
		String name=sc.next();
		System.out.println("Enter the email");
		String email=sc.next();
		System.out.println("Enter the mobile");
		String mobile=sc.next();
		
		Student s=new Student();
		s.setName(name);
		s.setEmail(email);
		s.setMobile(mobile);
		System.out.println("Enter the couse id");
		int cid=sc.nextInt();
		TrainingDao td=new TrainingDaoImpl();
		try {
			td.registerStudent(s, cid);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
