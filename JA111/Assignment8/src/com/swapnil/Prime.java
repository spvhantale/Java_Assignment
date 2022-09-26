package com.swapnil;

public class Prime {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		int[] arr1=inputArray;
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			int count=0;
			for(int j=1;j<=arr1[i];j++) {
				if(arr1[i]%j==0) {
					count++;
				}
			}
			if(count<=2) {
				arr2[i]=arr1[i];
			}
		}
		return arr2;
		}
		public static void main(String[] args){
		
			Prime p1=new Prime();
		int[] arr = {10,12,4,50,12,14,15};
		int[] s=p1.findAndReturnPrimeNumbers(arr);
		for(int i:s) {
			if(i!=0) {
				System.out.println(i);	
			}
		}
		int count1=0;
		for(int i:s) {
			if(i==0) {
				count1++;
			}
		}
		if(count1==s.length) {
			System.out.println("Prime number not found in the supplied Array");
		}
		}
}
