package com.myJava.myException;

public class TIJFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			throw new MyFirstException();
		}catch(MyFirstException e){
			System.out.println(e.str);
		}
	}

}
