package com.problem3;

public class Odd implements Runnable{
	Thread t;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println("Odd Number"+i);
			}
		}
	}
	public Odd(Thread t) {
		this.t = t;
		
	}
	

	
	
}
