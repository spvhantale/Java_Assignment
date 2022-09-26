package com.problem2;

import java.util.function.Supplier;

public class MySupplier implements Supplier<Student>{

	@Override
	public Student get() {
		// TODO Auto-generated method stub
		Student s1=new Student(50, "swapnil", 470);
		return s1;
	}

}
