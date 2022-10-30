package com.xworkz.association.things;

public class Mountain {
	
	public String name;
	public Location location;
	public double height;
	public Temple temple;
	
	public Mountain(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
	
	public void visitTemple() {
		Temple temple=new Temple("Kailash", "trivikrama", 2500);
		temple.show();
		Location location=new Location("redCliff", "pok", "J&K", 585332L, "hindustan");
		location.show();
		System.out.println("mountain name : "+name);
		System.out.println("mountain range : "+height);
	}

}
