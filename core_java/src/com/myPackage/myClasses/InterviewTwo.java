package com.myPackage.myClasses;

import java.util.ArrayList;
import java.util.ListIterator;

public class InterviewTwo {

	public static void main(String[] args) {

		String s = "one";
		String t = "eno";
		System.out.println(s.hashCode());
		System.out.println(t.hashCode());
		String u = new String("one");
		System.out.println(u.hashCode());
		
		//System.out.println(s == t);
//		/System.out.println(t == u);
		//System.out.println(s.equals(t));
//		Sy/stem.out.println(s.equals(u));

		java.util.List<String> arList = new ArrayList<String>();

		arList.add("one");
		arList.add("two");
		arList.add("three");
		// ListIterator<String> iter = arList.listIterator();
		ListIterator<String> iter = arList.listIterator();
		while (iter.hasNext()) {
			iter.add("four");
			// arList.add("four");
			//System.out.println("Printing =========>>>  " + iter.next());
		}
	}
}
