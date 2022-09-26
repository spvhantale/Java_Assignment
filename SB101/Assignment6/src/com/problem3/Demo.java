package com.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Demo {

	public Map<String, Student> sortMapUsingStudentName(Map<String, Student>
	originalMap){
		
		List<Map.Entry<String, Student>> list=new ArrayList<>(originalMap.entrySet());
		
		Collections.sort(list,(s1,s2)->s2.getValue().getName().compareTo(s1.getValue().getName()));
		Map<String, Student> x=new LinkedHashMap();
		for(Map.Entry<String, Student> a:list) {
			x.put(a.getKey(), a.getValue());
		}
		
		return x;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Student> m1=new HashMap<>();
		m1.put("India",new Student(1, "swapnil", 450));
		m1.put("America",new Student(2, "vhantale", 750));
		m1.put("UnitedKingdom",new Student(3, "ranjit", 950));
		m1.put("Srilanka",new Student(4, "sawant", 650));
		m1.put("Pakistan",new Student(5, "yash", 1050));
//		System.out.println(m1);
		Demo d1=new Demo();
		Map<String,Student>m2=d1.sortMapUsingStudentName(m1);
		
		List<Map.Entry<String, Student>> ls=new ArrayList<>(m2.entrySet());
		
		ls.forEach(s->System.out.println(s.getKey()+"====="+s.getValue()));
		
	}

}
