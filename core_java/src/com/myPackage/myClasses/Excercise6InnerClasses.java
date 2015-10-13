package com.myPackage.myClasses;

import com.myPackage.myInnerClasses.Excercise6;
import com.myPackage.myInterfaces.MyInterface;

public class Excercise6InnerClasses extends Excercise6 {
	
	public static void main(String[] args) {
		
		MyInterface mI = new Excercise6InnerClasses().returnInterface();
		
	}
	
	public MyInterface returnInterface() {
		//new Excercise6.
		return (MyInterface) new Excercise6().returnInner6();
	}

}
