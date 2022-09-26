package com.problem3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> sta=new LinkedHashMap<>();
		
		sta.put("Maharashtra", "Mumbai");
		sta.put("Gujrat", "GandhiNagar");
		sta.put("Punjab", "Chandigarh");
		sta.put("Karnataka", "Bengaluru");
		sta.put("AndraPradesh", "Amravati");
		System.out.println(sta);
		Set<Map.Entry<String, String>> value=sta.entrySet();
		for(Map.Entry<String, String> me:value) {
			System.out.println(me.getKey()+"<=====>"+me.getValue());
		}
	}

}
