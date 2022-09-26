package com.swapnil;

public class Student {
	int roll;
	String name;
	int marks;
	void displayStudentDetails() {
		System.out.println("Roll is"+" "+roll);
		System.out.println("Name is"+" "+name);
		System.out.println("Marks is"+" "+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student swap=new Student();
		swap.name="swapnil";
		swap.roll=47;
		swap.marks=89;
		swap.displayStudentDetails();
		Student ranj=new Student();
		ranj.name="ranjit";
		ranj.roll=48;
		ranj.marks=92;
		ranj.displayStudentDetails();
		swap= null;
		ranj=null;
		
	}

}
