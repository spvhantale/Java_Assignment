package com.swapnil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Library {

	List<Book> booklist=new ArrayList<>();
	void addBook(Book book) {
		booklist.add(book);
	}
	boolean isEmpty() {
		if(booklist.size()==0) {
			return true;
		}else {
			return false;
		}
	}
	List<Book> viewAllBooks(){
		return booklist;
	}
	List<Book> viewBooksByAuthor(String author){
		List<Book> b=new ArrayList<>();
		for(Book a:booklist) {
			if(a.getAuthor().equals(author)) {
				b.add(a);
			}
		}
		return b;
	}
	
	int countNoOfBook(String bookName) {
		int count=0;
		for(Book a:booklist) {
			if(a.getBookName().equals(bookName)) {
				count++;
			}
		}
		return count;
	}
}
