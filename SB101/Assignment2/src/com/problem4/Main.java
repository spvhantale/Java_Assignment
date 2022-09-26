package com.problem4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static Map<String, Student> sortbymarks(HashMap<String, Student> hm){
		
//		Set<Map.Entry<String,Student>> value=hm.entrySet();
//		List<Map.Entry<String, Student>> list=new LinkedList<>(value);
//		Collections.sort(list,new Comparator<Map.Entry<String, Student>>() {
//			public int compare(Map.Entry<String, Student> m1,Map.Entry<String, Student> m2) {
//				
//				if(m1.getValue().getStudentMarks()>m2.getValue().getStudentMarks()) {
//					return 1;
//				}else if(m1.getValue().getStudentMarks()<m2.getValue().getStudentMarks()) {
//					return -1;
//				}else {
//					return 0;
//				}
//		}
//			
//		});
//		
//		HashMap<String, Student> l=new LinkedHashMap<>();
//		for(Map.Entry<String, Student> aa:list) {
//			l.put(aa.getKey(), aa.getValue());
//		}
//		return l;
		return hm.entrySet().stream().sorted(Map.Entry.comparingByValue((s1,s2)-> s1.getStudentMarks()>s2.getStudentMarks()? 1:-1)).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(v1,v2)->v1,LinkedHashMap::new));	
				
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Student> hm=new HashMap<>();
		
		hm.put("Maharastra",new Student(10,"Ganesh",950));
		hm.put("Tamilnadu",new Student(12,"Surya",850));
		hm.put("Telangana",new Student(15,"Venkat",920));
		hm.put("Haryana",new Student(16,"Dinesh",910));
		hm.put("Kerla",new Student(18,"Srinu",880));
		
		sortbymarks(hm).entrySet().stream().forEach(s->System.out.println(s.getKey()+s.getValue()));
//			ss.entrySet().forEach(s->s1.);
//			ss.entrySet().stream().forEach(s-> System.out.println(s.getKey()+s.getValue()));
//		Set<Map.Entry<String, Student>> value=as.entrySet();
//		for(Map.Entry<String, Student> ss:value) {
//			System.out.println(ss.getKey()+"<===>"+ss.getValue());
//		}
		

	}

}
