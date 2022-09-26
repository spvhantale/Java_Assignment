package com.problem2;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student s) {
		// TODO Auto-generated method stub
		if(s.getMarks()>500) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}

}
