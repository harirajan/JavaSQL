package com.myJava;

import java.util.HashMap;
import java.util.Map;

public class OracleInterview {

	public static void main(String[] args) {
		
		Address addr1 = new Address("street1", 1);
		Address addr2 = new Address("street2", 1);
		Address addr3 = new Address("street3", 1);
		Address addr4 = new Address("street4", 1);
		
		
		
		System.out.println(addr1.equals(addr2));
		
		System.out.println(addr1.hashCode());
		System.out.println(addr2.hashCode());
		System.out.println(addr3.hashCode());
		System.out.println(addr4.hashCode());
		
		Map<Address,String> hMap = new HashMap<Address, String>(); 
		hMap.put(addr1, "addr1");
		hMap.put(addr4, "addr4");
		hMap.put(addr2, "addr2");
		hMap.put(addr3, "addr3");
		
		System.out.println(hMap.get(addr2));
		addr2.setStreet("street02");
		
		System.out.println(hMap.get(addr2));
		
		System.out.println(hMap.get(addr1));
		
		addr1.setPinCode(2);
		
		System.out.println(hMap.get(addr1));
	}
}
