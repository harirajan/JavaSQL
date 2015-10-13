package com.myPackage.myThreads;

public class TGo implements Runnable{
	public static void main(String argv[]){
	        TGo tg = new TGo();
	        Thread t = new Thread(tg);
	        t.start();
	        }
	        public void run(){
	                while(true){
	                       // Thread.currentThread().sleep(1000);
	                        System.out.println("looping while");
	                        }
	        }
	}
