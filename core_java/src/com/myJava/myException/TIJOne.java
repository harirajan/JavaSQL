package com.myJava.myException;

public class TIJOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			
			throw new Exception("throwing the exception");
		} catch(Exception e){
			e.getStackTrace();
			//System.out.println("e.getMessage() = "+e.getMessage());
			
		}
		finally{
			System.out.println("inside the finally");
		}
		
	}

}
