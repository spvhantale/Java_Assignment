package com.problem4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		Thread3 th3=new Thread3();

		Thread t1=new Thread(th1,"Dhoni");
		Thread t2=new Thread(th2,"Rohit");
		Thread t3=new Thread(th3,"Kohli");
		t1.setPriority(10);
		t2.setPriority(8);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
