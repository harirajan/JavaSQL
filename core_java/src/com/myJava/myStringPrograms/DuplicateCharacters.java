package com.myJava.myStringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		printDuplicateCharacters("coolc");
	}

	public static void printDuplicateCharacters(String word) {

		char[] characters = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else
				charMap.put(ch, 1);
		}

		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("The list of duplicate characters in String %s %n", word);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s:%d%n", entry.getKey(), entry.getValue());
			}
			if(entry.getValue() == 1) {
				System.out.println("the first single ocurrence char is : "+entry.getKey());
			}
		}
	}
}
