package com.swapnil;

public class CommerceStudent implements Student{
	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;
	
	public CommerceStudent() {
		
	}

	public CommerceStudent(int accountMarks, int economicsMarks, int businessStudiesMarks) {
		super();
		this.accountMarks = accountMarks;
		this.economicsMarks = economicsMarks;
		this.businessStudiesMarks = businessStudiesMarks;
	}

	public int getAccountMarks() {
		return accountMarks;
	}

	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}

	public int getEconomicsMarks() {
		return economicsMarks;
	}

	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}

	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}

	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		int sum=(this.economicsMarks+this.businessStudiesMarks+this.accountMarks);
		int n=3;
		double percentage=(double)((sum/n));
		return percentage;
	}
	
	
}
