package com.swapnil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main1 {
	
	HashSet<Books> s=new LinkedHashSet();
	Set<Member> mem=new TreeSet<>(new Datedes());
	public void addbooks(Object b) {
		
		boolean flag=true;
		if(b instanceof Books) {
			b=(Books)b;
		for(Books bo:s) {
			if(bo.equals(b)) {
				flag=false;
			}
		}
		if(flag==true) {
			s.add((Books) b);
		}
	}else if(b instanceof Member) {
		b=(Member)b;
	for(Member bo:mem) {
		if(bo.equals(b)) {
			flag=false;
		}
	}
	if(flag==true) {
		mem.add((Member) b);
	}
}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1 m=new Main1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the option"+"\n"+"1.Book"+"\n"+"2.Member");
		int a=sc.nextInt();
		if(a==1) {
		System.out.println("Enter the Number of Books");
		int num=sc.nextInt();
		for(int i=0;m.s.size()<num;i++) {
			System.out.println("BookDetails"+" "+(i+1));
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the Book Name");
			String name=sc.next();
			System.out.println("Enter the Book Author");
			String author=sc.next();
			Books p=new Books();
			p.bookid=id;
			p.bookName=name;
			p.bookAuthor=author;
			
			m.addbooks(p);
		}
		Iterator<Books> itr=m.s.iterator(); 
		while(itr.hasNext()) {
			Books p=itr.next();
			System.out.println(p);
		}
	}else if(a==2) {
		System.out.println("Enter the Number of Member");
		int num=sc.nextInt();
		for(int i=0;m.mem.size()<num;i++) {
			System.out.println("MemberDetails"+" "+(i+1));
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the Name");
			String name=sc.next();
			System.out.println("Enter the  MembershipNumber");
			int memNum=sc.nextInt();
			System.out.println("Enter the Membership end date");
			String da=sc.next();
			DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date=LocalDate.parse(da,dt);
			Member p=new Member(id, name, memNum, date);
			m.addbooks(p);
		}
		Iterator<Member> itr=m.mem.iterator(); 
		while(itr.hasNext()) {
			Member p=itr.next();
			System.out.println(p);
		}
	}
	}
	
	}


