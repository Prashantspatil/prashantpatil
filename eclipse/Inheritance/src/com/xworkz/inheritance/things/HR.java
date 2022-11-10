package com.xworkz.inheritance.things;

public class HR {
	
	public String role;
	public String company;
	public double ctc;
	
public HR() {
		
	}

public HR(String role, String company, double ctc) {
	super();
	this.role = role;
	this.company = company;
	this.ctc=ctc;
}
	
	public void hire() {
		System.out.println("hiring started");
		System.out.println(role);
		System.out.println(company);
		System.out.println(ctc);
	}
	
	public void offer() {
		System.out.println("~~~~~~~~~~~~~~");
	}


}
