package com.sriguna.spring.test;

public class Address {

	private String street;
	
	private String city;
	
	private String postcode;

	public Address(String street, String city, String postcode) {
		super();
		this.street = street;
		this.city = city;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postcode=" + postcode + "]";
	}
	
	
	
}
