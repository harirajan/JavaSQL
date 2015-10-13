package com.myPackage.myClasses;

import java.util.ArrayList;
import java.util.Collections;

public class SongSort {

	public static void main(String[] args) {

		ArrayList<Song> arrayList = new ArrayList<Song>();
		arrayList.add(new Song("title1", "singer3"));
		arrayList.add(new Song("title6", "singer2"));
		arrayList.add(new Song("title3", "singer7"));
		/*
		 * for (Song song : arrayList) {
		 * 
		 * System.out.println(song); } Collections.sort(arrayList);
		 * 
		 * for (Song song : arrayList) {
		 * 
		 * System.out.println(song); }
		 */
		SingerComparator singerComp = new SingerComparator();
		Collections.sort(arrayList, singerComp);
		for (Song song : arrayList) {

			System.out.println(song);
		}
	}
}
