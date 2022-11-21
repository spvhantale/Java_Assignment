package com.swapnil.entityUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntUtil {

	private static  EntityManagerFactory emf;
	
	
	static {
		
		emf=Persistence.createEntityManagerFactory("assignment5Unit");
	}
	
	public static EntityManager installEntityMang() {
		
		
		return emf.createEntityManager();
		
	}
}
