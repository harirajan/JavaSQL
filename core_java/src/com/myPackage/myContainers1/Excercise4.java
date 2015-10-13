package com.myPackage.myContainers1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class StringGenerator implements Generator<String> {
	private int next;
	String[] characterName = { "one", "two", "three" };

	public String next() {
		System.out.println("initial next:" + next);
		String r = characterName[next];
		System.out.println(characterName.length);
		int length = characterName.length;
		next = (next + 1) % length;
		System.out.println("next is :" + next);
		return r;

	}
}

public class Excercise4 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		List<String> linkedlist = new LinkedList<String>();
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();

		StringGenerator sgen = new StringGenerator();
		for (int i = 0; i < 10; i++) {
			list.add(sgen.next());
			linkedlist.add(sgen.next());
			hashSet.add(sgen.next());
			linkedHashSet.add(sgen.next());
			treeSet.add(sgen.next());

		}
		System.out.println(list);
		System.out.println(linkedlist);
		System.out.println(hashSet);
		System.out.println(linkedHashSet);
		System.out.println(treeSet);
	}

}
