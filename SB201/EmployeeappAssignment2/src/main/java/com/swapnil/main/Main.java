package com.swapnil.main;

import javax.persistence.EntityManager;

import com.swapnil.model.Address;
import com.swapnil.model.Employee;
import com.swapnil.model.Person;
import com.swapnil.util.EntiUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	EntityManager em=EntiUtil.connectEntity();
		Employee e1=new Employee();
		e1.setName("swapnil");
		e1.setSalary(45000);
		e1.setHomeAddress(new Address("maha", "l", "4500"));
		e1.setOfficeAddress(new Address("maha", "p", "4555"));

		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		em.close();
		System.out.println("Done");
	}

}
