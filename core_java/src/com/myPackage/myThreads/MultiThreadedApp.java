package com.myPackage.myThreads;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MultiThreadedApp {
	static Map<Integer, String> hashMap = new ConcurrentHashMap<Integer, String>();
	static Map<Integer,String> syncMap = Collections.synchronizedMap(hashMap);
	
	public static void main(String[] args) throws InterruptedException {
		Inputter i1 = new Inputter(0,2000000,syncMap);
		Inputter i2 = new Inputter(2000001,4000000,syncMap);
		Inputter i3 = new Inputter(4000001,6000001,syncMap);
		Inputter i4 = new Inputter(6000001,8000000,syncMap);
		Inputter i5 = new Inputter(8000001,10000000,syncMap);
		
		i1.start();
		//TimeUnit.SECONDS.sleep(1);
		i2.start();//new Thread(i2).start();
		//TimeUnit.SECONDS.sleep(1);
		i3.start();//new Thread(i3).start();
		//TimeUnit.SECONDS.sleep(1);
		i4.start();//new Thread(i4).start();
		//TimeUnit.SECONDS.sleep(1);
		i5.start();//new Thread(i5).start();
		//TimeUnit.SECONDS.sleep(1);
		
		//if (!i1.isAlive() && !i2.isAlive() && !i3.isAlive() && !i4.isAlive() && !i5.isAlive()) {
			
		//}
		
	}
}


class Inputter extends Thread{
	
	int startNumber;
	int endNumber;
	static Map<Integer, String> hashMap;
	
	
	public Inputter(int startNumber, int endNumber, Map<Integer, String> hashMap) {
		this.startNumber = startNumber;
		this.endNumber = endNumber;
		Inputter.hashMap = hashMap;
		//this.hashMap = hashMap;
	}
	public void run () {
		//synchronized (hashMap) {
			long startTime = System.currentTimeMillis();
		for(int i = startNumber; i<= endNumber; i ++){
			hashMap.put(i, "test");
			//System.out.println("printing i : "+i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time elapsed : " + (endTime - startTime));
		System.out.println(hashMap.size());
		}	//}
}