package com.myJava;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;

//import org.hibernate.SQLQuery;


public class JavaTest {
	private static final String CONSTRAINT_DISABLE_QUERY = "ALTER TABLE STG_OUT_CHARGE_SUMMARY DISABLE CONSTRAINT STG_OUT_CHARGE_SUMMARY_FK1;"
		+ "ALTER TABLE STG_OUT_DISCOUNT_SUMMARY DISABLE CONSTRAINT STG_OUT_DISCOUNT_SUMMARY_FK1;"
		+ "ALTER TABLE STG_OUT_INTEREST_SUMMARY DISABLE CONSTRAINT STG_OUT_INT_SUMMARY_FK1;"
		+ "ALTER TABLE STG_OUT_REFUND_SUMMARY DISABLE CONSTRAINT STG_OUT_REFUND_SUMMARY_FK1";
	private static final String CONSTRAINT_ENABLE_QUERY = "ALTER TABLE STG_OUT_CHARGE_SUMMARY ENABLE CONSTRAINT STG_OUT_CHARGE_SUMMARY_FK1;"
		+ "ALTER TABLE STG_OUT_DISCOUNT_SUMMARY ENABLE CONSTRAINT STG_OUT_DISCOUNT_SUMMARY_FK1;"
		+ "ALTER TABLE STG_OUT_INTEREST_SUMMARY ENABLE CONSTRAINT STG_OUT_INT_SUMMARY_FK1;"
		+ "ALTER TABLE STG_OUT_REFUND_SUMMARY ENABLE CONSTRAINT STG_OUT_REFUND_SUMMARY_FK1";


	private static final String QUERY_SEPERATOR = ";";

	/** The con. */
	static Connection con;
	// private static String queryString =
	// "select book_name, author, availability from book where book_name like '% "+'?'
	// + "%'";
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@//localhost:1521/mirev";
			con = DriverManager.getConnection(url, "MI3PBE", "MI3PBE");
			Statement stmnt = con.createStatement();
			stmnt.executeQuery("alter session set NLS_COMP=ANSI");
			stmnt.executeQuery("alter session set NLS_SORT=BINARY_CI");
			stmnt.executeQuery("alter session set NLS_COMP=LINGUISTIC");
			con.commit();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException{
		/*String nullString = null;
		System.out.println(nullString.equals(null));

		*/
		 DatabaseMetaData dbmd = con.getMetaData();  
		   System.out.println();
		   
		    System.out.println("=====  Database info =====");  
		    System.out.println("DatabaseProductName: " + dbmd.getDatabaseProductName() );  
		    System.out.println("DatabaseProductVersion: " + dbmd.getDatabaseProductVersion() );  
		    System.out.println("DatabaseMajorVersion: " + dbmd.getDatabaseMajorVersion() );  
		    System.out.println("DatabaseMinorVersion: " + dbmd.getDatabaseMinorVersion() );  
		    System.out.println("=====  Driver info =====");  
		    System.out.println("DriverName: " + dbmd.getDriverName() );  
		    System.out.println("DriverVersion: " + dbmd.getDriverVersion() );  
		    System.out.println("DriverMajorVersion: " + dbmd.getDriverMajorVersion() );  
		    System.out.println("DriverMinorVersion: " + dbmd.getDriverMinorVersion() );  
		    System.out.println("=====  JDBC/DB attributes =====");  
		    System.out.print("Supports getGeneratedKeys(): ");  
		    if (dbmd.supportsGetGeneratedKeys() )  
		      System.out.println("true");  
		    else  
		      System.out.println("false"); 	
		String s1 = new String("one");
		String s2 = "one";
		String s3 = "one";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		Statement stmnt = null;
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		// String s = "abc";
		// String v = "abc";
		// System.out.println(s.hashCode());
		// System.out.println(v.hashCode());
		// String s1 = new String("abc");
		// System.out.println(s1.hashCode());
		// System.out.println(s.equals(s1));
		// System.out.println(s == s1);
		// System.out.println(s == v);
		// Date date = new Date();
		// Calendar calendar = Calendar.getInstance();
		// System.out.println(calendar.getTime());
		// for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++)
		// System.out.println("in the loop");

		// Map<String, String> testMap = new HashMap<String, String>();
		// testMap.put(null, "hari");
		// System.out.println(testMap.get(null));
		// testMap.put("hari", null);
		// System.out.println(testMap.get("hari"));
		/*
		 * System.out.println(System.currentTimeMillis()); for (int i = 0; i <
		 * 1000000000; i++) { } System.out.println(System.currentTimeMillis());
		 * 
		 * System.out.println(System.currentTimeMillis()); for (int i =
		 * 1000000000; i > 0; i--) { }
		 * System.out.println(System.currentTimeMillis());
		 * 
		 * Map<String, Set<String>> map = new HashMap<String, Set<String>>();
		 * Set<String> set = new LinkedHashSet<String>();
		 * System.out.println(set.add("hari"));
		 * System.out.println(set.add("hari"));
		 * System.out.println(set.add(null)); System.out.println(set);
		 * System.out.println(map.put(null, new HashSet<String>())); //
		 * map.put(null, new HashSet<String>());
		 * System.out.println(map.put(null, new HashSet<String>()));
		 * System.out.println(map);
		 */

		
		for(int i = 0; i <= 1; i ++) {
		StringTokenizer queryTokenizer = new StringTokenizer(CONSTRAINT_DISABLE_QUERY,QUERY_SEPERATOR);
		/*if(value){
			queryTokenizer = new StringTokenizer(CONSTRAINT_ENABLE_QUERY,QUERY_SEPERATOR);
		}*/
		while (queryTokenizer.hasMoreTokens()) {
			String query = queryTokenizer.nextToken();
			stmnt = con.createStatement();
			stmnt.executeQuery(query);
			System.out.println(query);
			//con.rollback();
		}
		
		
			StringTokenizer queryTokenizer1 = new StringTokenizer(CONSTRAINT_ENABLE_QUERY,QUERY_SEPERATOR);
			
			while (queryTokenizer1.hasMoreTokens()) {
				String query = queryTokenizer1.nextToken();
				stmnt = con.createStatement();
				stmnt.executeQuery(query);
				System.out.println(query);		
			}
			
		}
	}
}
