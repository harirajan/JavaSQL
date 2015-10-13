package com.myPackage.myGenerics;

import static com.myPackage.enumerator.Spiciness.FLAMING;
import static com.myPackage.enumerator.Spiciness.MILD;

import java.util.EnumSet;
import java.util.Set;

import com.myPackage.enumerator.Spiciness;

public class EnumSetDemo {

	public static void main(String[] args) {

		Set<Spiciness> set1 = EnumSet.range(MILD, FLAMING);
		System.out.println("set1: " + set1);
	}
}
