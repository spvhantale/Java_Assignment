package com.problem3;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac=new Account();
		ac.accountNumber="102040111";
		ac.balance=500;
		ac.deposit(0);
		try {
			ac.withDraw(5000);
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
