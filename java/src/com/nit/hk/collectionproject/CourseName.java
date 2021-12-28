package com.nit.hk.collectionproject;

import java.util.HashMap;

public class CourseName {
	private static HashMap<String, Integer> courseMap;
	
	static {
		courseMap=new HashMap<String, Integer>();
		
		courseMap.put("C", 1);
		courseMap.put("CPP", 2);
		courseMap.put("CORE JAVA", 3);
		courseMap.put("ADVJAVA", 4);
		courseMap.put("PYTHON", 5);
		courseMap.put("ORACLE", 6);
	}

	public static int getID(String courseName) {
		
		return courseMap.get(courseName.toUpperCase());
	}
}
