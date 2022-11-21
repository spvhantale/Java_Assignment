package com.swapnil.userCase;

import java.util.Scanner;

import com.swapnil.dao.TrainingDao;
import com.swapnil.dao.TrainingDaoImpl;
import com.swapnil.model.Course;

public class AddCourseuserCase {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the duration");
		String dur=sc.next();
		System.out.println("Enter the fee");
		int fee=sc.nextInt();
		Course c=new Course();
		c.setCourseName(name);
		c.setDuration(dur);
		c.setFee(fee);
		TrainingDao td=new TrainingDaoImpl();
		td.addCourse(c);
	}
}
