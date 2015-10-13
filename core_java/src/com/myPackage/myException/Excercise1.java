package com.myPackage.myException;

import java.sql.SQLException;

public class Excercise1 {

	public static void main(String[] args) throws Exception {

		try {
			throw new SQLException("My First Exception Excercise");
		} catch (SQLException se) {
			// System.out.println(""+));
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		finally {

			System.out.println("Inside the Finally");
		}
	}
}
