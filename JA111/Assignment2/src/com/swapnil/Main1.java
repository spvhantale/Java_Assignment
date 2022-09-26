package com.swapnil;

public class Main1 {

	public static void prime(int n) {
		for(int i=2;i<n;i++) {
			while(n%i==0) {
				System.out.println(i);
				n=(int)(n/i);
			}
		}
		if(n>2) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		prime(10);

	}

}
