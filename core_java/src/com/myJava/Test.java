package com.myJava;

import java.util.Arrays;

public class Test {
	private final int integerField = 10;
	byte byteField = integerField;

	public static void main(String[] args) {

		int[] ar = { 3, 2, 5, 6 };
		int[] a = { 2, 1 };
		int[] b = { 3, 3 };
		Test t = new Test();
		// System.out.println(ar.toString());
		t.firstLast6(ar);
		System.out.println(Arrays.toString(t.plustwo(a, b)));
		System.out.println(t.double23(a));
		System.out.println(t.double23(b));

	}

	public boolean firstLast6(int[] nums) {
		// nums.length
		if (new Integer(nums[0]).toString().equals("6") || new Integer(nums[nums.length - 1]).toString().equals("6"))
			return true;
		else
			return false;
	}

	public boolean double23(int[] nums) {

		// int i = nums[0];
		boolean result = false;
		if (nums.length > 0) {
			int i = nums[0];

			for (int i1 = 1; i1 < nums.length; i1++) {

				if (nums[i1] == i) {
					result = true;
				} else
					result = false;
			}
		} else {
			result = false;
		}

		return result;

	}

	public int[] plustwo(int[] a, int[] b) {

		int[] temp = new int[a.length + b.length];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (i == 1) {
					temp[j] = a[j];
				} else {
					temp[j + 2] = b[j];
				}

			}
		}

		return temp;

	}
}