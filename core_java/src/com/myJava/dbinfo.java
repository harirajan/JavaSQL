package com.myJava;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class dbinfo  
{  
  public static void main (String arr[]) throws Exception  
  {  
    String dbDriver="oracle.jdbc.driver.OracleDriver";  
    String dbURL = "jdbc:oracle:thin:@//localhost:1521/mirev";  
    String dbPW = "MI3PBE";  
    String dbUser = "MI3PBE";  
   
    Connection con = null;  
    Class.forName(dbDriver);  
   
    con = DriverManager.getConnection (dbURL, dbUser, dbPW);  
    con.setAutoCommit(false);  
   
    DatabaseMetaData dbmd = con.getMetaData();  
   
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
  
    //pstmt.close();  
    con.close();  
  }  
  
}  
