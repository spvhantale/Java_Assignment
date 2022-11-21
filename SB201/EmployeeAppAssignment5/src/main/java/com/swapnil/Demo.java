package com.swapnil;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	private Map<Department, Employee> theMap;
	
	

	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	public void myInit(){
		System.out.println("inside myInit method");
		}

	public void cleanUp(){
		System.out.println("inside cleanUp method");
	}
	
	public void showDetails(){
		System.out.println("inside showDetails of Demo class");
		
		 for(Map.Entry<Department, Employee> imp:theMap.entrySet()) {
			 
			 System.out.println(imp.getKey()+"=============="+imp.getValue());
			 
		 }
		
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext	cfx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	Demo	d=cfx.getBean("did",Demo.class);
	
	d.showDetails();
	
	ClassPathXmlApplicationContext cfx1=(ClassPathXmlApplicationContext)cfx;
	cfx1.close();
	}

}
