package com.problem4;

public class Thread1 implements Runnable{


	@Override
	public void run() {
		int sum=0;
		for(int i=1;i<=20;i++) {
			sum+=i;
		}
		System.out.println("Total sum is "+Thread.currentThread().getName()+" "+sum);
	}

	
}
