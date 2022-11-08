package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Marriage;

public class DestinationMarriage extends Marriage{

	public DestinationMarriage() {
		
	}

	public DestinationMarriage(String bride, String groom, String venue) {
		super(bride, groom, venue);
	}
	
	public void printDestination() {
		System.out.println("journey started");
		System.out.println(bride);
		System.out.println(groom);
		System.out.println(venue);
	}
	
}
