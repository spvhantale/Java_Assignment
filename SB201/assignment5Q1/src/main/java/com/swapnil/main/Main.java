package com.swapnil.main;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.swapnil.entityUtil.EntUtil;
import com.swapnil.model.Address;
import com.swapnil.model.Customer;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em=EntUtil.installEntityMang();
		
		
		Customer c1=new Customer();
		
		c1.setName("swapnil");
		c1.setMobileNumber("88505070");
		c1.setEmail("swapnil@122");
		c1.getAddresses().add(new Address("maha", "lautr", "413520", "home"));
		c1.getAddresses().add(new Address("maha", "pune", "412105", "work"));
		c1.getAddresses().add(new Address("maha", "mumbai", "412505", "office"));
		
		em.getTransaction().begin();
		
		em.persist(c1);
		
		em.getTransaction().commit();
		
		em.close();
		
EntityManager em2=EntUtil.installEntityMang();
		
		
		Customer c2=new Customer();
		
		c2.setName("Vhantale");
		c2.setMobileNumber("88505070");
		c2.setEmail("vhantale@122");
		c2.getAddresses().add(new Address("maha", "amravati", "413520", "home"));
		c2.getAddresses().add(new Address("maha", "pune", "412105", "work"));
		c2.getAddresses().add(new Address("maha", "mumbai", "412505", "office"));
		
		em2.getTransaction().begin();
		
		em2.persist(c2);
		
		em2.getTransaction().commit();
		
		em2.close();
		
		EntityManager em3=EntUtil.installEntityMang();
		
		String jpql="from Customer";
		
		Query q=em3.createQuery(jpql);
		

		
		List<Customer> ls=q.getResultList();
		
		for(Customer s:ls) {
			List<Address> p=s.getAddresses();
			for ( Address a: p) {
				System.out.println(s.getCid()+" "+a);
			}
		}
		em3.close();
	}

}
