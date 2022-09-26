package com.problem7;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadA a=new ThreadA();
		
		Thread a1=new Thread(a);
		Thread a2=new Thread(a);
		a1.setName("Dhoni");
		a2.setName("Kohli");
		a1.setPriority(8);
		a2.setPriority(10);
		a1.start();
		a2.start();
	}

}
