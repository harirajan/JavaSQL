package com.myPackage.myInnerClasses;

public class DotNew {
	
	public Inner returnInner(){
		
		return new Inner();
	}
	public class Inner {
	}

	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
		DotNew.Inner dni1 = dn.returnInner();
	}
}
