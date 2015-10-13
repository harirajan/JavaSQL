package com.myPackage.myClasses;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Hari
 *
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] i1;// = new int[10];
		
		i1 = new int[Integer.valueOf(args[0]).intValue()];
		System.out.println(i1.toString());
		System.out.println(Arrays.toString(i1));
		Random random = new Random();
		int i = new Integer(10);
		System.out.println(random.getClass());
		System.out.println(i);

	}
}
