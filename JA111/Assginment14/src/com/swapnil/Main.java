package com.swapnil;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library l1=new Library();
		while(true) {
		System.out.println("1.Add Book\r\n"
				+ "2.Display all book details\r\n"
				+ "3.Search Book by author\r\n"
				+ "4.Count number of books - by book name\r\n"
				+ "5.Exit\r\n"
				+ "");
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("Enter the isbn");
			int isbn=sc.nextInt();
			System.out.println("Enter the BookName");
			String name=sc.next();
			System.out.println("Enter the Author");
			String author=sc.next();
			Book b1=new Book(isbn, name, author);
			l1.addBook(b1);
		}else if(num==2) {
			List<Book> b=l1.viewAllBooks();
			System.out.println(b);
		}else if(num==3) {
			System.out.println("Enter the author");
			String author=sc.next();
			List<Book> ls=l1.viewBooksByAuthor(author);
			System.out.println(ls);
		}else if(num==4) {
			System.out.println("Enter the bookName");
			String book=sc.next();
			int count=l1.countNoOfBook(book);
			System.out.println(count);
		}else if(num==5){
			break;
		}
		}
	}
}
