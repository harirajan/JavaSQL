package com.myPackage.myGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargsTest {

	public static <T> List<T> makeList(T... args){
		
		List<T> newList = new ArrayList<T>();
		for(T item: args) {
			newList.add(item);
			
		}
		return newList;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Testing Generics and Var args");
		
		System.out.println(makeList("H","H","H"));
		System.out.println(makeList(1,3,4));
		System.out.println(makeList(new Float(4444), new Double(999)));
	}
}
