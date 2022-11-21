package com.swapnil.demo;

import java.util.List;

import javax.persistence.EntityManager;

import com.swapnil.util.EntiUtil;

public class Demo {

	
	public static void main(String[] args) {
		
		EntityManager em=EntiUtil.connectEntity();
		
		Department d= em.find(Department.class, 1);
		
//		System.out.println(d);
		
		List<Employee> emps= d.getEmps();
//		
		emps.forEach(e ->{
			
			System.out.println(e.getEmpId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			
		});
			
		System.out.println("done...");
		
		
	}
}
