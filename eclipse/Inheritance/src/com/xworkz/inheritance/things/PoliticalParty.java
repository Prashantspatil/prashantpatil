package com.xworkz.inheritance.things;

public class PoliticalParty {
	
	public boolean ruling;
	public int states;
	
	public PoliticalParty() {
		
	}

	public PoliticalParty(boolean ruling, int states) {
		super();
		this.ruling = ruling;
		this.states = states;
	}
	
	public void election() {
		System.out.println(this.ruling);
		System.out.println(this.states);
	}

}
