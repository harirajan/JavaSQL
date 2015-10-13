package com.myPackage.myException;

class BaseException1 extends Exception {
	public BaseException1(String s) {
		super(s);
	}
}

class SubException extends BaseException1 {
	public SubException(String s) throws BaseException1{
		super(s);
	}
}

class NewException1 extends SubException{
	
//	public NewException(String s){
//		try {
//		super(s);}catch(BaseException be) {
//			
//		}
//	}
	
	public NewException1(String s) throws BaseException1{
		super(s);
	}
}
public class Excercise21 {
	public static void main(String[] args) {

	}

}
