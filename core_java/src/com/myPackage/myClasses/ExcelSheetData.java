package com.myPackage.myClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcelSheetData {
	public static void main(String args[]) throws SQLException,
			ClassNotFoundException {
		Connection con = prepareConnection();
		Statement st = con.createStatement();
		String query = "select * from [Sheet1$]";
		ResultSet rs = st.executeQuery(query);
		System.out.println("Book Name \t\t\t\tAuthor \t\t\t\tCOL3:");
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t\t\t\t");
			System.out.print(rs.getString("Author") + "\t");
			System.out.println();
			//System.out.println(rs.getString("No Of Copies"));
		}// while
	}// main

	public static Connection prepareConnection() throws SQLException,
			ClassNotFoundException {
		String driverClassName = "sun.jdbc.odbc.JdbcOdbcDriver";
		String url = "jdbc:odbc:Library";
		Class.forName(driverClassName);
		return DriverManager.getConnection(url);
	}// prepareConnection
}
