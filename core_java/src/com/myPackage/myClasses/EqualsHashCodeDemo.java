package com.myPackage.myClasses;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashCodeDemo {

	public static void main(String[] args) {

		Map<Groundhog2, Prediction> mapOne = new HashMap<Groundhog2, Prediction>();

		for (int i = 0; i < 10; i++) {
			Groundhog2 gh1 = new Groundhog2(i);
			System.out.println(gh1.hashCode());
			mapOne.put(new Groundhog2(i), new Prediction());
			
		}
		mapOne.put(new Groundhog2(3), new Prediction());
		System.out.println(mapOne);

		Groundhog2 gh = new Groundhog2(3);
		System.out.println(gh.hashCode());
		System.out.println(mapOne.get(gh));
	}
}
