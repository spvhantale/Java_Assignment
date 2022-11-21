package com.swapnil.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.swapnil.exception.CourseException;
import com.swapnil.exception.TeacherException;
import com.swapnil.model.Course;
import com.swapnil.model.Student;
import com.swapnil.model.Teacher;
import com.swapnil.util.EntiUtil;

public class TrainingDaoImpl implements TrainingDao{

	@Override
	public void addCourse(Course course) {
		
	EntityManager	em=EntiUtil.connectEntity();
	
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		em.close();
		System.out.println("Added course");
	}

	@Override
	public void registerStudent(Student student, int courseId) throws CourseException {
		// TODO Auto-generated method stub
		Course c=null;
		EntityManager	em=EntiUtil.connectEntity();
		c=em.find(Course.class, courseId);
		
		if(c==null) {
			throw new CourseException("Course not found");
		}else {
			c.getStudentList().add(student);
			student.getCourseList().add(c);
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
			em.close();
			System.out.println("Added student");
		}
		
	}

	@Override
	public void registerTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		EntityManager	em=EntiUtil.connectEntity();
		
		em.getTransaction().begin();
		em.persist(teacher);
		em.getTransaction().commit();
		em.close();
		System.out.println("Added teacher");
	}

	@Override
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException {
		// TODO Auto-generated method stub
		Course c=null;
		Teacher t=null;
		EntityManager	em=EntiUtil.connectEntity();
		c=em.find(Course.class, courseId);
		t=em.find(Teacher.class,teacherId);
		if(c==null) {
			throw new CourseException("Course not found");
		}else if(t==null) {
			throw new TeacherException("Teacher not found");
		}else {
			c.getTeacherList().add(t);
			t.setCours(c);
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
			em.close();
			System.out.println("Assgin the teacher");
		}
		
	}

	@Override
	public List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException {
		List<Student> list=new ArrayList<>();
		
		EntityManager	em=EntiUtil.connectEntity();
		
		String jpql="from Course where courseName=:name";
		
		TypedQuery<Course> q=em.createQuery(jpql,Course.class);
		
		q.setParameter("name", courseName);
		
		list=q.getSingleResult().getStudentList();
		if(list.size()==0) {
			throw new CourseException("Student are not present");
		}else {
			
		}
		return list;
	}

}
