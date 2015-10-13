package com.myPackage.myCollection;

//: holding/AddingGroups.java
//Adding groups of elements to Collection objects.
import java.util.ArrayList;
import java.util.List;

public class AddingGroups {
	public static void main(String[] args) {
		/*Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can't
		// construct a Collection this way:
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		// Produces a list "backed by" an array:
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99); // OK -- modify an element
		// list.add(21); // Runtime error because the
		// underlying array cannot be resized.
		*/
		List<String> list1 =new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		System.out.println(System.currentTimeMillis());
		System.out.println(list1.size());
		System.out.println(System.currentTimeMillis());
		list1.add("c");
		list1.add("d");
		list1.add("e");
		System.out.println(System.currentTimeMillis());
		System.out.println(list1.size());
		System.out.println(System.currentTimeMillis());
	}
} // /:~
