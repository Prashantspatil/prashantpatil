package com.xworkz.inheritance.things;

public class Terrorist {
	
	public String origin;
	public String jail;
	public int imprisonment;
	
	public Terrorist() {
		
	}

	public Terrorist(String origin, String jail, int imprisonment) {
		super();
		this.origin = origin;
		this.jail = jail;
		this.imprisonment = imprisonment;
	}
	
	public void attack() {
		System.out.println("attacking taj hotel");
		System.out.println(origin);
		System.out.println(jail);
		System.out.println(imprisonment);
	}
	
	public void bomb() {
		System.out.println("bomb pot");
	}

}
