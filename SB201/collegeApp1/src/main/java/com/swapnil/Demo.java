package com.swapnil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext cfx=new ClassPathXmlApplicationContext("applicationContext.xml");	 
		
Collage c=cfx.getBean(Collage.class,"co");
c.showDetails();
	}

}
