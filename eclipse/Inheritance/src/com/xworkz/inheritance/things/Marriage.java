package com.xworkz.inheritance.things;

public class Marriage {

	public String bride;
	public String groom;
	public String venue;
	
	public Marriage(String bride, String groom, String venue) {
		super();
		this.bride = bride;
		this.groom = groom;
		this.venue=venue;
	}
	
	public Marriage() {
		
	}
	
	public void printNames() {
		System.out.println("marriage started");
		System.out.println(bride);
		System.out.println(groom);
		System.out.println(venue);
	}
	
}
	
	
