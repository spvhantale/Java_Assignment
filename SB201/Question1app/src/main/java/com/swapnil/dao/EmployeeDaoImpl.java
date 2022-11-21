package com.swapnil.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.swapnil.exception.DepartmentException;
import com.swapnil.exception.EmployeeException;
import com.swapnil.model.Department;
import com.swapnil.model.Employee;
import com.swapnil.util.EntiUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addDepartment(Department dept) {
		// TODO Auto-generated method stub
		
	EntityManager	em=EntiUtil.connectEntity();
	
	em.getTransaction().begin();
	em.persist(dept);
	em.getTransaction().commit();
	em.close();
	System.out.println("Done");
	
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		EntityManager	em=EntiUtil.connectEntity();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Done");
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
	
		Department d=null;
		Employee e=null;
	EntityManager	em=EntiUtil.connectEntity();
	d=em.find(Department.class, deptId);
	e=em.find(Employee.class, empId);
	if(d==null) {
		throw new DepartmentException("Department id wrong");
	}else if(e==null) {
		throw new EmployeeException("Employee id not found");
	}else {
		
		d.getEmplist().add(e);
		e.setDept(d);
		
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		
		System.out.println("Done the assign");
	}
	
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		List<Employee> lis=new ArrayList<>();
		Department d=null;
	EntityManager	em=EntiUtil.connectEntity();
	String jpql="from Department where deptName=:name";
	
TypedQuery<Department>	q=em.createQuery(jpql,Department.class);
		q.setParameter("name", deptName);
		d=q.getSingleResult();


		lis=d.getEmplist();
		if(lis.size()==0) {
			throw new EmployeeException("there is no employee in "+deptName);
		}else {
			return lis;
		}
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		Department d=null;
		
		EntityManager	em=EntiUtil.connectEntity();
		
		Employee e=em.find(Employee.class, empId);
		
		d=e.getDept();
		if(d==null) {
			throw new DepartmentException("Employee not found in dept");
		}else {
			return d;
		}
		
	}

}
