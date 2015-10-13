package com.myJava;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//import sun.misc.Queue;

//import sun.misc.Queue;

public class QueueTest {

	public static void main(String[] args) {

		PriorityQueue<String> pQ = new PriorityQueue<String>();
		pQ.add("d");
		pQ.add("f");
		pQ.add("g");
		pQ.add("a");
		pQ.add("c");
		System.out.println(pQ.remove());

		
		Queue<String> Q = new LinkedList<String>();
		Q.add("c");
		Q.add("k");
		Q.add("w");
		System.out.println(Q.remove());
		/*
		 * for (String s : pQ) { System.out.println(s.toString()); }
		 */
	}
}
