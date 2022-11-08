package com.xworkz.inheritance.things;

public class WeddingShoot {
	
	public String place;
	public String cameraMan;
	public String studio;
	
	public WeddingShoot() {
		
	}

	public WeddingShoot(String place, String cameraMan, String studio) {
		super();
		this.place = place;
		this.cameraMan = cameraMan;
		this.studio = studio;
	}
	
	public void cameraRoll() {
		System.out.println("shooting started");
		System.out.println(place);
		System.out.println(cameraMan);
		System.out.println(studio);
	}

}
