package com.myJava.myStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		System.out.println(set.add("five"));
		System.out.println(set.add("five"));
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
