package com.problem6;

public class Child extends Parent{

	public Child() throws Exception {
		super();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Parent ch=new Child();
			ch.fun1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
