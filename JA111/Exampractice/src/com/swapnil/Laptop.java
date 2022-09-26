package com.swapnil;

public class Laptop {
	private String color;
	private String companyName;
	private String name;
	private String purpose;
	private CPU cpu;
	private GraphicCard graphicCard;
	
	public Laptop() {
		
	}

	public Laptop(String color, String companyName, String name, String purpose, CPU cpu, GraphicCard graphicCard) {
		this.color = color;
		this.companyName = companyName;
		this.name = name;
		this.purpose = purpose;
		this.cpu = cpu;
		this.graphicCard = graphicCard;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public GraphicCard getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(GraphicCard graphicCard) {
		this.graphicCard = graphicCard;
	}
	void displayDetails() {
		System.out.println("Laptop Details");
		System.out.println("===================================");
		
		System.out.println("Laptop Name =>"+this.name);
		System.out.println("Laptop Company =>"+this.companyName);
		System.out.println("Laptop Color =>"+this.color);
		System.out.println("Laptop Purpose =>"+this.purpose);
		
		System.out.println("Cpu's Manufacturer =>"+cpu.getManufacturer());
		System.out.println("Cpu's Processor =>"+cpu.getProcessor());
		System.out.println("Cpu's Clockspeed =>"+cpu.getClockSpeed());
		
		System.out.println("Graphic card's Manufacturer =>"+graphicCard.getManufacturer());
		System.out.println("Graphic card's capacity =>"+graphicCard.getCapacity());
		System.out.println("Graphic card's series =>"+graphicCard.getSeries());
	}
}
