package com.swapnil;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(10,"Swapnil",17,450);
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getMarks());
		Student s2=new Student();
		s2.setRoll(10);
		s2.setName("Swapnilvhantale");
		s2.setMarks(480);
		s2.setAge(18);
		System.out.println(s2.getRoll());
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getMarks());
		
	}

}
