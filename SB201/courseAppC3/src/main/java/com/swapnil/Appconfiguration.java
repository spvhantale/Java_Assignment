package com.swapnil;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.swapnil")
public class Appconfiguration {
	@Bean(name="theMap")
	public Map<Student,Course> getMap(){
		Map<Student,Course> map=new HashMap<>();
		map.put(new Student(101, "Swapnil", "Latur", "a@gmail.com", 450), new Course(1, "Java", "5month", 4500));
		map.put(new Student(102, "Vhantale", "Pune", "a@gmail.com", 750), new Course(3, "DSA", "5month", 7500));
		map.put(new Student(103, "Ranjit", "Jalna", "a@gmail.com", 650), new Course(2, "Coding", "5month", 8500));
		
		return map;
	}
	@Bean(name = "theList")
	public List<Student> getList(){
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(101, "Swapnil", "Latur", "a@gmail.com", 950));
		list.add(new Student(102, "Vhantale", "Mumbai", "a@gmail.com", 750));
		list.add(new Student(103, "Ranjit", "La", "a@gmail.com", 450));
		list.add(new Student(104, "Sawant", "ur", "a@gmail.com", 650));
		list.add(new Student(105, "Kunal", "Ltur", "a@gmail.com", 850));
		return list;
	}
	
}
