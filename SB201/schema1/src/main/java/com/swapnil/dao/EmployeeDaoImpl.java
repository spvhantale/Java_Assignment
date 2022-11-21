package com.swapnil.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

//import com.mysql.cj.Query;
import com.swapnil.bean.Employee;
import com.swapnil.exeption.EmployeeException;
import com.swapnil.util.EntiUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
		Employee empl=null;
		
		EntityManager	em=EntiUtil.connectEntity();
	
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		EntityManager	em1=EntiUtil.connectEntity();
		String jpql="from Employee where name=:name and address=:add and salary=:sal";
	
		TypedQuery<Employee> emp=em1.createQuery(jpql,Employee.class);
		
		emp.setParameter("name", employee.getName());
		emp.setParameter("add", employee.getAddress());
		emp.setParameter("sal", employee.getSalary());

		empl=emp.getSingleResult();
		if(empl==null) {
			throw  new EmployeeException("technical issue");
		}else {
		return empl;
		}
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		
		Employee e=null;
	EntityManager em=EntiUtil.connectEntity();
		
		String jpql="from Employee where empid=:id";
		
		TypedQuery<Employee> tq=em.createQuery(jpql,Employee.class);
		
		tq.setParameter("id", empId);
		e=tq.getSingleResult();
		
		if(e==null) {
			throw new EmployeeException("User not available");
		}else {
			return e;
		}
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee e=null;
		
		
		EntityManager em=EntiUtil.connectEntity();
		
		String jpql="from Employee where empid=:id";

		TypedQuery<Employee> tq=em.createQuery(jpql,Employee.class);

		tq.setParameter("id", empId);
		e=tq.getSingleResult();

		String jpql1="delete from Employee where empid=:id";

		Query q= em.createQuery(jpql1);
		q.setParameter("id", empId);
		em.getTransaction().begin();
		int x=q.executeUpdate();
		em.getTransaction().commit();
		em.close();

	if(e==null && x==0) {
		throw new EmployeeException("User not available");
	}else {
		return e;
	}
	
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		
		Employee e=null;
		EntityManager em=EntiUtil.connectEntity();
			
			String jpql="from Employee where empid=:id";
			
			TypedQuery<Employee> tq=em.createQuery(jpql,Employee.class);
			
			tq.setParameter("id", employee.getEmpid());
			e=tq.getSingleResult();
		
		String jpql1="update Employee set name=:na,address=:ad,salary=:sal where empid=:id";
		
		Query q=em.createQuery(jpql1);
//		
		q.setParameter("na", employee.getName());
		q.setParameter("ad", employee.getAddress());
		q.setParameter("sal", employee.getSalary());
		q.setParameter("id", e.getEmpid());
	
		em.getTransaction().begin();
		int x=q.executeUpdate();
		em.getTransaction().commit();
//		
		em.close();
//		
//		
		if(x==0) {
			throw new EmployeeException("User not found");
		
		}else {
			EntityManager em1=EntiUtil.connectEntity();
//			
			String jpql2="from Employee where empid=:id";
//			
			TypedQuery<Employee> tq1=em1.createQuery(jpql2,Employee.class);
//			
			tq1.setParameter("id", employee.getEmpid());
			e=tq1.getSingleResult();
			return e;
		}
		
	}

}
