package com.myJava.myStudy;

import java.math.BigDecimal;
import java.util.Date;

public class Java_bigdecimal_setScale {
	
	Date d11 ;
	  public Date getD11() {
		return d11;
	}
	public void setD11(Date d11) {
		this.d11 = d11;
	}
	public static void main(String args[]) {

	  BigDecimal b1 = new BigDecimal(2),
	  result = new BigDecimal(0);

	  result = b1.setScale(2);

	  System.out.println("\nb1 object value :" +
	  " " + b1);
	  System.out.println("method generated " +
	  "result : " + result);

	  b1 = new BigDecimal(2);

	  result = b1.setScale(4);

	  System.out.println("\nb1 object value : " +
	  "" + b1);
	  System.out.println("method generated " +
	  "result : " + result);

	  b1 = new BigDecimal(78);

	  result = b1.setScale(0);

	  System.out.println("\nb1 object value : " +
	  "" + b1);
	  System.out.println("method generated " +
	  "result : " + result);
	  
	  
	  //public 
	  
	  
	  Date d1 = new Date(2011,11,22);
	 // setD11(d1)
	  System.out.println(d1);
	  }
	}
