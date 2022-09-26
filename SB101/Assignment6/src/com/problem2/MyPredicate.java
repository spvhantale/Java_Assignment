package com.problem2;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Student>{

	
	@Override
	public boolean test(Student s) {
		// TODO Auto-generated method stub
		if(s.getMarks()==580) {
			return true;
		}
		return false;
	}

}
