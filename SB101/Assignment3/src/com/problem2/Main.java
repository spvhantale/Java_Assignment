package com.problem2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static int dateofage(LocalDate date) {
		LocalDate todaysDate=LocalDate.now();
		Period p=Period.between(date, todaysDate);
		int x=p.getYears();
		if(x>0) {
			return x;
		}else {
			return  (Integer) null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the date of birth in the format i.e dd/MM/yyyy");
			String da=sc.next();
			DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate d=LocalDate.parse(da, df);
			
			System.out.println((dateofage(d)));
			
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Enter before current date");
		}
	}

}
