package com.xworkz.inheritance.things;

public class PetrolBunk {
	
	public String location;
	public double investment;
	public String type;
	
	public PetrolBunk() {
		
	}

	public PetrolBunk(String location, double investment, String type) {
		super();
		this.location = location;
		this.investment = investment;
		this.type = type;
	}
	
	public void petrol() {
		System.out.println(location);
		System.out.println(investment);
		System.out.println(type);
	}
		
		public void diesel() {
			System.out.println("@@@@@@@@@@@@@@@@@@@@");
		}

}
