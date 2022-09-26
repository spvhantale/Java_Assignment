package com.swapnil;

import java.util.Scanner;

public class Main {
	public static Laptop getLaptop(String laptopPurpose){
		
		if(laptopPurpose.equals("gaming")) {
			CPU c1=new CPU("Radeon","Ryzen 9 5800H",3200.0);
			GraphicCard g1=new GraphicCard("Radeon", "RTX 3050 Ti", "16GB");
			Laptop l1=new Laptop("Black","Radeon", "Acer", "gaming", c1,g1 );
			return l1;
		}else if(laptopPurpose.equals("business")) {
			CPU c1=new CPU("Intel", "i5 10210U", 1800.0);
			GraphicCard g1=new GraphicCard("Intel", "Iris Xe", "Integrated");
			Laptop l1=new Laptop("Rose Gold","HP", "Aero 13", "business", c1,g1 );
			return l1;
		}else {
			return null;
		}
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purpose");
		String purpose=sc.next();
		
		if(purpose.equals("gaming")) {
			Laptop gamingLaptop=getLaptop("gaming");
			gamingLaptop.displayDetails();
		}else if(purpose.equals("business")) {
			Laptop businessLaptop=getLaptop("business");
			businessLaptop.displayDetails();
		}else {
			System.out.println("Enter Proper input");
		}
		
	}

}
