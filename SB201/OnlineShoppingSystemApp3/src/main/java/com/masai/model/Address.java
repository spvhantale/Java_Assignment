package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	@Min(value = 1 ,message = "Minimum length of street Number should be 1")
	private String streetNo;
	@Min(value = 3 ,message = "Minimum length of building name should be 3")
	private String buildingName;
	@Min(value = 3 ,message = "Minimum length of city should be 3")
	private String city;
	@Min(value = 3 ,message = "Minimum length of state should be 3")
	private String state;
	@Min(value = 3 ,message = "Minimum length of country should be 3")
	private String country;
	@Size(min=6 ,max = 6 ,message = "pincode size should be 6 digit")
	private String pincode;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
	
}
