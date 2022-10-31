package com.xworkz.association.things;

public class Address {
	
	public Locations locations;
	
	public Address() {
		super();
	}
	
	public void setLocations(Locations locations) {
		this.locations=locations;
	}
	
	public void displayAddress() {
		if(this.locations!=null) {
		this.locations.displayLocatinos();
		}
	}

}
