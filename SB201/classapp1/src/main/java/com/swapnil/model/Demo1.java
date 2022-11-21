package com.swapnil.model;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.swapnil.util.EntiUtil;

public class Demo1 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the courseid");
		int n=sc.nextInt();
	EntityManager	em=EntiUtil.connectEntity();
		
		Course c=em.find(Course.class, n);
	
		c.getStudentList().forEach(s->{
			
			System.out.println(s.getRoll());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getMobile());
			System.out.println("=======================");
		});
	
	
	
	}
}
