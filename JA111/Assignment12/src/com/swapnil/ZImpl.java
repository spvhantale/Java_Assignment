package com.swapnil;

public class ZImpl implements Z{

	@Override
	public void funXA() {
		// TODO Auto-generated method stub
		System.out.println("Inside the funXA of abscract method");
	}

	@Override
	public void funYA() {
		// TODO Auto-generated method stub
		System.out.println("Inside the funYA of abscract method");
	}

	@Override
	public void funZA() {
		// TODO Auto-generated method stub
		System.out.println("Inside the funZA of abscract method");
	}

	@Override
	public void funXB() {
		System.out.println("Inside the ZImpl of function XB that override default method");
	}

	
}
