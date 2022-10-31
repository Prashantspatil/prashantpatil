package com.xworkz.association.things;

public class Country {
	
	public String name;
	public String capital;
	public int zipCode;
	public double population;
	
	public Country(String name, String capital, int zipCode, double population) {
		super();
		this.name = name;
		this.capital = capital;
		this.zipCode = zipCode;
		this.population = population;
	}
	
	public void showCountry() {
		System.out.println("country name : "+name);
		System.out.println("capital name : "+capital);
		System.out.println("country zipcode : "+zipCode);
		System.out.println("country population : "+population);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}
