package com.myPackage.myClasses;

import java.util.ArrayList;
import java.util.Vector;

public class VectorArrayList {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		System.out.println("initial vector size: " + vector.capacity());
		for (int i = 0; i < 11; i++) {
			vector.add("i" + i);
		}
		System.out.println("after vector size: " + vector.capacity());
		
		ArrayList<String> arrayList = new ArrayList<String>();
		System.out.println("initial arrayList size: " + arrayList.size());
		for (int i = 0; i < 11; i++) {
			arrayList.add("i" + i);
		}
		System.out.println("after arrayList size: " + arrayList.size());
	}
}
