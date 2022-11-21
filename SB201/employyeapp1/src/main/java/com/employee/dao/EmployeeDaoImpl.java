package com.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.employee.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
		
	EntityManager  em=emf.createEntityManager();
	

	EntityTransaction et= em.getTransaction();
	
	et.begin();
	
	em.persist(emp);
	
	et.commit();
	
	em.close();
		System.out.println("Employee details addded");
	}

	@Override
	public String getAddress(int empid) {
		// TODO Auto-generated method stub
		
		String address="employee not present";
		
	EntityManagerFactory	emf=Persistence.createEntityManagerFactory("empUnit");
		
	EntityManager em=emf.createEntityManager();
	
	Employee e=em.find(Employee.class, empid);
	
	if(e!=null) {
		address=e.getAddress();
	}
	em.close();
		return address;
	}

	@Override
	public String giveBonusToEmployee(int empid, int bonus) {
		// TODO Auto-generated method stub
		String s="employee not found";
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
	EntityManager	em=emf.createEntityManager();
		
	Employee e=em.find(Employee.class, empid);	
	
	if(e!=null) {
		EntityTransaction	et=em.getTransaction();
		et.begin();
		
		e.setSalary(e.getSalary()+bonus);
		
		et.commit();
		
		s="given the bonus";
		
		em.close();
		
	}

	return s;
	}

	@Override
	public boolean deleteEmployee(int empid) {
		
	EntityManagerFactory	emf=Persistence.createEntityManagerFactory("empUnit");
		
EntityManager	em=emf.createEntityManager();

Employee e=em.find(Employee.class, empid);

if(e!=null) {
	
EntityTransaction	et=em.getTransaction();
	
	et.begin();
	
	em.remove(e);
	
	et.commit();
	
	em.close();
	
	return true;
}		
		return false;
	}

}
