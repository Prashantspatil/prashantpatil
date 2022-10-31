package com.xworkz.association.things;

public class Locations {
	
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;
	
	public Locations(int no, String street) {
		super();
		this.no = no;
		this.street = street;
	}
	
	public void setCityStateCountry(City city,State state,Country country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	public void displayLocatinos() {
		System.out.println("number : "+no);
		System.out.println("street name : "+street);
		if(this.city!=null) {
		this.city.showCity();
		}
		if(this.state!=null) {
		this.state.displayState();
		}
		if(this.country!=null) {
		this.country.showCountry();
		}
	}

}
