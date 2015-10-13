package com.myJava.myStudy;

public class SyntaxIssues {
	public static int someMethod(final String p) {
		if (p == null) {
			System.out.println("p is null!");
		} else {
			return 1;
		}

		return 0;
	}
}
