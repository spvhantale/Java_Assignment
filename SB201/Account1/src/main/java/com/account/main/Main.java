package com.account.main;

import java.util.Scanner;

import com.account.bean.Account;
import com.account.dao.AccountDao;
import com.account.dao.AccountDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean f=true;
		while(f) {
			
		
		System.out.println("Please select the following option"+"\n"+"1.Create account"+"\n"+"2.Find account details"+"\n"+"3.Delete account"+"\n"+"4.Withdraw money"+"\n"+"5.deposit amount"+"\n"+"6.Exit");
		
		int num=sc.nextInt();
		AccountDao ac= new AccountDaoImpl();
		switch(num) {
		
		
		case 1:
			
			System.out.println("Enter the account id");
			int id=sc.nextInt();
			System.out.println("Enter the email");
			String email=sc.next();
			System.out.println("Enter the address");
			String address=sc.next();
			System.out.println("Enter the amount");
			double balance=sc.nextDouble();
			Account a=new Account(id, email, address, balance);
			String s=ac.save(a);
			System.out.println(s);
			break;
		case 2:
			System.out.println("Enter the id");
			int i=sc.nextInt();
			Account af=ac.findById(i);
			
			System.out.println(af);
			break;
		case 3:
			System.out.println("Enter the id");
			int di=sc.nextInt();
			String ds=ac.deleteAccountById(di);
			System.out.println(ds);
			break;
		case 4:
			System.out.println("Enter the id");
			int wi=sc.nextInt();
			System.out.println("Enter the amount to withdraw");
			double b=sc.nextDouble();
			String ws=ac.withdraw(b, wi);
			System.out.println(ws);
			break;
		case 5:
			System.out.println("Enter the id");
			int dei=sc.nextInt();
			System.out.println("Enter the amount to deposit");
			double db=sc.nextDouble();
			String des=ac.deposit(db, dei);
			System.out.println(des);
	
			break;
	
		case 6:
			f=false;
			System.out.println("Thank you");
	
			break;
		}
	
	}
	}

}
