package com.swapnil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student Article");
		Scanner sc=new Scanner(System.in);
		String letter=sc.nextLine();
		List<String> s=new ArrayList<>();
		int size=letter.length();
		for(int i=0;i<size;i++) {
			System.out.println(letter.charAt(i));
		}
		
	}

}
