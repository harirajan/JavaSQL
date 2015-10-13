package com.myJava;

import java.math.BigDecimal;

public class Round {

	public static void main(String[] args) {
		
		BigDecimal bd = new BigDecimal((62.185 * 2.0) + 0.05)
		   .setScale(3, BigDecimal.ROUND_HALF_UP);
		bd = new BigDecimal(bd.doubleValue()/2.0)
		   .setScale(4, BigDecimal.ROUND_HALF_UP);
		String rounded = bd.toString();
		System.out.println(rounded);



	}
}
