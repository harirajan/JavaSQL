package com.myPackage.myExcercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectoinTutorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("bcd");
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("bcd");
		System.out.println(coll.containsAll(list));
		
		//AbstractCollection<E>

	}

}
