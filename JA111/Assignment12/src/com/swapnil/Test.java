package com.swapnil;

public class Test implements Intr{

	@Override
	public int[] display(int p) {
		// TODO Auto-generated method stub
		int[] arr=new int[p];
		int line=0;
		for(int i=2;i<=p;i++) {
			if(Test.isprime(i)==true) {
				arr[line]=i;
				line++;
			};
		}
		return arr;
	}
	static boolean isprime(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
