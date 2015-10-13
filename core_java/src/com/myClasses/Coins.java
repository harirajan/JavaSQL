package com.myClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Coins {
	Map<Integer, Integer> denoms = new HashMap<Integer, Integer>();
	List<Integer> d = new ArrayList<Integer>();
	public Coins() {
		denoms.put(1, 1);
		denoms.put(10, 1);
		denoms.put(25, 1);
		//denoms.put(5, 5);
		
		d.add(1);
		d.add(10);
		d.add(25);
	}
	
	public int getCoins(int denom, int totalChange){
		int count=1;
		while(denom*++count <= totalChange){}
		return --count;
	}
	
	public void getChange(Map<Integer, Integer> change, int totalChange){
		
		if(totalChange <=0)return;
		
		//for the totalChange, get the nearest denom... 
		for(int i=d.size()-1; i>=0;i--){
			int aCoin = d.get(i);
			if(aCoin<=totalChange){
				int coins = getCoins(aCoin, totalChange);
				change.put(aCoin,coins);
				//.. Now how much more do we have left?
				int changeSoFar = aCoin * coins;
				int remChange = totalChange - changeSoFar;
				getChange(change, remChange);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Coins c = new Coins();
		Map<Integer, Integer> chillar = new HashMap<Integer, Integer>();
		c.getChange(chillar, 30 );
		System.out.println(chillar);
	}
}
