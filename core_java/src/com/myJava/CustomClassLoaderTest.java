package com.myJava;

public class CustomClassLoaderTest {
	 
    public static void main(String [] args) throws Exception{
       CustomClassLoader test = new CustomClassLoader();
       test.loadClass("java.lang.String");
    }
}