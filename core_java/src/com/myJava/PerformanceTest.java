package com.myJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceTest {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 100; i++) {
			intList.add(i);
		}
		System.out.println(System.currentTimeMillis());
	

	List<Integer> intLinkedList = new LinkedList<Integer>();
	System.out.println(System.currentTimeMillis());
	for (int i = 0; i < 100; i++) {
		intLinkedList.add(i);
	}
	System.out.println(System.currentTimeMillis());
}

}
