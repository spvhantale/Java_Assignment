package com.problem3;

public class CardPayment implements Payment {

	private int amount;
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment done by using Card"+amount);
	}

}
