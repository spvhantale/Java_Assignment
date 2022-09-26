package com.problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th=new Thread1();
		th.start();
		try {
			synchronized (th) {
				th.wait();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
