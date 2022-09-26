package com.problem2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		1.Predicate Method
////		Normal 
//		Predicate<Student> s1=new MyPredicate();
//		boolean x=s1.test(new Student(120,"Swapnil", 580));
//		System.out.println(x);
////		Lambda 
//	Predicate<Student> p=(Student s)->{
//		if(s.getMarks()>500) {
//			return true;
//		}
//		return false;
//	};
//	
//	boolean b=p.test(new Student(120,"swapnil",480));
//	System.out.println(b);
//	
//	// Shortcut lambda
//	
//	Predicate<Student> s2=s-> s.getMarks()>500 ? true:false;
//	boolean a=s2.test(new Student(123,"swapnil",580));
//	System.out.println(a);
//	
////	2.Supplier
//	
//	Supplier<Student> s5=new MySupplier();
//	Student z=s5.get();
//System.out.println(z);
//
////Lambda
//Supplier<Student> s6=()->{
//	return new Student(50, "z", 800);
//};
//Student w=s6.get();
//System.out.println(w);
//
////shortcut
//Supplier<Student> s7=()->new Student(50, "z", 800);
//Student r=s7.get();
//System.out.println(r);
////3.Consumer
////Normal
//Consumer<Student> s8=new MyConsumer();
//s8.accept(new Student(50, "Swapnil", 800));
////Lambda
//Consumer<Student> s9=(s)->{
//	System.out.println(s);
//};
//s9.accept(r);
//List<Student> list=Arrays.asList(new Student(50,"swapnil",850),new Student(70,"swapnil",850),new Student(80,"swapnil",950));
//
//list.forEach(s->System.out.println(s));
		
//4.Function
		
//		Function<Student, String> f1=new MyFunction();
//		System.out.println(f1.apply(new Student(12,"swapnil",865)));
//		
////		Lambda
//		Function<Student, String> f2=s->s.getMarks()>500 ? "pass":"fail";
//		System.out.println(f2.apply(new Student(12,"swapnil",865)));
	}
	

}
