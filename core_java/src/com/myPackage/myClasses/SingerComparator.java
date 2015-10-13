package com.myPackage.myClasses;

import java.util.Comparator;

public class SingerComparator implements Comparator<Song> {
	
	Object obj;
	@Override
	public int compare(Song o1, Song o2) {
		// TODO Auto-generated method stub
		return o1.getSinger().compareTo(o2.getSinger());
	}

}
