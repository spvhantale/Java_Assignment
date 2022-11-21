package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	@Min(value = 3 ,message = "Minimum length of firstName should be 3")
	private String firstName;
	@Min(value = 3 ,message = "Minimum length of lastName should be 3")
	private String lastName;
	@Size(min=10,max=10,message="mobile number length should be 10")
	private String mobileNumber;
	@Email(message = "Enter the proper mail")
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses=new ArrayList<>();
	
	

}
