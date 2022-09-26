package com.problem3;

import java.util.concurrent.Callable;

public class ProductCal implements Callable {

	int num;
	
	public ProductCal(int num) {
		super();
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int product=1;
		for(int i=1;i<=num;i++) {
			product=product*i;
		}
		return product;
	}

}
