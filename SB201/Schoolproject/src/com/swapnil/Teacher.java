package com.swapnil;

public class Teacher implements Person{

	
	public void teaches(){
		 System.out.println("Teacher teaches");
		}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		teaches();
	}
}
