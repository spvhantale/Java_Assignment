package com.problem2;

import java.util.function.Function;

public class MyFunction implements Function<Student, String>{

	@Override
	public String apply(Student s) {
		if(s.getMarks()>500) {
			return "Pass";
		}else {
			return "fail";
		}
		
	}

}
