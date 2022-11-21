package com.masai.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	
	@Size(min = 3, message = "Street no. should min of 3 Characters")
	private String streetNo;
	
	private String buildingName;
	
	@NotNull(message = "City cannot be null.")
	private String city;
	
	@NotNull(message = "State cannot be null.")
	private String state;
	
	@NotNull(message = "Country cannot be null.")
	private String country;
	
	@Size(min = 6, max = 6, message = "Pincode Enter a valid Pincode ")
	private String pincode;
	
	
	

	
	
}
