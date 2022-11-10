package com.xworkz.inheritance.things;

public class Satellite {

	public int noOf;
	public String station;
	
	public Satellite() {
		
	}

	public Satellite(int noOf, String station) {
		super();
		this.noOf = noOf;
		this.station = station;
	}
	
	public void revolve() {
		System.out.println(noOf);
		System.out.println(station);
	}
	
}
