package com.swapnil.userCase;

import java.util.List;
import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;

import com.swapnil.dao.TrainingDao;
import com.swapnil.dao.TrainingDaoImpl;
import com.swapnil.exception.CourseException;
import com.swapnil.model.Course;
import com.swapnil.model.Student;

public class GetAlltheStudentsByCourseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the course name");
		String name=sc.next();
		
		TrainingDao td=new TrainingDaoImpl();
		try {
			List<Student> s=td.getAlltheStudentsByCourseName(name);
			s.forEach(s1->{
				System.out.println("roll "+s1.getRoll());
				System.out.println("email "+s1.getEmail());
				System.out.println("mobile "+s1.getMobile());
				System.out.println("======================");
			});
		
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
