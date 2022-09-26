package com.swapnil;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			double loan =((employeeObj.getSalary()*15)/100);
			return loan;
		}else if(employeeObj instanceof TemporaryEmployee) {
			double loan =((employeeObj.getSalary()*10)/100);
			return loan;
		}else {
			return 0.0;
		}
	}
}
