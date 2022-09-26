package com.swapnil;

import java.util.Scanner;

public class Array {
	
	void check(int[][] matrix) {
		
		int n=matrix.length;
		int m=matrix[0].length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<m;j++) {
				if(matrix[j][i]%2==0) {
					sum+=matrix[j][i];
				}	
			}
			System.out.println("Sum of even elements in column:- "+sum);
//			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No of Row ");
	int n=sc.nextInt();
	System.out.println("Enter No of Column ");
	int m=sc.nextInt();
	int[][] matrix=new int[n][m];
	for(int i=0;i<n;i++) {
		System.out.println("Enter the row Element");
		for(int j=0;j<m;j++) {
			System.out.println("Enter No of element");
			matrix[i][j]=sc.nextInt();
	}
	
}
	
	
	Array a=new Array();
	a.check(matrix);
//	for(int i=0;i<n;i++) {
//		for(int j=0;j<m;j++) {
//			System.out.print(matrix[i][j]);
//		}
//		System.out.println();
//	}
}
	
}
