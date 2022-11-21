package com.swapnil.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntiUtil {

	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("schemaUnit");
	}
	
	public static EntityManager connectEntity() {
		
		
		return emf.createEntityManager();
	}
	
}
