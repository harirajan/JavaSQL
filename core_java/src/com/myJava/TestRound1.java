package com.myJava;

import java.math.BigDecimal;
public class TestRound1 {
  public static void main(String args[]){
    double d = 1.425;
    BigDecimal bd = new BigDecimal(d);
   // bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
    // output is 3.15
    System.out.println(d + " : " + round(d, 2));
    // output is 3.154
    System.out.println(d + " : " + round(d, 3));
  }

 /* public static double round(double d, int decimalPlace){
    // see the Javadoc about why we use a String in the constructor
    // http://java.sun.com/j2se/1.5.0/docs/api/java/math/BigDecimal.html#BigDecimal(double)
    BigDecimal bd = new BigDecimal(Double.toString(d));
    bd = bd.setScale(decimalPlace,BigDecimal.ROUND_HALF_UP);
    return bd.doubleValue();
  }*/
  
  private static double round(double d, int decimals) {
	   double roundFactor = 1.0;
	   while (decimals > 0) {   // handle the positive decimal points case...
		  roundFactor *= 10.0;
		  --decimals;
	   }
	   double g = (d * roundFactor) + 0.5;
	   return (int)(g / roundFactor);
	}
}
