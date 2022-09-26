package com.problem7;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<25;i++) {
			System.out.println("Inside the thread a "+i);
			System.out.println("Inside the thread a "+Thread.currentThread().getName());
		}
	}

}
