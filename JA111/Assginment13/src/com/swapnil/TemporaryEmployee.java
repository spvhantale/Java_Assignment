package com.swapnil;

public class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double salary=this.hourlyWages*this.hoursWorked;
		super.setSalary(salary);
	}

	public TemporaryEmployee() {
		
	}

	public TemporaryEmployee(int employeeId,String employeeName,int hoursWorked, int hourlyWages) {
		super();
		super.setEmployeeId(employeeId);
		super.setEmployeeName(employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
		this.calculateSalary();
	}

	
}
