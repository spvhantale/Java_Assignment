package com.swapnil;

import java.util.Objects;

public class Books{
	int bookid;
	String bookName;
	String bookAuthor;
	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookName, bookid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return  bookid == other.bookid;
	}
	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}

	
	
	
}
