package com.problem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> ls=new ArrayList<>();

		ls.add(new Product(101, "Swapnil", 2, 400));
		ls.add(new Product(104, "Vhantale", 9, 900));
		ls.add(new Product(105, "Ranjit", 10, 500));
		ls.add(new Product(102, "Sawant", 5, 300));
		ls.add(new Product(103, "Kunal", 7, 200));
		
		Collections.sort(ls,(p1,p2)->p1.getPrice()>p2.getPrice()?-1:1);
		System.out.println(ls);
	}

}
