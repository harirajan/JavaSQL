package com.myPackage.myClasses;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception{
	
	private static Logger logger = Logger.getLogger("LoggingExceptions");
	public LoggingException() {
	StringWriter sw = new StringWriter();
	printStackTrace(new PrintWriter(sw));
	logger.severe(sw.toString());
	}
}

public class LoggingExceptions {
	
	public static void main(String[] args) {
		
		try {
			throw new LoggingException();
		}catch(LoggingException le) {
			
			System.out.println(le);
		}
	}

}
