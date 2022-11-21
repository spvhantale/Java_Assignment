package com.swapnil.main;




import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;


import com.swapnil.model.College;
import com.swapnil.model.Student;
import com.swapnil.util.EntiUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("select the option "+"\n"+"1.Insert the details"+"\n"+"2.get student details based on collegeid"+"\n"+"3.get college based on studentroll");	
			int num=sc.nextInt();
			
			
		if(num==1) {	
			
		EntityManager em=EntiUtil.connectEntity();
		Student s1=new Student();
		s1.setStudentName("swapnil");
		s1.setEmail("s@gmail.com");
		s1.setMobileNumber("7895045");
		
		Student s2=new Student();
		s2.setStudentName("vhantale");
		s2.setEmail("v@gmail.com");
		s2.setMobileNumber("8555555");
		Student s3=new Student();
		s3.setStudentName("ranjit");
		s3.setEmail("r@gmail.com");
		s3.setMobileNumber("9555555");
		Student s4=new Student();
		s4.setStudentName("sawant");
		s4.setEmail("s@gmail.com");
		s4.setMobileNumber("78555555");
		College c1=new College();
		c1.setCollegeName("MIT");
		c1.setCollegeAddress("Alandi");
	
		
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		c1.getStudents().add(s3);
		c1.getStudents().add(s4);

		
		s1.setClg(c1);
		s2.setClg(c1);
		s3.setClg(c1);
		s4.setClg(c1);
		
		Student s11=new Student();
		s11.setStudentName("Kunal");
		s11.setEmail("k@gmail.com");
		s11.setMobileNumber("99895045");
	//	
		Student s12=new Student();
		s12.setStudentName("Hole");
		s12.setEmail("h@gmail.com");
		s12.setMobileNumber("8555555");
		Student s13=new Student();
		s13.setStudentName("hande");
		s13.setEmail("h@gmail.com");
		s13.setMobileNumber("97555555");
		Student s14=new Student();
		s14.setStudentName("ssss");
		s14.setEmail("sss@gmail.com");
		s14.setMobileNumber("878555555");
		College c11=new College();
		c11.setCollegeName("VIT");
		c11.setCollegeAddress("Pune");
	
		c11.getStudents().add(s11);
		c11.getStudents().add(s12);
		c11.getStudents().add(s13);
		c11.getStudents().add(s14);

		s11.setClg(c11);
		s12.setClg(c11);
		s13.setClg(c11);
		s14.setClg(c11);
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c11);
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Done.................");
		
		}else if(num==2) {
			
			System.out.println("Enter the college id");
			int n=sc.nextInt();
			EntityManager	em1=EntiUtil.connectEntity();
			
			College c=em1.find(College.class, n);
			
		List<Student> s=c.getStudents();
	System.out.println();
		s.forEach(s1->{
			System.out.println(s1.getStudentRoll());
			System.out.println(s1.getStudentName());
			System.out.println(s1.getEmail());
			System.out.println(s1.getMobileNumber());
			System.out.println(c.getCollegeName());
			System.out.println(c.getCollegeAddress());
			System.out.println("======================");
		});
		
	}else if(num==3) {
		System.out.println("Enter the student roll number");
		
		int nm=sc.nextInt();
		EntityManager em=EntiUtil.connectEntity();
		
		
		Student s=em.find(Student.class, nm);
		
		System.out.println(s.getStudentName());
		System.out.println(s.getMobileNumber());
		System.out.println(s.getClg().getCollegeId());
		System.out.println(s.getClg().getCollegeName());
		System.out.println(s.getClg().getCollegeAddress());
		
		
	
		
	}
	}
}
