package com.xworkz.association.things;

public class Location {
	
	public String street;
	public String city;
	public String state;
	public long pinCode;
	public String country;
	
	public Location(String street, String city, String state, long pinCode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}
	
	public void show() {
		System.out.println("street name : "+street);
		System.out.println("city name : "+city);
		System.out.println("state name : "+state);
		System.out.println("pincode "+pinCode);
		System.out.println("country : "+country);
	}

}
