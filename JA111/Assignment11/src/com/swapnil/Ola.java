package com.swapnil;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h1=new HatchBack();
			h1.setNumberOfKms(numberOfKMs);
			h1.setNumberOfPassenger(numberOfPassenger);
			return h1;
		}else {
			Sedan s1=new Sedan();
			s1.setNumberOfKms(numberOfKMs);
			s1.setNumberOfPassenger(numberOfPassenger);
			return s1;
		}
	}
	public int calculateBill(Car car) {
		int numberOfKms=car.getNumberOfKms();
		int farePerKm;
		if(car instanceof Sedan) {
			Sedan s=(Sedan)car;
			farePerKm=s.farePerKm;
		}else {
			HatchBack h=(HatchBack)car;
			farePerKm=h.farePerKm;
		}
		int total=(numberOfKms*farePerKm);
		return total;
	}

}
