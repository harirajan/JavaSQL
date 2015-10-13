package com.myJava.myStringPrograms;

import java.util.HashSet;

public class DuplicateWords {

	public static void main(String[] args) {
		String aSentence = "this is my word and this is my only word";
		HashSet<String> hashSet = new HashSet<String>();
		String[] wordArray = aSentence.split(" ");
		for(String eachString : wordArray){
			//System.out.println(eachString);
			boolean isThere = hashSet.add(eachString);
			if(!isThere){
				System.out.println(eachString);
			}
			
		}
		// TODO Auto-generated method stub

	}

}
