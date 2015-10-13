package com.myJava.myException.Logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class DemoOne {
	
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		}catch(LoggingException le) {
			
		}
	}

}
class LoggingException extends Exception{
	
	private static Logger logger = Logger.getLogger("LoggingException");
	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}