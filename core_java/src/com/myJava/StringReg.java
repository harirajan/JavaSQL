package com.myJava;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringReg {

	public static void main(String[] args) {

		String query = new String("and a.areaCode = :AREA_CODE");
		List<String> temp = new ArrayList<String>();

		StringTokenizer sTokenizer = new StringTokenizer(query, " ");
		while (sTokenizer.hasMoreTokens()) {
			String nextToken = sTokenizer.nextToken();
			if (nextToken.contains(":")) {
				temp.add(nextToken.substring(1, nextToken.length()));
			}
		}

		/*
		 * int start = query.indexOf(":"); // boolean loop = true; while (loop)
		 * {
		 * 
		 * if (query.indexOf(" ", start) == -1) { temp.add(query.substring(start
		 * + 1, query.length())); loop = false; continue; }
		 * 
		 * temp.add(query.substring(start + 1, query.indexOf(" ", start))); if
		 * (query.indexOf(" ", start) == query.lastIndexOf(" ")) { loop = false;
		 * continue; } start = query.indexOf(":", query.indexOf(" ", start));
		 * 
		 * }
		 */
		for (String string : temp)
			System.out.println(string);

		List<String> attributePlaceHolders = new ArrayList<String>();
		System.out.println(attributePlaceHolders);

		System.out.println(attributePlaceHolders.isEmpty());

		// TreeSet<E>
		/*
		 * StringBuffer sBuff = new StringBuffer(); System.out.println(sBuff);
		 * System.out.println("after"); if (sBuff.equals(" ") || sBuff == null)
		 * System.out.println("null"); }
		 */

		// StringBuffer sBuffer = new StringBuffer();
		// sBuffer.append("Hari");
		// sBuffer.append("Rajan");
		// System.out.println(sBuffer);
	}
}