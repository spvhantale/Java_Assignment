package com.swapnil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of student");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter the Roll Number");
			int roll=sc.nextInt();
			System.out.println("Enter the Name");
			String name=sc.next();
			System.out.println("Enter the Marks");
			int marks=sc.nextInt();
			Student s1=new Student(roll,name,marks);
			System.out.println("Roll:-"+s1.getRollNumber());
			System.out.println("Name:-"+s1.getStudentName());
			System.out.println("Marks:-"+s1.getMarks());
			System.out.println("===============");
		}

	}

}
