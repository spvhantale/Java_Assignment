package com.swapnil;

import java.util.Scanner;

public class Age {

	public double calculatAge(int[]age) {
		int sum=0;
		int n=age.length;
		for(int i=0;i<n;i++) {
			sum+=age[i];
		}
		double average=(sum/n);
		return average;
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no.of employees");
		int num=sc.nextInt();
		while(num<2) {
			System.out.println("Please enter a valid employee count");
			num=sc.nextInt();
		}
		System.out.println("Enter the age for"+" "+num+" "+"employees");
		int[] age=new int[num];
		for(int i=0;i<num;i++) {
			int em=sc.nextInt();
			age[i]=em;
		}
		Age a=new Age();
		double res=a.calculatAge(age);
		System.out.println("The average age is=>"+res);
		
		
	}

}
