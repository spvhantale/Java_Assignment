package com.problem1;

public class Employee {

	private int emId;
	private String emName;
	private int salary;
	
	
	public Employee(int emId, String emName, int salary) {
		super();
		this.emId = emId;
		this.emName = emName;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public int getEmId() {
		return emId;
	}
	public void setEmId(int emId) {
		this.emId = emId;
	}
	public String getEmName() {
		return emName;
	}
	public void setEmName(String emName) {
		this.emName = emName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emId=" + emId + ", emName=" + emName + ", salary=" + salary + "]";
	}
	
	
	
	
}
