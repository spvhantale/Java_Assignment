package com.swapnil;

public class Demo1 {
	public static void main(String[]args) {
		boolean fromNIT = true;
		Student1 b1=Student1.getStudent(fromNIT);
		System.out.println(b1.name);
		System.out.println(b1.roll);
		System.out.println(b1.collageName);
		System.out.println(b1.address);
		System.out.println("***********");
		fromNIT = false;
		Student1 b2=Student1.getStudent(fromNIT);
		System.out.println(b2.name);
		System.out.println(b2.roll);
		System.out.println(b2.collageName);
		System.out.println(b2.address);
	}
}