package com.problem5;

import java.util.Scanner;

public class UserRegistration {
	
	String userName;
	String userCountry;
	
	public void registerUser(String userName, String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}else {
			
			InvalidCountryException ice=new InvalidCountryException("User Outside India cannot be registered");
			
			throw ice;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc.next();
		System.out.println("Enter the Country");
		String usercountry=sc.next();
		UserRegistration us=new UserRegistration();
		try {
			us.registerUser(username, usercountry);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Thank You!");
		}
	}
}
