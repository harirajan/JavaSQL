package com.myJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 10,11,12);
		Collections.addAll(collection, moreInts);
//		However, Collections.addAll( ) runs much faster, and it’s just as easy to construct 
//		the Collection with no elements and then call Collections.addAll( ), so this is the 
//		preferred approach.
		//System.out.println(Collections.);
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99); // OK -- modify an element
		// list.add(21); // Runtime error because the
		// underlying array cannot be resized.
	}
}
