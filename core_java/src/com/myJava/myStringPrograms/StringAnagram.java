package com.myJava.myStringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringAnagram {

	public static void main(String[] args) {
		
		isStringsAnagrams("erral", "rraell");
	}
	
	public static boolean isStringsAnagrams(String first, String second) {
		
		char[] characters1 = first.toCharArray();
		List<Character> listOfChar = new ArrayList<Character>();
		for(char c : characters1) {
			listOfChar.add(c);
		}
		Collections.sort(listOfChar);
		System.out.println("First sorted List"+listOfChar.toString());
		StringBuffer strBuilder = new StringBuffer(listOfChar.size());
		for(Character ch : listOfChar) {
			
			strBuilder.append(ch);
		}
		String st1 = new String(strBuilder);
		System.out.println("first string builder"+ strBuilder);
		char[] characters2 = second.toCharArray();
		List<Character> listOfChar1 = new ArrayList<Character>();
		for(char c : characters2) {
			listOfChar1.add(c);
		}
		Collections.sort(listOfChar1);
		System.out.println("second sorted List"+listOfChar1.toString());
		
		StringBuffer strBuilder1 = new StringBuffer(listOfChar1.size());
		for(Character ch : listOfChar1) {
			
			strBuilder1.append(ch);
		}
		String st2 = new String(strBuilder1);
		System.out.println("second string builder:"+strBuilder1);
		//System.out.println(listOfChar.toString());
		System.out.println(st1.equalsIgnoreCase(st2));
		if(st1.equalsIgnoreCase(st2))
			return true;
		else
			return false;
		
	}
}
