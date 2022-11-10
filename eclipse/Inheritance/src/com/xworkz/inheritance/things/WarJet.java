package com.xworkz.inheritance.things;

public class WarJet {
	
	public String country;
	public int units;
	public double budget;
	
	public WarJet() {
		
	}

	public WarJet(String country, int units, double budget) {
		super();
		this.country = country;
		this.units = units;
		this.budget = budget;
	}
	
	public void war() {
		System.out.println(country);
		System.out.println(units);
		System.out.println(budget);
	}
	
	public void khargil() {
		System.out.println("~~~~~~~~~~~");
	}

}
