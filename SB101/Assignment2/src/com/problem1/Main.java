package com.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	
	public static List<? extends Number> addlist(List<? extends Number> list) {
		List<Number> l=new ArrayList<>();
		
		for(Number aa:list) {
			l.add(aa);
		}
		
		return l;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ilist= Arrays.asList(10,20,30,40);
		List<Number> a=(List<Number>)addlist(ilist);
		for(Number ss:a) {
			System.out.println(ss);
		}
	}

}
