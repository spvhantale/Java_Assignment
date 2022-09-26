package com.problem2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		
		list.add("Jalna");
		list.add("Aurangabad");
		list.add("Latur");
		list.add("Mumbai");
		list.add("Nagpur");
		list.add("Pune");
		
		Collections.sort(list,(l1,l2)->l2.compareTo(l1));
		
		System.out.println(list);
	}

}
