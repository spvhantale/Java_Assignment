package com.problem4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<Student> s=new HashSet<>();
			s.add(new Student(10,"Ganesh",950));
			s.add(new Student(10,"Swapnil",1050));
			s.add(new Student(15,"Venkat",920));
			s.add(new Student(16,"Dinesh",410));
			s.add(new Student(18,"Srinu",880));
			System.out.println("Before filtering");
			s.forEach(sa->System.out.println(sa));
			Set<Student> x=s.stream().filter(p->p.getMarks()>500).collect(Collectors.toSet());
			System.out.println("After filtering");
			x.forEach(a->System.out.println(a));

	}

}
