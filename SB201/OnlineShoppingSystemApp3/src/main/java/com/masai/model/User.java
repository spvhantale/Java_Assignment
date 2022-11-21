package com.masai.model;

import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class User {
	
	@Min(value = 3,message="User id should be greater than 3")
	private String userId;
	@Min(value=3,message="Password should be greater than 3")
	private String password;
	@Min(value = 3,message="Role length should be greater than 3")
	private String role;
	
}
