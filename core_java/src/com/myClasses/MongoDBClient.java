package com.myClasses;

import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class MongoDBClient {
	private static final String FEE_AMT_FORMAT = "00000000000000";
	public static void main(String[] args) {
//		/try {
		
			Double longValue = new Double("15.54");
			System.out.println(longValue.floatValue());
			float test = longValue.floatValue();
			System.out.println(test);
			NumberFormat amountFormat = new DecimalFormat(FEE_AMT_FORMAT);
			System.out.println(amountFormat.format(removeDecimal(Float.toString(test))));
			
			Mongo mongo = null;
			try {
				mongo = new Mongo("localhost", 27017);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DB db = mongo.getDB("test");
			DBCollection collection = db.getCollection("employees");
			BasicDBObject employee = new BasicDBObject();
			employee.put("name", "Hannah");
			employee.put("no", 2);
			collection.insert(employee);
			BasicDBObject searchEmployee = new BasicDBObject();
			searchEmployee.put("no", 1);
			DBCursor cursor = collection.find(searchEmployee);
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
			System.out.println("The Search Query has Executed!");
		} /*catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e1) {
			e1.printStackTrace();
		}*/
	//}
	
	private static long removeDecimal(String amount) {
		if (amount != null) {
			String[] amounts = amount.split("\\.");
			if (amounts.length == 2) {
				amount = amounts[0] + amounts[1];
			} else {
				amount = amounts[0];
			}
		}
		return Long.valueOf(amount).longValue();
	}
}
