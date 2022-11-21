package com.swapnil.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.swapnil.util.EntiUtil;

public class Demo2 {

	public static void main(String[] args) {
		
		EntityManager	em=EntiUtil.connectEntity();
		String jpql="from ConractualEmployee";
		
		TypedQuery<ConractualEmployee>sal=em.createQuery(jpql,ConractualEmployee.class);
		
	List<ConractualEmployee>	s=sal.getResultList();
		s.forEach(sp->{
			System.out.println("id "+sp.getEmpid());
			System.out.println("name "+sp.getEmpName());
			System.out.println("cost "+sp.getCostofperday());
			System.out.println("mobile "+sp.getMobileNumber());
			System.out.println("day "+sp.getNoOfWorkingDays());
			System.out.println("==========");
		});
		
	}
}
