package com.myPackage.myPuzzlers;

import java.util.Calendar;
import java.util.Date;

public class DatingGame {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(1999, Calendar.DECEMBER, 31);
		System.out.println(c.get(Calendar.YEAR));

		Date d = c.getTime();
		//d.getD
		System.out.println(c.get(Calendar.DAY_OF_MONTH));

	}
}
