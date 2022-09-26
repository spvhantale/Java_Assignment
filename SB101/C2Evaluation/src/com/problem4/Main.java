package com.problem4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("swapnila","vhantale","prabhakar","jadhav","handea","kunals","ranjit","nirmal","Shilpa","Aditya");
		System.out.println("Orignal List");
		System.out.println(list);
	List<String>finallist=list.stream().filter(s->(s.length()%2==0)).sorted((s1,s2)->s2.compareTo(s1)).map(s->s.toUpperCase()).collect(Collectors.toList());
	
//	Collections.sort(finallist, (s1,s2)->s2.compareTo(s1));
	System.out.println("Sorted List");
		System.out.println(finallist);
	}

}
