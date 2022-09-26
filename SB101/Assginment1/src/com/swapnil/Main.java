package com.swapnil;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Product> que=new PriorityQueue<>(new Productprice());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of product");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("ProductDetails"+" "+(i+1));
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the product Name");
			String name=sc.next();
			System.out.println("Enter the price");
			int price=sc.nextInt();
			Product p=new Product(id, name, price);
			que.offer(p);
		}
		Iterator<Product> itr=que.iterator(); 
		while(itr.hasNext()) {
			Product p=itr.next();
			System.out.println(p);
		}
	}
}
