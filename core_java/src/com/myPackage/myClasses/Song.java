package com.myPackage.myClasses;

public class Song implements Comparable<Song>{

	private String title;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	private String singer;

	public Song(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	public int compareTo(Song s) {
		return title.compareTo((s.title));
	}
	
	public String toString() {
		return this.title;
	}
	
}
