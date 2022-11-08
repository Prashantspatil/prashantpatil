package com.xworkz.inheritance.things;

public class Invitation {
	
	public double price;
	public int copy;
	public String color;
	
	public Invitation() {
		
	}

	public Invitation(double price, int copy, String color) {
		super();
		this.price = price;
		this.copy = copy;
		this.color = color;
	}
	
	public void printInvitation() {
		System.out.println("printing started");
		System.out.println(price);
		System.out.println(copy);
		System.out.println(color);
	}

}
