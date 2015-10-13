package com.myJava.myStudy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class MapTest {

	public static void main(String[] args) {

		Map<String, String> hMap = new HashMap<String, String>();
		Map<String, String> hTable = new Hashtable<String, String>();
		hMap.put(null, null);
		// hTable.put(null,null); //hashTable does not allow null keys or null values. Runtime Exception
		System.out.println(hMap.put("a", "one"));
		System.out.println(hMap.put("a", "b"));
		//System.out.println(hMap.entrySet());
		Set<Map.Entry<String,String>> set = hMap.entrySet();
		//System.out.println(set);
		for(Map.Entry<String,String> set1 : set) {
			System.out.println(set);
			
		}
		
		hMap.keySet();
		System.out.println(hMap.values());
		//Iterator it = h
		/*for (Map<String,String> entry : hMap) {
			
		}*/
		
		Map<String,String> testMap = new HashMap<String,String>();
		testMap.put("a","a");
		testMap.put("c", "c");
		testMap.put("b","b");
		
		System.out.println("printing testMap "+testMap);
		
		//Collection
		List<Integer> vectorList = new Vector<Integer>(2);
		//vectorList.add(arg0)
		
		String x = new String("tom");
		String y = new String("tom"); // <== Different instance!
	
		IdentityHashMap<String,Integer> ihm = new IdentityHashMap<String,Integer>( );
		ihm.put(x, new Integer(15));
		ihm.put(y, new Integer(15));
		System.out.println(ihm);
		
		
}

}
