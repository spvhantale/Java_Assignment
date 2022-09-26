package com.problem4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main {

	public static void printMap(Map<String,List<String>> hm){
	
//		return hm;
		Set<Map.Entry<String, List<String>>> value=hm.entrySet();
		List<Map.Entry<String, List<String>>> list=new LinkedList(value);
		
		Collections.reverse(list);
		
		for(Map.Entry<String, List<String>> aa:list) {
			System.out.println(aa.getKey()+"<=====>"+aa.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, List<String>> state= new HashMap<>();
		
		List<String> list1= new ArrayList<>();
		list1.add("Latur");
		list1.add("Jalna");
		list1.add("Pune");
		list1.add("Mumbai");
		state.put("Maharashtra", list1);
		List<String> list2= new ArrayList<>();
		list2.add("Latur");
		list2.add("Jalna");
		list2.add("Pune");
		list2.add("Mumbai");
		state.put("Karnataka", list2);
		List<String> list3= new ArrayList<>();
		list3.add("Latur");
		list3.add("Jalna");
		list3.add("Pune");
		list3.add("Mumbai");
		state.put("Punjab", list3);
		printMap(state);
	}
}
