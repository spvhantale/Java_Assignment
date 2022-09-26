package com.problem3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		System.out.println("Before Square the value");
		list.forEach(s->System.out.println(s));
		List<Double>ls=list.stream().map(s->{
			return Math.pow(s, 2);
		}).collect(Collectors.toList());
		System.out.println("After square the value");
		ls.forEach(s->System.out.println(s));
	}

}
