package com.swapnil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
	private String teacherName;
	private int noYearOfExperience;
	private String email;
	@ManyToOne
	private Course cours;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getNoYearOfExperience() {
		return noYearOfExperience;
	}
	public void setNoYearOfExperience(int noYearOfExperience) {
		this.noYearOfExperience = noYearOfExperience;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Course getCours() {
		return cours;
	}
	public void setCours(Course cours) {
		this.cours = cours;
	}
	public Teacher(int teacherId, String teacherName, int noYearOfExperience, String email, Course cours) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.noYearOfExperience = noYearOfExperience;
		this.email = email;
		this.cours = cours;
	}
	public Teacher() {
		super();
	}
	
	
	
}
