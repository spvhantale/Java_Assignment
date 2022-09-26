package com.swapnil;

import java.util.Scanner;

public class Main {
	public static String reversString(String input){
		//write the logic
		
		String str=input;
		char ch[]=str.toCharArray();
		String str1="";
		for(int i=ch.length-1;i>=0;i--) {
			str1+=ch[i];
		}
		return str1;
		}
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		String result = reversString(originalString);
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		}
}
