package com.swapnil.model;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;



@Entity 
public class Employee extends Person{
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state",column = @Column(name="homestate")),
		@AttributeOverride(name = "city",column = @Column(name="homecity")),
		@AttributeOverride(name = "pincode",column = @Column(name="homepincode"))
	})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state",column = @Column(name="officestate")),
		@AttributeOverride(name = "city",column = @Column(name="officecity")),
		@AttributeOverride(name = "pincode",column = @Column(name="officepincode"))
	})
	private Address officeAddress;

	
	private int salary;
	
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(Address homeAddress, Address officeAddress, int salary) {
		super();
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
		this.salary = salary;
	}
	public Employee() {
		super();
	}

	
	
	
}
