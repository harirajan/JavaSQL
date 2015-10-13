package com.myJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		Iterator it1 = list.iterator();
		//it1.remove();
		System.out.println(it1.next());
		it1.remove();
		//Cloneable
		/*
		 * it.remove(); while (it.hasNext()) { System.out.println(it.next()); }
		 */
		Iterator it2 = list.iterator();
		System.out.println(it2.next());

		Set<String> hashSet = new HashSet<String>();
		hashSet.add("first");
		hashSet.add("first");
		
		System.out.println(hashSet);

	}
}
