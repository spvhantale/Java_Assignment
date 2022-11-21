package com.swapnil.userCase;

import java.util.Scanner;

import com.swapnil.dao.TrainingDao;
import com.swapnil.dao.TrainingDaoImpl;
import com.swapnil.model.Teacher;

public class RegisterTeacher {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the noYearOfExperince");
		int ny=sc.nextInt();
		System.out.println("Enter the email");
		String email=sc.next();
		
		
		Teacher t=new Teacher();
		t.setEmail(email);
		t.setNoYearOfExperience(ny);
		t.setTeacherName(name);
		
		TrainingDao td=new TrainingDaoImpl();
		td.registerTeacher(t);
		
		
		
	}
}
