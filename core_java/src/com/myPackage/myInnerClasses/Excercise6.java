package com.myPackage.myInnerClasses;

import com.myPackage.myInterfaces.MyInterface;

public class Excercise6 {

	private class Inner6 implements MyInterface {

		public String interfaceMethod() {
			return "interfacemethod";
		}

	}

	public Inner6 returnInner6() {

		return new Inner6();
	}

}
