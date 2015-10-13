package com.myJava;

import java.util.HashSet;
import java.util.Set;

public class TestJava {
	
	

	public static void main(String[] args) {
		
		Person p1 = new Person("a","b","c");
		Person p2 = new Person("a","b","c");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		
		Set<Person> setDemo = new HashSet<Person>();
		System.out.println(setDemo.add(p1));
		System.out.println(setDemo.add(p2));
		System.out.println(setDemo.size());
	
		System.out.println(setDemo);
		
		String[] str = new String[10];
		str[0]= "abc";
		String tets = str[0];
		tets.substring(1, 2);
		System.out.println(tets);
		String test = tets.replaceAll("ab", "bcd");
		System.out.println(test);
		System.out.println(tets);
		str[0]=tets;
		System.out.println(str[0]);
		
		
		String testStr = new String("immutable");
		testStr = "hahah";
		System.out.println(testStr);
		
		
	
	}
}
