package com.myPackage.myClasses;

import com.myPackage.myException.MyException;

public class ExceptionTest {

	public static void main(String[] args) throws MyException{


//	/	Object
			try {
		int i = 10 / 0;
			
			throw new MyException();
			}
			finally {
				System.out.println("inside finally");
			}
			/*catch(MyException me){
				System.out.println("inside exception");
			}
		*/
		
	}
}
