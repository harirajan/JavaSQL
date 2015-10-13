package com.myJava.myException;

public class TIJThree {

	public static void main(String[] args) {

		String[] str = new String[10];
		int i = 10;
		try{
		if (true) {
			System.out.println(str[i]);
		}}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
