package com.myJava;

import java.math.BigDecimal;

public class ObjectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object result =1;
		if(((Integer)result).intValue() != 0){
			System.out.println("not zerio");
		}
		
		int intValue = (Integer)result;
		if(intValue != 0){
			
		}
		Long l =0L;
		l.intValue();
		
		BigDecimal db = new BigDecimal(1);
		Integer int1 = Integer.valueOf(db.intValue());
		System.out.println(int1);
	}

}
