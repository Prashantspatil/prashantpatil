package com.xworkz.inheritance.things;

public class DJ {
	
	public String name;
	public String place;
	public double entry;
	
	public DJ() {
		
	}

	public DJ(String name, String place, double entry) {
		super();
		this.name = name;
		this.place = place;
		this.entry = entry;
	}
	
	public void djNight() {
		System.out.println("dj started");
		System.out.println(name);
		System.out.println(place);
		System.out.println(entry);
	}

}
