package com.myJava.myStringPrograms;

public class StringReverse {

	public static void main(String[] args) {
		
	//stringReverse("hari");
	}
	
	 static String stringReverse(String string) {
		
		 char[] characters = string.toCharArray();
		 StringBuilder newString = new StringBuilder(characters.length);
		 for(int i = characters.length -1;i>=0;i--) {
			 newString.append(characters[i]);
		 }
		 
		 System.out.println(newString.toString());
		 return newString.toString();
	}
}
