package com.myPackage.myException;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Excercise3 {
	private static Logger logger = Logger.getLogger("Excercise3");
	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		
		
		
		String[] s = new String[10];
		try {
			for (int i = 0; i <= 10; i++) {
				s[i] = "c";
				// print(s[i]);
			}
		} catch (Exception e) {
			e.printStackTrace(new PrintWriter(sw));
			logger.severe(sw.toString());
		}
	}

}
