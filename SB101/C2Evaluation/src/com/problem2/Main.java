package com.problem2;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Student> p= s->s.getMarks()<500;
		System.out.println(p.test(new Student(14,"sw",480)));
		
		Consumer<Student> c=s->{
			System.out.println("roll:"+s.getRoll());
			System.out.println("name:"+s.getName());
			System.out.println("marks:"+s.getMarks());
		};
		c.accept(new Student(14,"swpnil",470));
		
		Supplier<Student> s=()->new Student(14,"swpnil",470);
		System.out.println(s.get());
		
		Function<String, Integer> f=str->Integer.parseInt(str);
		System.out.println("10");
	}

}
