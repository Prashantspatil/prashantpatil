package com.xworkz.association.things;

public class City {
	
	public String name;
	public long pinCode;
	public boolean clean;
	public double airIndex;
	
	public City(String name, long pinCode, boolean clean, double airIndex) {
		super();
		this.name = name;
		this.pinCode = pinCode;
		this.clean = clean;
		this.airIndex = airIndex;
	}
	
	public void showCity() {
		System.out.println("city name : "+name);
		System.out.println("city pincode : "+pinCode);
		System.out.println("city is clean : "+clean);
		System.out.println("city air-index : "+airIndex);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}
