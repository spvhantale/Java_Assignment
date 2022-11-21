package com.masai.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

	private Integer categoryID;
	
	
	@NotNull(message = "Category name can not be Null")
	@Size(min = 3 ,message = "Please Enter valid category")
	private String categoryName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Product product;
	
}
