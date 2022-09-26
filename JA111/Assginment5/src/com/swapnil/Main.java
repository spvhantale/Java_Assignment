package com.swapnil;

public class Main {
	
	public static void main(String[] args) {
		boolean isSnowing = true;
		boolean isRaining = true;
		double temperature = 60.0;
		if(isSnowing==false && isRaining==false && temperature>50) {
			System.out.println("Let’s go out!");
		}else {
			System.out.println("Let’s stay home.");
		}
	}
}
