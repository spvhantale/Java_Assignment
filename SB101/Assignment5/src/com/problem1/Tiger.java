package com.problem1;

public class Tiger extends Animal{

	public Tiger() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	void eat() throws AnimalException {
		// TODO Auto-generated method stub
		System.out.println("Tiger is eating !!");
	}
	
	public static void main(String[] args) {
		
		try {
			Animal a1=new Tiger();
			a1.eat();
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
