package com.swapnil.model;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.swapnil.util.EntiUtil;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student roll");
		int n=sc.nextInt();
		
	EntityManager	em=EntiUtil.connectEntity();
		
		Student s=em.find(Student.class,n);
	
		s.getCourseList().forEach(c->{
			
			
			System.out.println(c.getCourseId());
			System.out.println(c.getCourseName());
			System.out.println(c.getDuration());
			System.out.println(c.getFee());
			System.out.println("====================");
		});
		em.close();
	}
}
