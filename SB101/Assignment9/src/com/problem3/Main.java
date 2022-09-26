package com.problem3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Even e1=new Even();
		Thread t1=new Thread(e1);
		Odd o1=new Odd(t1);
		
		
		Thread t2=new Thread(o1);
		
		t1.start();
		t2.start();
	}

}
