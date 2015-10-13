package com.myJava;

public class Address {
	private String street;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	private int pinCode;

	public Address(String street, int pinCode) {
		this.street = street;
		this.pinCode = pinCode;
	}
	
	public String toString() {
		return "the address object with street as:"+street+" and pinCode as:"+pinCode;
	}
	
	public int hashCode() {
		
		return pinCode;
	}
	
	public boolean equals(Object o) {
		
		return o instanceof Address && ((Address)o).getPinCode()==pinCode;
	}
}
