package com.myClasses;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle x = new Vehicle("Focus",2002,"Ford");
		Vehicle y = new Vehicle("Focus",2002,"Ford");
		Vehicle z = new Vehicle("Focus",2002,"Ford");
		
		int correctCases = 0;

		//reflexiveness test
		if (x.equals(x)) {
			System.out.println("It is reflexive!");
			correctCases++;
		} else {
			System.out.println("It is not reflexive");
		}
		
		//symmetry test
		if (x.equals(y) && y.equals(x)) {
			System.out.println("It is symmetric!");
			correctCases++;
		} else {
			System.out.println("It is not symmetric");
		}
		
		//transitiveness test
		boolean cause1 = x.equals(y) && y.equals(z);
		if (cause1 == x.equals(z)) {
			System.out.println("It is transitive!");
			correctCases++;
		} else {
			System.out.println("It is not transitive");
		}
		
		if (x.equals(null) == false) {
			System.out.println("Nothing equals null");
			correctCases++;
		} else {
			System.out.println("An object equals null?!");
		}
		
		System.out.println(correctCases+"/4 correct cases");

	}

}
