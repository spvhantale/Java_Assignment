package com.swapnil.model;

import javax.persistence.EntityManager;

import com.swapnil.util.EntiUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	EntityManager	em=EntiUtil.connectEntity();
	
	Student s1=new Student();
	s1.setName("swapnil");
	s1.setEmail("s@gmail.com");
	s1.setMobile("88855500");

	Student s2=new Student();
	s2.setName("vhantale");
	s2.setEmail("v@gmail.com");
	s2.setMobile("98855500");
	
	Course c1=new Course();
	c1.setCourseName("Java");
	c1.setDuration("6 Month");
	c1.setFee(45000);
	
	c1.getStudentList().add(s1);
	
	Course c2=new Course();
	c2.setCourseName("JS");
	c2.setDuration("4 Month");
	c2.setFee(25000);
	c2.getStudentList().add(s2);
	c2.getStudentList().add(s1);
	
	s1.getCourseList().add(c1);
	s1.getCourseList().add(c2);
	s2.getCourseList().add(c2);
	
	em.getTransaction().begin();
	em.persist(c1);
	em.persist(c2);
	em.getTransaction().commit();
	em.close();
		System.out.println("Done");
		
	}

}
