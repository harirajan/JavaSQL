package com.myJava.myStudy;

import java.math.BigDecimal;

public class RoundingDigits {

	public static void main(String[] args) {

		BigDecimal bd = new BigDecimal(String.valueOf("222.00054")).setScale(5, BigDecimal.ROUND_CEILING);
		System.out.println(bd);

		
		double myNum = .912385;
		int precision = 10000; //keep 4 digits
		myNum= Math.floor(myNum * precision +.5)/precision;
		System.out.println(myNum);

	}
}
