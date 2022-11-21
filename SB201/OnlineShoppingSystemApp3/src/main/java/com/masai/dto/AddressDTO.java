package com.masai.dto;




import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {
	
	
	private String streetNo;
	
	private String buildingName;
	
	
	private String city;
	
	
	private String state;
	
	
	private String country;
	
	private String pincode;

}
