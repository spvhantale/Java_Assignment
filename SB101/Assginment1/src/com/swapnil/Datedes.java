package com.swapnil;

import java.util.Comparator;

public class Datedes implements Comparator<Member>{

	@Override
	public int compare(Member m1, Member m2) {
		// TODO Auto-generated method stub
		return m1.getDate().compareTo(m2.getDate());
	}
}
