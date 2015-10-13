package com.myJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("hari", "rajan", "a");
		Person p2 = new Person("veena", "c", "v");
		Person p3 = new Person("appu", "darsh","a");
		Person p4 = new Person("hello", "how", "you");
		Person p5 = new Person("yes", "iam", "here");
		List<Person> list = new ArrayList<Person>();
		list.add(p3);
		list.add(p2);
		list.add(p1);
		list.add(p4);
		list.add(p5);
		Collections.sort(list);
		for(Person p: list) {
			
			System.out.println(p.firstName);
		}
		Set<Person> set = new LinkedHashSet<Person>(list);
		System.out.println("======set output======");
		for(Person p : set) {
			System.out.println(p.firstName);
		}
	}
}
