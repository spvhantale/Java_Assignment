package com.swapnil;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Test t1=new Test();
		int[]p=t1.display(num);
//		System.out.println(p);
		int l=p.length;
		String s="";
		for(int i=0;i<l;i++) {
			if(p[i]==0) {
				continue;
			}else {
				s+=p[i]+" ";
				
			}
		}
		System.out.println("Prime Numbers are=>"+s);
	}

}
