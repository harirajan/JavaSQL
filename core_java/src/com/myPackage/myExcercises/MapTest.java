package com.myPackage.myExcercises;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("a","one");
		System.out.println(map.put("a", "two"));
		System.out.println(map);
		
	}
}
