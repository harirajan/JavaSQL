package com.myPackage.myConsoleInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryMenu {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("==== Library Management====");
		System.out.println("Select Any of the Below Options:");
		System.out.println();
		System.out.println("  1) View all the Books");
		System.out.println("  2) Look for a Books Availability");
		System.out.println("  3) Reserve a Book");
		//System.out.println("  3) Reserve a Book");
		char i;
		
			i = (char)br.read();
			System.out.println("int : "+i);
			switch(i) {
			case '1': 
				System.out.println("Option one is Selected");
				break;
			case '2':
				System.out.println("Option two is selected");
				break;
			case '3': 
				System.out.println("Option three is selected");
				break;
			}
		
		
		
	}

}
