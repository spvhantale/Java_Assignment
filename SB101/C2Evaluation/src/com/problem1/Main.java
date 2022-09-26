package com.problem1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean exit=true; 
		while(exit==true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add Book\r\n"
				+ "2.Display all book details\r\n"
				+ "3.Search Book by author\r\n"
				+ "4.Search book by ISBN\r\n"
				+ "5.Exit");
		
		Library l=new Library();
		int num=sc.nextInt();
		if(num==5) {
			exit=false;
			System.out.println("Thank You !");
		}
		
			
			if(num==1) {
				System.out.println("Enter the isbn");
				int isbn=sc.nextInt();
				System.out.println("Enter the book Name");
				String book=sc.next();
				System.out.println("Enter the Auther Name");
				String auther=sc.next();
				Book b=new Book(isbn,book ,auther);
				try {
					l.addBook(b);
				} catch (BookException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
			}else if(num==2) {
				try {
					l.viewAllBooks().forEach(s->{
						
						System.out.println("Isbn is: "+s.getIsbn());
						System.out.println("Auther is: "+s.getAuthor());
						System.out.println("Book Name is: "+s.getBookName());
						System.out.println("===================================");
					});
				} catch (BookException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}else if(num==3) {
				System.out.println("Enter the auther");
				String s=sc.next();
				try {
					l.viewBooksByAuthor(s).forEach(p->{
						
						System.out.println("Isbn is: "+p.getIsbn());
						System.out.println("Auther is: "+p.getAuthor());
						System.out.println("Book Name is: "+p.getBookName());
						System.out.println("===================================");
					}
					);
				} catch (BookException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}else if(num==4) {
				System.out.println("Enter the isbn");
				int i=sc.nextInt();
				
				try {
					Book x= l.getBookByISBN(i);
					System.out.println("Isbn is: "+x.getIsbn());
					System.out.println("Auther is: "+x.getAuthor());
					System.out.println("Book Name is: "+x.getBookName());
					System.out.println("===================================");
					
				} catch (BookException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
			}
		}
		
		
	}
	
}
