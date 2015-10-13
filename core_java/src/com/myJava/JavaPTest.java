package com.myJava;

import java.util.HashSet;
import java.util.Set;

public class JavaPTest {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("abc");
		//s.toString()
		s = s.append("def");
		
		Set<String> setString = new HashSet<String>();
		setString.add("abc");
		setString.add("bed");
		
		System.out.println(setString.contains("abc"));
		
		Set<One> setString1 = new HashSet<One>();
		One firstObj = new One("a", 7);
		System.out.println(firstObj.hashCode());
		setString1.add(firstObj);
		
		System.out.println(setString1.contains(new One("a",7)));
		//System.out.println((new One("a",7).hashCode()));
		
	}
}
