package com.problem4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two Number");
		
		try {
			String[] num=sc.nextLine().split(" ");
			int[] str=new int[num.length];
			for(int i=0;i<str.length;i++) {
				str[i]=Integer.parseInt(num[i]);
			}
			double que=(double)(str[0]/str[1]);
			
			System.out.println("The quotient of"+"="+que);
			
		} catch (ArithmeticException ae) {
			System.out.println("DivideByZeroException caught");
		}finally {
			System.out.println("Inside finally block");
		}
	}

}
