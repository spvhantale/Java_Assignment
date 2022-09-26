package com.swapnil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numberOfPassenger");
		int numberOfPassenger=sc.nextInt();
		System.out.println("Enter the numberOfKms");
		int numberOfKms=sc.nextInt();
		Ola myola=new Ola();
		Car mycar=myola.bookCar(numberOfPassenger, numberOfKms);
		int res=myola.calculateBill(mycar);
		System.out.println("The total fare amount is =>"+res);
	}

}
