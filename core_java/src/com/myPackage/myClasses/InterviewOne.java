package com.myPackage.myClasses;

import java.util.HashMap;
import java.util.Map;

public class InterviewOne {
	
	public static void main(String[] args) {
		
		RuntimeException re;
		InterviewOne intOne = new InterviewOne();
		intOne.test(null);
		
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put(null, "one");
		testMap.put("one", "one");
		
		
		System.out.println(testMap.get(null));
		System.out.println(testMap.get("one"));
		
		
	}
	
	public void test(Object inte) {
		
		System.out.println("Integer");
	}
	
	public void test(String str) {
		
		System.out.println("String");
	}
	
	
	

}
