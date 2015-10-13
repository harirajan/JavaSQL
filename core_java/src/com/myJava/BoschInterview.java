package com.myJava;

public class BoschInterview {
	public static void main (String[] args) {
	
	String str = "dad";
	BoschInterview bI = new BoschInterview();
	System.out.println(bI.isPalindrome(str));
	System.out.println(bI.stringReverse("coolhari"));
	System.out.println(bI.fullNumbers("888AAADCB"));
	System.out.println(bI.fullNumbers("AAADCB"));
	System.out.println(bI.fullNumbers("888898"));
	
	
}

	public boolean isPalindrome(String str) {
		boolean test1 = false;
		char[] test = str.toCharArray();
		for(int i=0;i<str.length()/2;i++) {
			
			if(test[i]==test[str.length()-(i+1)])
				test1=true;
			else
				test1=false;
			
		
		}
		return test1;
	}
	//StringBuilder
	public String stringReverse(String str) {
		String temp =new String();
		for(int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
		}
		return temp;
	}
	
	public boolean fullNumbers(String str) {
		
		for( int i = 0;i<str.length()-1;i++) {
			if(Character.isDigit(str.charAt(i)))
				return false;
			
		}
		return true;
	}
	
}
