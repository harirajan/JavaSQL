package com.myPackage.myContainers1;

import java.util.Arrays;
import java.util.List;

class Demo {
	int j;
	public Demo(int i) {
		j=i;
	};
	public String toString() {
		return j+"";
	}
}

public class Excercise7 {
	public static void main(String[] args) {

		Demo[] demo = new Demo[] { new Demo(2), new Demo(6), new Demo(10), new Demo(22) };
		List<Demo> arrayList = Arrays.asList(demo);
		System.out.println("Before Removal: " + arrayList);
		List<Demo> subList = arrayList.subList(1, 2);
		System.out.println(subList);
		System.out.println(arrayList.remove(subList));
		System.out.println("After Removal: " + arrayList);
		subList.clear();
		System.out.println(arrayList);
	}

}
