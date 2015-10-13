package com.myJava;

public class Finalizer {
    @Override
        protected void finalize() throws Throwable {
        while (true) {
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < 100000000; i++) {
            	Finalizer f = new Finalizer();
            }

            System.out.println("" + Runtime.getRuntime().freeMemory() + " bytes free!");
        }
    }
}