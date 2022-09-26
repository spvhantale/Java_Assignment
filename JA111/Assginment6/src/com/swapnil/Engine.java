package com.swapnil;

public class Engine {
	private int rmp;
	private int Power;
	private String manufacturer;
	private boolean hasTurbo;
	
	
	
	public Engine() {
		
	}
	public Engine(int rmp, int power, String manufacturer, boolean hasTurbo) {
		this.rmp = rmp;
		Power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
	}



	public int getRmp() {
		return rmp;
	}
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public int getPower() {
		return Power;
	}
	public void setPower(int power) {
		Power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public boolean isHasTurbo() {
		return hasTurbo;
	}
	public void setHasTurbo(boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}
	boolean hasTurbo(boolean hasTurbo) {
		return true;
	}
	
}
