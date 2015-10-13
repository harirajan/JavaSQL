package com.myPackage.myContainers1;


public class MapGeneratorTest {

	public static void main(String[] args) {
		
		//Map newMap = new LinkedHashMap<K, V>(MapData.)

		MapData<Integer,String> mData = new MapData<Integer,String>(new Letters(), 10);
		System.out.println(mData);
	}
}
