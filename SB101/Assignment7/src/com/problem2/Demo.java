package com.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student> list=new ArrayList<>();

		list.add(new Student(10,"Ganesh",950));
		list.add(new Student(12,"Surya",1050));
		list.add(new Student(15,"Venkat",920));
		list.add(new Student(16,"Dinesh",410));
		list.add(new Student(18,"Srinu",880));
		
		
		
		Student maxStudent=list.stream().max((m1,m2)->m1.getMarks()>m2.getMarks() ? 1:-1).get();
		System.out.println(maxStudent);
	}

}
