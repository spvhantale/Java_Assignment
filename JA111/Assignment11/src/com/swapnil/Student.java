package com.swapnil;

public class Student {
	private int roll;
	private String name;
	private int mark;
	private char grade;
	
	public Student() {
		super();
	}

	public Student(int roll, String name, int mark, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.mark = mark;
		this.grade = grade;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", mark=" + mark + ", grade=" + grade + "]";
	}
	public void displayDetails(int roll,String name,int mark) {
		
		this.roll=roll;
		this.name=name;
		this.mark=mark;
		this.grade=this.calculateGrade(mark);
		
		System.out.println(this.toString());
		
	}

	private char calculateGrade(int mark) {
		if(mark>=500) {
			return 'A';
		}else if(mark<500 && mark>=400) {
			return 'B';
		}else if(mark<400) {
			return 'C';
		}
		else {
			return 'E';
		}
	}
}
