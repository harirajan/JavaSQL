package com.myJava;

public class StringReverseOracle {

	public static void main(String[] args) {

		System.out.println(reverse("zafin labs. trivandrum\" kerala india"));
	}

	public static String reverse(String str) {

		char[] charArray = str.toCharArray();
		StringBuffer returnString = new StringBuffer();
		//int start = 0;
		int end = charArray.length - 1;
		char tillWhat = ' ';
		for (int i = charArray.length - 1; i >= 0; i--) {
			// charArray.
			if (charArray[i] == ' ' || charArray[i] == '.' || charArray[i] == '\"') {
				for (int j = i + 1; j <= end; j++) {
					returnString.append(charArray[j]);
				}
				end = i - 1;
				returnString.append(charArray[i]);
				tillWhat = charArray[i];
			}

		}
		returnString.append(str.subSequence(0, str.indexOf(tillWhat)));

		return returnString.toString();
	}
}
