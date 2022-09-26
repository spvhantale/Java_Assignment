package com.problem3;

public class Account {

	String accountNumber;
	double balance;
	
	public void deposit(int amount) {
		balance=balance+amount;
		System.out.println("your amount is deposit in your account");
	}
	public double withDraw(int amount)throws InsufficientFundException {
		
		if(balance>amount) {
			balance=balance-amount;
			System.out.println("your amount is withdraw  "+amount);	
		}else {
			InsufficientFundException ife=new InsufficientFundException("Please Enter the proper amount "+amount);
			throw ife;
		}
		
		return balance;
		
	}
}
