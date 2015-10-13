package com.myJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Puzzle2MyProgram {
	
	private static String baseString = "++--***...";
	private static List<String> alphabets = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j"));
	//private static String[] alphabets = {"a","b","c","d","e","f","g","h","i","j"};
	
	public static void main(String[] args) {
	
	List<String> outputString = new ArrayList<String>();
	char[] inputString = args[0].toCharArray();
	for(int i=0;i<args[0].length();i++) {
		String output = new String();
		if(!String.valueOf(inputString[i]).matches("[0-9]")) {
		int index = alphabets.indexOf(String.valueOf(inputString[i]));
		
		output+= baseString.substring(0, index+1);
		if(String.valueOf(inputString[i-1]).matches("[0-9]")) {
			
			for(int j =0;j< Character.getNumericValue(inputString[i-1]);j++) {
				
				output+=" ";
			}
		}
		outputString.add(output);
		}
		
		
	}
	String result = "";
	for(int i = 20; i >= 0; i--){
	for(String s: outputString) {
		 if(s.length() >= i + 1){
             result += s.charAt(i);
         } else {
             result += " ";
         }
     }
     result += "\n";
		//System.out.println(s);
		//System.out.println(s.split(""));
	}
	
	
    System.out.println(result);
        
	//System.out.println(outputString);
	//System.out.println(alphabets.contains("a"));	
		
	}
	
	/*public String transpose(String input) {
		
		
		char[]
		
	}*/

}
