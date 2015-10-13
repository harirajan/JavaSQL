package com.myJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Map<Person, String> map = new HashMap<Person, String>();
		
		System.out.println(map.put(new Person("h", "a", "r"), "its me"));
		System.out.println(map.get(new Person("h", "a", "r")));
		//Map<String, String> newMap = new HashMap<String, String>();
		//System.out.println(newMap.put(new String("Hari"), "Value"));
		//System.out.println(map.get(new String("Hari")));
		
	}

}
