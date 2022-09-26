package com.problem1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
	
	Set<Map.Entry<Employee, String>> value=originalMap.entrySet();
	List<Map.Entry<Employee, String>> l=new LinkedList<>(value);
	
Collections.sort(l,new Comparator<Map.Entry<Employee, String>>() {
	public int compare(Map.Entry<Employee, String>m1,Map.Entry<Employee, String> m2) {
		if(m1.getKey().getSalary()>m2.getKey().getSalary()) {
			return 1;
		}else if(m1.getKey().getSalary()<m2.getKey().getSalary()) {
			return -1;
		}else {
			return 0;
		}
	}
});
Map<Employee, String> x=new HashMap<>();

		for(Map.Entry<Employee, String> aa:l) {
			x.put(aa.getKey(), aa.getValue());
		}
		return x;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> hm=new HashMap<>();
		hm.put(new Employee(101,"swapnil",2000), "Pune");
		hm.put(new Employee(102,"Kunal",7000), "Latur");
		hm.put(new Employee(103,"Rajit",9000), "Jalna");
		hm.put(new Employee(104,"Yeutkar",1000), "Aug");
		hm.put(new Employee(105,"Vhantale",1000), "Mumbai");
		Demo d1= new Demo();
		Map<Employee,String> y=d1.sortMapUsingEmployeeSalary(hm);
		
	Set<Map.Entry<Employee, String>> v=y.entrySet();
	for(Map.Entry<Employee, String> a:v) {
		System.out.println(a.getKey()+"====="+a.getValue());
	}
		
	}

}
