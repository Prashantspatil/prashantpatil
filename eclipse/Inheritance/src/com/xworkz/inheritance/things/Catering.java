package com.xworkz.inheritance.things;

public class Catering {

	public String crew;
	public int members;
	public double fees;
	
	public Catering() {
		
	}

	public Catering(String crew, int members, double fees) {
		super();
		this.crew = crew;
		this.members = members;
		this.fees = fees;
	}
	
	public void showCatering() {
		System.out.println("food preparation started");
		System.out.println(crew);
		System.out.println(members);
		System.out.println(fees);
	}
	
}
