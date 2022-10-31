package com.xworkz.association.things;

public class Industry {
	
	public String name;
	public String ownerName;
	public Address address;
	
	public Industry(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	public void setAddress(Address address) {
		this.address=address;
	}
	
	public void displayIndustry() {
		System.out.println("industry name : "+name);
		System.out.println("owner name : "+ownerName);
		if(this.address!=null) {
		this.address.displayAddress();
		}
	}

}
