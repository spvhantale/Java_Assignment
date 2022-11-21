package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	@Min(value = 3,message = "product Name should be greater than 3")
	private String productName;
	@Min(value = 1,message = "product price should be greater than 0")
	private double price;
	@Min(value = 3,message = "product color should be greater than 3")
	private String color;
	@Min(value = 3,message = "product dimension should be greater than 3")
	private String dimension;
	@Min(value = 3,message = "product specification should be greater than 3")
	private String specification;
	@Min(value = 3,message = "product manufacturer should be greater than 3")
	private String manufacturer;
	@Min(value = 1,message = "product quantity should be greater than 0")
	private int qunatity;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	
	

}
