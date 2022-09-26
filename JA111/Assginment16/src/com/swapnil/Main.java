package com.swapnil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Productpricecomapre pc=new Productpricecomapre();
//		List<Product> p=new ArrayList<>(pc);
		TreeSet<Product> p=new TreeSet<>(pc);
		for(int i=0;p.size()<4;i++) {
			System.out.println("User "+(i+1));
			System.out.println("Enter the productId ");
			int id=sc.nextInt();
			System.out.println("Enter the productName");
			String name=sc.next();
			System.out.println("Enter the productPrice");
			double price=sc.nextDouble();
			Product px=new Product(id, name, price);
			p.add(px);
			}
		System.out.println(p);
	}

}
