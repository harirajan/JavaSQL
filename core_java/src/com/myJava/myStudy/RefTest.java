package com.myJava.myStudy;

import java.util.ArrayList;
import java.util.List;

public class RefTest {

	public static void main(String[] args0) {

		List<String> testList = new ArrayList<String>();
		testList.add("One");
		testList.add("Two");
		testList.add("Three");
		System.out.println(testList);
		RefTest refTest = new RefTest();
		refTest.changeRef(testList);
		System.out.println(testList);

	}

	public List<String> changeRef(List<String> stringList) {

		List<String> changed = stringList;
		changed.add("test");
		return stringList;

	}

}
