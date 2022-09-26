package com.swapnil;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> p=new ArrayList<>();
	
	void addProduct(Product product) {
		boolean flag=true;
		for(Product s:p) {
			if(s.equals(product)) {
				flag=false;
				s.count+=product.count;
			}
		}
		if(flag) {
			p.add(product);
			System.out.println("Product added successfully");
		}else {
			System.out.println("Count updated Product already exists");
		}
	}
	public List<Product> showProduct(){
		return p;
	}
}
