package com.problem3;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void doTransaction(List<? extends Payment> list) {
		
		for(Payment aa:list) {
			aa.doPayment();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CardPayment> l1=new ArrayList<>();
		CardPayment c1=new CardPayment();
c1.setAmount(7000);
l1.add(c1);
CardPayment c2=new CardPayment();
c2.setAmount(8000);
		l1.add(c2);
		List<CashPayment> l2=new ArrayList<>();
		CashPayment ca1=new CashPayment();
ca1.setAmount(7000);
CashPayment ca2=new CashPayment();
ca2.setAmount(8000);
l2.add(ca2);
		l2.add(ca2);
		doTransaction(l2);
		doTransaction(l1);
		
		
	}

}
