package com.myPackage.myException;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LogExceptionOne extends Exception {

	private static Logger logger = Logger.getLogger("LogExceptionOne");

	public LogExceptionOne() {
		StringWriter sw1 = new StringWriter();
		printStackTrace(new PrintWriter(sw1));
		logger.severe("This is a severe ExceptionOne" +sw1.toString());
	}
}

class LogExceptionTwo extends Exception {

	private static Logger logger = Logger.getLogger("LogExceptionTwo");

	public LogExceptionTwo() {
		StringWriter sw1 = new StringWriter();
		printStackTrace(new PrintWriter(sw1));
		logger.severe("This is a severe ExceptionTwo"+sw1.toString());
	}
}

public class Excercise6 {
	public static void main(String[] args) throws LogExceptionOne {

		try {

			throw new LogExceptionOne();
		} catch (LogExceptionOne eO) {
			System.out.println("Caught ExceptionOne: " + eO);

		}
		try {

			throw new LogExceptionTwo();
		} catch (LogExceptionTwo eO) {
			System.out.println("Caught ExceptionTwo: " + eO);

		}

	}

}
