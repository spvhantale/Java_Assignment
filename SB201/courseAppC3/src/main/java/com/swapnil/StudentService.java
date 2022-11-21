package com.swapnil;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("AppName.properties")
public class StudentService {
	@Autowired(required = false)
	private Map<Student, Course> theMap;
	@Autowired(required = false)
	private List<Student> theList;
	@Value("${appname}")
	private String appName;
	
	
	public void printMap() {
		for(Map.Entry<Student, Course> sp:theMap.entrySet()) {
			System.out.println(sp.getKey()+"=========="+sp.getValue());
		}
	}
	
	public void printList(){
		
		Collections.sort(theList,(s1,s2)->{
			return s1.getMarks()>s2.getMarks() ? 1:-1;
		});
		for(Student s:theList) {
			System.out.println(s);
		}
	}
	
	public void printAppName(){
		
		System.out.println(appName);
		
		}

}
