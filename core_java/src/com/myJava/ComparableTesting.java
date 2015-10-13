/*package com.myJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTesting {

	public static void main(String[] args) {

		Person p1 = new Person("Hari", 1);
		Person p2 = new Person("Sree", 1);
		Person p3 = new Person("AAA", 5);
		Person p4 = new Person("BBB", 6);
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p4);
		list.add(p3);
		list.add(p2);

		for (Person person : list) {
			System.out.println(person.toString());
		}

		//Collections.sort(list);
		for (Person person : list) {
			System.out.println(person.toString());
		}
		PersonNameComparator pnComparator = new PersonNameComparator();
		Collections.sort(list, pnComparator);

		System.out.println("======================================");
		for (Person person : list) {
			System.out.println(person.toString());
		}

	}
}
*/