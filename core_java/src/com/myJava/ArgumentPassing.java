package com.myJava;

public class ArgumentPassing {
	public static void main(String[] args) {

		int i = 0;
		//StringBuffer sb = new StringBuffer("Hari");
		String string1 = new String("string1");
		change(i, string1);
		System.out.println(i);
		System.out.println(string1);
		//varArguments(new String("1"));
	}

	public static void change(int i, String string1) {

		i = 10;
		//string1 = string1.concat(" + new");
		string1 = "cde";
		//sb = new StringBuffer("aaa");
	}

	public static void varArguments(String... args) {

		System.out.println(args[0]);
	}

}
