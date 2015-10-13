package com.myJava.myStudy;

import java.io.IOException;

public class NeverCaught {
	static void f() throws IOException  {
		throw new IOException("From f()");
	}

	static void g()throws IOException {
		f();
	}

	public static void main(String[] args) throws IOException{
		g();
	}
}
