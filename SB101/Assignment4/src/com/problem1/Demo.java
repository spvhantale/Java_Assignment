package com.problem1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		try {
			System.out.println("Enter the number");
			String str=sc.next();
			int num=Integer.parseInt(str);
			int square=num*num;
			System.out.println("The square value is"+square);
			
			
		}catch(NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
		System.out.println("The work has been done successfully");
	}

}
