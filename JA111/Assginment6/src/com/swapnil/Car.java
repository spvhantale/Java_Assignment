package com.swapnil;

public class Car {
	String model;
	String companyName;
	String color;
	Engine engine;
	Car(){
		
	}
	public Car(String model, String companyName, String color, Engine engine) {
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = engine;
	}
	
}
