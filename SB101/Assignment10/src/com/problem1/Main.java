package com.problem1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheradA th=new TheradA();
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
