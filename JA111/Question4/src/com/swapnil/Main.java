package com.swapnil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		
		System.out.println("Enter the Position");
		int p=sc.nextInt();
		int x=str.length();
		while(p>=x) {
			System.out.println("Invalid position Enter the Position =>");
			p=sc.nextInt();
		}
			for(int i=0;i<x;i++) {
				if(p==i) {
					System.out.println("Character at the position"+" "+i+" "+str.charAt(i));
				}
			}
		}
	}


