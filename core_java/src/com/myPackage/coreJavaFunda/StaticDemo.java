package com.myPackage.coreJavaFunda;

public class StaticDemo {
    
	//String

    {
        System.out.println("HELLO");
    }

    static {
        show();
    }

    public StaticDemo() {
        System.out.println("CONSTRUCTOR");
    }

    public static void show() {
        System.out.println("MESSAGE");
    }

    public static void main(String[] args) {
        System.out.println("MAIN");

        StaticDemo s = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
    }

    static {
        System.out.println("STATIC BLOCK");
        //System.out.println("StaticDemo.name = " + name);
    }
    
}

