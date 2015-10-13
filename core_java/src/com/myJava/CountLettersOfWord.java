package com.myJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountLettersOfWord {

	public static void main(String[] args) {
		char c;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String temp = "internationalization";
		Character[] cArray;
		Integer[] iArray;
		Integer i1 = new Integer(1);
		int maxValue = 0;
		for (int i = 0; i < temp.length(); i++) {
			c = temp.charAt(i);
			if (map.containsKey(c)) {
				i1 = map.get(c);
				i1++;
				if (maxValue < i1)
					maxValue = i1;
				map.put(new Character(c), i1);
			} else {
				// i1 = 1;
				map.put(new Character(c), 1);
			}

		}
		// System.out.println(map.entrySet());
		// System.out.println("Maximum Value is:" + maxValue);
		Iterator i = map.entrySet().iterator();
		while (i.hasNext()) {
			System.out.println(i);
			i.next();

		}
		Set<Character> c1 = map.keySet();
		cArray = new Character[c1.size()];
		c1.toArray(cArray);
		// System.out.println("cArray is:");
		// System.out.println(c1);
		Collection<Integer> c2 = map.values();
		iArray = new Integer[c2.size()];
		c2.toArray(iArray);

		// while()
		String[][] strArrayforDisplay = new String[cArray.length][iArray.length];
		for (int i2 = 0; i2 < cArray.length; i2++) {
			// System.out.print(cArray[i2]);
			for (int j2 = 0; j2 < iArray.length; j2++) {
				// System.out.println("X");sysou
				System.out.print(strArrayforDisplay[i2][j2]);
			}
			System.out.println();
		}
		// System.out.println(c2);

	}
}
