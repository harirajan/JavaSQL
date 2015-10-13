package com.myJava;

import java.math.BigDecimal;

public class RoundTest {
	private static final BigDecimal ROUND_FACTOR = new BigDecimal("0.05");

	public static void main(String[] args) {

		/*
		 * BigDecimal twenty = new BigDecimal(20); BigDecimal amount = new
		 * BigDecimal(32.185);
		 * 
		 * // To round to the nearest .05, multiply by 20, round to the nearest
		 * // integer, then divide by 20 BigDecimal multiply =
		 * amount.multiply(twenty); BigDecimal add = multiply.add(new
		 * BigDecimal("0.5")); // BigDecimal toBigInteger = new
		 * BigDecimal(add.toBigInteger()); BigDecimal divide =
		 * add.divide(twenty); System.out.println(divide); BigDecimal result =
		 * new BigDecimal(amount.multiply(twenty).add(new
		 * BigDecimal("0.5")).toBigInteger()).divide(twenty);
		 * System.out.println(result);
		 */

		BigDecimal bd = new BigDecimal(Double.toString(32.468));
		bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);

		/*
		 * bd = bd.divide(ROUND_FACTOR); bd = new
		 * BigDecimal(Math.ceil(bd.doubleValue())); bd =
		 * bd.multiply(ROUND_FACTOR);
		 */

		System.out.println(bd);
		// return bd.doubleValue();
	}
}