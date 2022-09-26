package com.swapnil;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	public PermanentEmployee(int employeeId,String employeeName,double basicPay) {
		super.setEmployeeId(employeeId);
		super.setEmployeeName(employeeName);
		this.basicPay=basicPay;
		
		this.calculateSalary();
		};

		
	
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double PFamount=(basicPay*0.12);
		double salary = (this.basicPay - PFamount);
		super.setSalary(salary);
	}

}
