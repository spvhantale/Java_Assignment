package com.swapnil;

public class Student1 {
	int roll;
	String name;
	String address;
	String collageName;
	public Student1(int roll, String name, String address,String collageName) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName=collageName;
	}
	public Student1(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName="NIT";
	}

	public static Student1 getStudent(boolean isFromNIT) {
		if(isFromNIT) {
			Student1 s1=new Student1(10,"Swapnil","latur");
			return s1;
	}else {
		Student1 s2=new Student1(12,"Hole","Latur","MIT");
		return s2;
	}
}
}
