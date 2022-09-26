package com.problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

	
	static List<Book> list=new ArrayList();
	
	public void addBook(Book book) throws BookException {
		boolean flag=true;
		for(Book a:list) {
		if(a.equals(book)) {
			flag=false;
		}
	}if(flag==false) {
		BookException b=new BookException("Book is already exist.");
		throw b;
	}else {
		list.add(book);
		System.out.println("Book added Successfully");
	}
	}
	public List<Book> viewAllBooks() throws BookException{
		
		
		if(list.size()==0) {
			BookException b=new BookException("Book list is empty");
			throw b;
		}else {
			return list;
		}
	}
	
	public List<Book> viewBooksByAuthor(String author)throws BookException{
		boolean flag=false;
		for(Book a:list) {
			if(a.getAuthor().equals(author)) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			return list.stream().filter(s->s.getAuthor().equals(author)).collect(Collectors.toList());
		}else {
			BookException b=new BookException("None of the book published by the author"+author);
			throw b;
		}
	}
	public Book getBookByISBN(int isbn)throws BookException{
		for(Book a:list) {
			if(a.getIsbn()==isbn) {
				return a;
			}
		}
	BookException b=new BookException("isbn is not present in list");
			throw b;
		
	}
}
