package com.parent;

public class Parent {
	void method1() {
		System.out.println("Inside parent class of method1");
	}
	final void method2() {
		System.out.println("Inside of parent class of method2");
	}
	void method3() {
		System.out.println("Inside of parent class of method3");
	}
	final int number;
	Parent (int x){
		this.number=x;
	}
}
