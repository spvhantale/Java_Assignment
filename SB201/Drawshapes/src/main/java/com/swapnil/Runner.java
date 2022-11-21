package com.swapnil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext	cfx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	Shape s=cfx.getBean("s",Shape.class);
		s.print();
		
	}

}
