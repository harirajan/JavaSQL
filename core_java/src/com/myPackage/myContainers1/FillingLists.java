package com.myPackage.myContainers1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillingLists {
	
	public static void main(String[] args) {
		
		List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4,new StringAddress("Hello")));
		System.out.println(list.toString());
		Collections.fill(list, new StringAddress("World"));
	}

}

class StringAddress {

	private String s;

	public StringAddress(String s) {
		this.s = s;
	}

	public String toString() {
		return super.toString() + " " + s;
	}
}