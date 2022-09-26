package com.swapnil;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> s=new ArrayList<>();
		s.add(new Student(101, "Swapnil", 70, 80, 90));
		s.add(new Student(102, "Swapnil", 80, 80, 90));
		s.add(new Student(103, "Vhantale", 70, 80, 90));
		s.add(new Student(104, "Swapnil", 80, 80, 90));
		
		for(Student a:s) {
			System.out.println(a);
		}
	}

}
