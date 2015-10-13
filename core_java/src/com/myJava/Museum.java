package com.myJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Museum {

	public static void main(String[] args) {

		float[] n = { 4, 6, 20, 26, 32,35,38, 40, 55, 59, 61, 62, 70, 71, 72, 73, 74,75,100,101 };
		System.out.println(Arrays.toString(n));
		Float[] flt = {new Float(99.3),new Float(88.9), new Float(44.4)};
		System.out.println(Arrays.toString(flt));
		System.out.println((calcuateCameraPosition(n, 40)).toString());
		Arrays.toString(calcuateCameraPosition(n, 40));
	}

	public static Float[] calcuateCameraPosition(float[] paintings, float l) {
		Float[] k = null;
		int paintingsSize = paintings.length;
		float startPosition = paintings[0];
		float endPosition = 0;
		float[] cameraPosition = null;
		ArrayList<Float> list = new ArrayList<Float>();
		for (int j = 1; j < paintingsSize; j++) {

			if (startPosition == 0) {
				startPosition = paintings[j];
				continue;
			}

			if (paintings[j] - startPosition > 6) {

				if (endPosition == 0) {
					list.add(startPosition);
					startPosition =paintings[j];
				} else {

					list.add(startPosition + ((endPosition - startPosition) / 2));
					startPosition = paintings[j];
					endPosition = 0;

				}

			} else {
				if ((paintings[j] - startPosition) == 6) {
					list.add(startPosition + ((paintings[j] - startPosition) / 2));
					startPosition = 0;
					endPosition = 0;
				} else
					endPosition = paintings[j];
				continue;
			}
		}

		if (startPosition != 0) {
			if(endPosition != 0) {
				list.add(startPosition + ((endPosition - startPosition) / 2));
			}else
			list.add(startPosition);
			
			
		}
		k = new Float[list.size()];
		list.toArray(k);
		System.out.println(Arrays.toString(k));
		System.out.println(k);
		return k;
	}
}
