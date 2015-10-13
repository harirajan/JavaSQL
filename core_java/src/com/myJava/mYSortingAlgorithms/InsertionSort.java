package com.myJava.mYSortingAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int sortInt = 0;
		int tempPos = 0;
		int inputInt;
		int temp = 0;
		boolean testBool = false;
		int[] sortArray = new int[args.length];
		// System.out.println(args.toString());
		// StringTokenizer sToken = new StringTokenizer();
		// System.out.println(args.length);
		for (int i = 0; i < args.length; i++) {
			sortArray[i] = Integer.parseInt(args[i]);
			// System.out.println(args[i]);
		}

		// for(int j = 0;j< sortArray.length;j++) {
		for (int i = 0; i < sortArray.length; i++) {
			if (i == 0) {
				// sortInt++;
				continue;
			}
			sortInt = i;
			for (int l = 0; l <= sortInt - 1; l++) {
				if (sortArray[l] >= sortArray[i]) {
					testBool = true;
					tempPos = l;
					temp = sortArray[i];
					break;
				}
			} // = sortArray[i];
				// if(sortInt!=0) {
			sortInt = i;
			if (testBool) {
				for (int k = sortInt; k > tempPos; k--) {
					sortArray[k] = sortArray[k - 1];

				}
				sortArray[tempPos] = temp;
			}

			testBool = false;
			tempPos = 0;
			// }
			// sortArray[i]=sortArray[l];

			// break;

			// sortArray[inputInt]=
		}
		// }

		for (int w = 0; w < sortArray.length; w++) {
			System.out.println(sortArray[w]);
		}
	}
}
