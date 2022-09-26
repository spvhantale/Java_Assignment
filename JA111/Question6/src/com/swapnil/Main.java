package com.swapnil;

import java.util.Scanner;

public class Main {
	
	public static double getStudent(int choice) {
		double y=0.0;
		Scanner sc=new Scanner(System.in);
		if(choice==1) {
			ArtStudent a1=new ArtStudent();
			System.out.println("Enter the Hindi Marks =>");
			int hin=sc.nextInt();
			a1.setHindiMarks(hin);
			System.out.println("Enter the History Marks =>");
			int his=sc.nextInt();
			a1.setHistoryMarks(his);
			System.out.println("Enter the English Marks =>");
			int eng=sc.nextInt();
			a1.setEnglishMarks(eng);
			y=a1.findPercentage();
			return y;
		}else if(choice==2) {
			ScienceStudent s1=new ScienceStudent();
			System.out.println("Enter the Physics Marks =>");
			int ph=sc.nextInt();
			s1.setPhysicsMarks(ph);;
			System.out.println("Enter the Math Marks =>");
			int math=sc.nextInt();
			s1.setMathsMarks(math);;
			System.out.println("Enter the Chemistry Marks =>");
			int chem=sc.nextInt();
			s1.setChemistryMarks(chem);
			System.out.println("Enter the Biology Marks =>");
			int bio=sc.nextInt();
			s1.setBiologyMarks(bio);
			y=s1.findPercentage();
			return y;
		}else if(choice==3) {
			CommerceStudent c1=new CommerceStudent();
			System.out.println("Enter the Economic Marks =>");
			int ec=sc.nextInt();
			c1.setEconomicsMarks(ec);;;
			System.out.println("Enter the Business Marks =>");
			int bus=sc.nextInt();
			c1.setBusinessStudiesMarks(bus);
			System.out.println("Enter the Account Marks =>");
			int acc=sc.nextInt();
			c1.setAccountMarks(acc);
			y=c1.findPercentage();
			return y;
		}else {
		return y;
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Which Student percentage do you want to find:\r\n"
			+ "1. ArtStudent\r\n"
			+ "2. ScienceStudent\r\n"
			+ "3. CommerceStudent");
	int num=sc.nextInt();
	double z=getStudent(num);
	System.out.println("Percentage is"+" "+z);
}
}
