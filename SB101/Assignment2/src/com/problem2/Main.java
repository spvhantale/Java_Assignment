package com.problem2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, String> details=new TreeMap<>(new Studentmakrs());
		
		Student s1=new Student(101, "Swapnil", 480);
		Student s2=new Student(102, "Vhantale", 490);
		Student s3=new Student(102, "Kunal", 470);
		Student s4=new Student(102, "Hole", 390);
		details.put(s1, "Maharashtra");
		details.put(s2,"Punjab");
		details.put(s3,"Karnataka");
		details.put(s4, "UP");
		Set<Map.Entry<Student, String>> value=details.entrySet();
		for(Map.Entry<Student, String> me:value) {
			System.out.println(me.getKey()+"  "+me.getValue());
		}
	}

}
