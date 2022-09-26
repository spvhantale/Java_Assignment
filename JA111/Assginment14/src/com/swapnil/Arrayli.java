package com.swapnil;

import java.util.ArrayList;
import java.util.List;

public class Arrayli {

	private static final String Iterator = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<>();
		s.add("Swapnil");
		s.add("Vhantale");
		
//		iterator
		java.util.Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}

// for loop
	for(int i=0;i<s.size();i++) {
		System.out.println(s.get(i));
	}
//	enhanced loop
		
	for(String a:s) {
		System.out.println(a);
	}
}
}