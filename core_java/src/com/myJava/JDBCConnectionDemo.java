package com.myJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionDemo {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@127.0.0.1:1521/orcl","miTest","miTest");  
		System.out.println("printing"+con);
	}

}
