package com.myJava;

import java.util.HashMap;
import java.util.Map;

public class ObjectEqualsCheck {

	public static void main(String[] args) {
	Address a1 = new Address("a",1);
	Address a2 = new Address("a",1);
	//System.out.println(a1.equals(a2));
	//System.out.println(a1==a2);
	
	Map<Address,String> map = new HashMap<Address, String>();
	System.out.println(map.put(a1, "coolhari"));
	System.out.println(map.put(a1, "haria"));
	///System.out.println(map);
	
	//System.out.println(map.get(a1));
	System.out.println(map.get(new Address("a",1)));
	}
}
