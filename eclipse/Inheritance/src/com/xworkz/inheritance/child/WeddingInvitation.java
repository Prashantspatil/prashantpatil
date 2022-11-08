package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Invitation;

public class WeddingInvitation extends Invitation{

	public WeddingInvitation() {
		
	}

	public WeddingInvitation(double price, int copy, String color) {
		super(price, copy, color);
	}
	
	public void printWeddingInvitation() {
		System.out.println("cards distribution started");
		System.out.println(price);
		System.out.println(copy);
		System.out.println(color);
	}
	
}
