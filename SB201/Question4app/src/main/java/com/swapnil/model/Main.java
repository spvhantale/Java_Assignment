package com.swapnil.model;

import javax.persistence.EntityManager;

import com.swapnil.util.EntiUtil;

public class Main {

	
	public static void main(String[] args) {
	
	SalariedEmployee se1=new SalariedEmployee();
	se1.setEmpName("swa");
	se1.setEmail("s");
	se1.setSalary(500);
	SalariedEmployee se2=new SalariedEmployee();
	se2.setEmpName("sw");
	se2.setEmail("st");
	se2.setSalary(5000);
	SalariedEmployee se3=new SalariedEmployee();
	se3.setEmpName("a");
	se3.setEmail("sg");
	se3.setSalary(700);
	SalariedEmployee se4=new SalariedEmployee();
	se4.setEmpName("sk");
	se4.setEmail("shh");
	se4.setSalary(8700);
	
	ConractualEmployee ce1=new ConractualEmployee();
	ce1.setEmpName("sc");
	ce1.setMobileNumber("78000");
	ce1.setCostofperday(450);
	ce1.setNoOfWorkingDays(5);
	ConractualEmployee ce2=new ConractualEmployee();
	ce2.setEmpName("sg");
	ce2.setMobileNumber("789000");
	ce2.setCostofperday(470);
	ce2.setNoOfWorkingDays(4);
	ConractualEmployee ce3=new ConractualEmployee();
	ce3.setEmpName("scj");
	ce3.setMobileNumber("780007");
	ce3.setCostofperday(450);
	ce3.setNoOfWorkingDays(5);
	
	ConractualEmployee ce4=new ConractualEmployee();
	ce4.setEmpName("sch");
	ce4.setMobileNumber("78000");
	ce4.setCostofperday(488);
	ce4.setNoOfWorkingDays(54);
	
	
	EntityManager em=EntiUtil.connectEntity();
	
	em.getTransaction().begin();
	em.persist(se1);
	em.persist(se2);
	em.persist(se3);
	em.persist(se4);
	em.persist(ce1);
	em.persist(ce2);
	em.persist(ce3);
	em.persist(ce4);
	em.getTransaction().commit();
	em.close();
	
}
}
