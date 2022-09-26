package com.swapnil;

public class FuelCar implements Vehicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Fuel Car is running");
	}
	public void service() {
		System.out.println("Car needs service");
	}

}
