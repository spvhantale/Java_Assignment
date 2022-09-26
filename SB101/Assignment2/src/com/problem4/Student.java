package com.problem4;

public class Student {
	
	private int studentid;
	private String studentName;
	private int studentMarks;
	
	
	public int getStudentid() {
		return studentid;
	}


	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getStudentMarks() {
		return studentMarks;
	}


	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}


	public Student(int studentid, String studentName, int studentMarks) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}


	public Student() {
		super();
	}


	@Override
	public String toString() {
		return "Stundent [studentid=" + studentid + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
	
}
