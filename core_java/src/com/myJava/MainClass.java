package com.myJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainClass {
	public static void main(String[] a) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		// /Object
		Map map = new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		Set set = map.entrySet();
		// System.err.println();
		System.out.println(set);
		Iterator iter = set.iterator();
		// Iterator iter = map.i
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}

		Person p1 = new Person("Hari", 8);
		Person p2 = new Person("Hari", 8);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p1.hashCode());
		System.out.println("printing the compareTo method" + compareElements(p1, p2));

	}

	public static <T extends Comparable<T>> boolean compareElements(T t1, T t2) {

		t1.compareTo(t2);
		if (t1.compareTo(t2) > 0)
			return true;
		return false;
	}
}
