package com.swapnil.dao;

import java.util.List;

import com.swapnil.exception.CourseException;
import com.swapnil.exception.TeacherException;
import com.swapnil.model.Course;
import com.swapnil.model.Student;
import com.swapnil.model.Teacher;

public interface TrainingDao {

	public void addCourse(Course course);
	
	public void registerStudent(Student student,int courseId)throws CourseException;
	
	public void registerTeacher(Teacher teacher);
	
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException;
	
	public List<Student> getAlltheStudentsByCourseName(String courseName)throws CourseException;

}
