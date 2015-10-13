package com.myJava;

import com.myJava.myException.MyFirstException;

public class ExceptionTesting {

	public static void main(String[] args) throws MyFirstException {

		System.out.println("in the main() method");
		//throw new MyFirstException("daiii");
		
		try{
			System.out.println("inside try block");
			throw new Exception();
			//return;
		} catch(Exception e){
			e.printStackTrace();
			return ;
		}
		finally{
			System.out.println("inside finally");
		}
	}
}
