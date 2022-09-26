package com.swapnil;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter , How many Student ?");
		int num=sc.nextInt();
		Student[] s1=new Student[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter the roll number");
			int roll=sc.nextInt();
			System.out.println("Enter the Name");
			String name=sc.next();
			System.out.println("Enter the address");
			String address=sc.next();
			System.out.println("Enter the marks");
			int marks=sc.nextInt();
			System.out.println("==========");
			s1[i]=new Student(roll,name,address,marks);
		}
		int x=s1.length;
		int total=0;
		for(int i=0;i<x;i++) {
			System.out.println("Name:-"+s1[i].getName());
			System.out.println("Roll:-"+s1[i].getRoll());
			System.out.println("Address:-"+s1[i].getAddress());
			System.out.println("Marks:-"+s1[i].getMarks());
			System.out.println("==========");
			total+=s1[i].getMarks();
		}
		
		System.out.println("Total Average marks of students:-"+(total/2));
	}

}
