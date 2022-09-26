package com.parent;

import java.util.Scanner;

public final class Child extends Parent{
	
	Child(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	void method1() {
		System.out.println("Number is:-"+super.number);
	}
	void method4() {
		System.out.println("Inside of method 4 of class child");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num>=0 && num<=10) {
			Parent c1=new Child(num);
			c1.method1();
			c1.method2();
			c1.method3();
			Child d1=(Child)c1;
			d1.method4();
		}else {
			System.out.println("Number is invalid");
		}
		
		
	}
}
