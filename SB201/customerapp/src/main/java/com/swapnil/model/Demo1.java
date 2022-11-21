package com.swapnil.model;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.swapnil.util.EntiUtil;

public class Demo1 {

	
	public static void main(String[] args) {
		
	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		EntityManager	em=EntiUtil.connectEntity();
		Customer c=em.find(Customer.class, num);
		System.out.println(c);
	}
}
