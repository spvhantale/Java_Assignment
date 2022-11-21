package com.swapnil.model;

import javax.persistence.EntityManager;

import com.swapnil.util.EntiUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	EntityManager	em=EntiUtil.connectEntity();
		
		Customer c1=new Customer();
		
		c1.setName("swapnil");
		c1.setMobileNumber("895828888");
		c1.setEmail("sw@gmail.com");
		c1.getAdlist().add(new Address("Maha", "Latur", "413520"));
		c1.getAdlist().add(new Address("Maha","Pune","412105"));
		
		Customer c2=new Customer();
		
		c2.setName("vhantale");
		c2.setMobileNumber("895828888");
		c2.setEmail("vh@gmail.com");
		c2.getAdlist().add(new Address("Maha", "Am", "413520"));
		c2.getAdlist().add(new Address("Maha","ssss","412105"));
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();
		em.close();
		System.out.println("Done...................");
	}

}
