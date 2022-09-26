package com.swapnil;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> b=new ArrayList<>();
	public void booksCollection(Book o) {
		boolean flag=true;
		
		for(Book bo:b) {
			if(bo.equals(o)) {
				flag=false;
			}
		}
		if(flag) {
			b.add(o);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library l=new Library();
		
		
		l.booksCollection(new Book(1,"Name1","Author1"));
		l.booksCollection(new Book(2,"Name2","Author2"));
		l.booksCollection(new Book(3,"Name1","Author1"));
		l.booksCollection(new Book(1,"Name1","Author1"));
		l.booksCollection(new Book(1,"Name2","Author1"));
		l.booksCollection(new Book(4,"Name1","Author1"));
		for(Book s:l.b) {
			System.out.println(s);
		}
	}
}

