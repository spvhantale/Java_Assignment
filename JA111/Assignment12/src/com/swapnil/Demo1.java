package com.swapnil;

import java.util.Scanner;

public class Demo1 {

	public Hotel provideFood(int amount) {
		if(amount>=1000) {
			return new TajHotel();
		}else if (amount>200 && amount<1000){
			return new RoadSideHotel();
		}else {
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt=sc.nextInt();
		Hotel h1=d1.provideFood(amt);
		if(h1 instanceof TajHotel) {
			TajHotel t1=(TajHotel)h1;
			t1.chickenBiryani();
			t1.masalaDosa();
			t1.welcomeDrink();
		}else if(h1 instanceof RoadSideHotel) {
			RoadSideHotel r1=(RoadSideHotel)h1;
			r1.chickenBiryani();
			r1.masalaDosa();
		}else {
			System.out.println("Enter correct amount");
		}
	}

}
