package com.bank;

public class Bank {
	
	private Bank() {
		System.out.println("Inside private constructor of Bank");
	}
	public static Bank getObject() {
		Bank b=new Bank();
		return b;
	}
}
