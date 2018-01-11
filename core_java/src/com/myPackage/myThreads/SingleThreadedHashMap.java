package com.myPackage.myThreads;

import java.util.HashMap;
import java.util.Map;

public class SingleThreadedHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		long startTime = System.currentTimeMillis();
		for(int i = 0;i<10000000;i++) {
			hashMap.put(i, "test");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time elapsed : " + (endTime - startTime));
		System.out.println(hashMap.size());
	}

}
