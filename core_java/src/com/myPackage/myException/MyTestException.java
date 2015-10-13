package com.myPackage.myException;

public class MyTestException {

	public static void main(String[] args) throws MyException {
		try {
			 throw new MyException("now i'am here");
		} catch (MyException e) {
			// throw new MyException("spadikam george");}
			throw e;

		}
	}
}
