package com.swapnil.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.swapnil.util.EntiUtil;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EntityManager	em=EntiUtil.connectEntity();
	String jpql="from SalariedEmployee";
	
	TypedQuery<SalariedEmployee>sal=em.createQuery(jpql,SalariedEmployee.class);
	
List<SalariedEmployee>	s=sal.getResultList();
	s.forEach(sp->{
		System.out.println("id "+sp.getEmpid());
		System.out.println("name "+sp.getEmpName());
		System.out.println("email "+sp.getEmail());
		System.out.println("sal "+sp.getSalary());
		System.out.println("==========");
	});

	
	
	}

}
