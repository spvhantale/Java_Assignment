package com.swapnil.userCase;

import java.util.Scanner;

import com.swapnil.dao.TrainingDao;
import com.swapnil.dao.TrainingDaoImpl;
import com.swapnil.exception.CourseException;
import com.swapnil.exception.TeacherException;

public class AssignTeacherWithCourse {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the teacher id");
		int tid=sc.nextInt();
		System.out.println("Enter the course id");
		int cid=sc.nextInt();
		
		
		TrainingDao td=new TrainingDaoImpl();
		
		try {
			td.assignTeacherWithCourse(tid, cid);
		} catch (TeacherException | CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
