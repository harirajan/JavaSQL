package com.myProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("==== Relational Algebra Interpreter ====");
		System.out.println("Select Any of the Below Options ( q to Quit)");
		System.out.println();
		System.out.println("  1) To Enter a Solution");
		System.out.println("  2) To Search for a solution");
		
		char i;
		
		i = (char)br.read();
		//System.out.println("int : "+i);
		switch(i) {
		case '1': 
			
			System.out.println("Enter the error code/Description: ");
			//System.out.println())
			//System.out.println("Option one is Selected");
			
			break;
		case '2':
			System.out.println("Enter the error code: ");
			System.out.println("Enter the solution: ");
			//System.out.println("Option two is selected");
			//IsBookAvailable isBA = new IsBookAvailable();
			
			break;
		case 'q': 
			
			System.exit(0);
		default: 
			System.out.println("please print a valid option!!!");
			String[] test = {"A","B"};
			main(test);
		}
	}
}
