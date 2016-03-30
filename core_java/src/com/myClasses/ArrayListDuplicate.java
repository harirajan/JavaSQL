package com.myClasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add(new String("abc"));
		arrayList.add("cdef");
		
		String newString = new String("abc");
		System.out.println(arrayList.contains(newString));
	}

}
