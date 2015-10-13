package com.myJava.myStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTesting {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<String>();
		List<Person> personList = new ArrayList<Person>();
		stringList.add("hello");
		stringList.add("ant");
		stringList.add("bee");
		System.out.println(stringList);

		Collections.sort(stringList);
		System.out.println(stringList);

		Person p1 = new Person("hari", 10);
		Person p9 = new Person("hari", 10);
		Person p2 = new Person("rajan", 22);
		Person p3 = new Person("ambattumyalil", 33);
		Person p4 = new Person("ambattumy", 3);
		Person p5 = new Person("ambattumy", 53);

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);

		Collections.sort(personList);
		// System.out.println(personList.toString());
		for (Person person : personList) {
			System.out.println(person.getAge());

		}

		System.out.println(p1.equals(p9));
		System.out.println(p1 == p9);

	}

}
