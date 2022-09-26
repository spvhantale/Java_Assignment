package com.swapnil;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e1=new Engine(1000, 110, "tata", true);
		Car c1=new Car("Harrier", "Tata", "black", e1);
		System.out.println("Car Model:-"+c1.model);
		System.out.println("Car companyName:-"+c1.companyName);
		System.out.println("Car color:-"+c1.color);
		System.out.println("Car RPM:-"+c1.engine.getRmp());
		System.out.println("Car power:-"+c1.engine.getPower());
		System.out.println("Car Engine Manufacture:-"+c1.engine.getManufacturer());
		System.out.println("Car Has Turbo:-"+c1.engine.hasTurbo(true));
		
		
	}

}
