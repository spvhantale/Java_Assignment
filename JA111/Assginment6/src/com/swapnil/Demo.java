package com.swapnil;

public class Demo {
	
	Demo(){
		System.out.println("Inside of Demo()");
	}
	Demo(String s){
		System.out.println("Inside of Demo(String S)");
		System.out.println(s);
	}
	Demo(int i){
		System.out.println("Inside of Demo(int i)");
		System.out.println(i);
	}
	Demo(float f){
		System.out.println("Inside of Demo(float f)");
		System.out.println(f);
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo("Swapnil");
		Demo d3=new Demo(10);
		Demo d4=new Demo(40.5f);
		

	}

}
