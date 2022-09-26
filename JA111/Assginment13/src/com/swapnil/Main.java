package com.swapnil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l=new Loan();
		double loan=l.calculateLoanAmount(new PermanentEmployee(1, "Swapnil", 1000));
		System.out.println(loan);
		loan=l.calculateLoanAmount(new TemporaryEmployee(2, "vhantale", 20, 100));
		System.out.println(loan);
	}

}
