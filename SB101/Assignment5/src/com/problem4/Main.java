package com.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=new ArrayList<>();
		ls.add("Pune");
		ls.add("Latur");
		ls.add("Mumbai");
		PrintList p=list->{
			for(String s:list) {
				System.out.println(s);
			}
		};
		p.display(ls);
	}

}
