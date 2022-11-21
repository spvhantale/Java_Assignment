package com.swapnil;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AnnotationConfigApplicationContext	cfx=new AnnotationConfigApplicationContext(Appconfiguration.class);
		StudentService s=cfx.getBean("studentService",StudentService.class);
		s.printMap();
		s.printList();
		s.printAppName();
	
	}

}
