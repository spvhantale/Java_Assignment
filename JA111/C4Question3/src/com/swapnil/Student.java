package com.swapnil;


import java.util.Objects;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private int mathMarks;
	private int scienceMarks;
	private int engMarks;
	
	
	public Student() {
		super();
	}


	public Student(int rollNo, String name, int mathMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathMarks = mathMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMathMarks() {
		return mathMarks;
	}


	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}


	public int getScienceMarks() {
		return scienceMarks;
	}


	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}


	public int getEngMarks() {
		return engMarks;
	}


	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}


	@Override
	public int hashCode() {
		return Objects.hash(engMarks, mathMarks, name, rollNo, scienceMarks);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return false;
	}

	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathMarks=" + mathMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		Student s1=this;
		Student s2=o;
		int totalMarks1=s1.getEngMarks()+s1.getMathMarks()+s1.getScienceMarks();
		int totalMarks2=s2.getEngMarks()+s2.getMathMarks()+s2.getScienceMarks();
		if(totalMarks1>totalMarks2) {
			return +1;
		}else if(totalMarks1<totalMarks2) {
			return -1;
		}else {
			return 0;
		
		}
	}

	
	
	
}
