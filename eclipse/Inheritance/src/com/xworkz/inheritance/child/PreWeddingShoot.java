package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.WeddingShoot;

public class PreWeddingShoot extends WeddingShoot{
	
	public PreWeddingShoot() {
		
	}

	public PreWeddingShoot(String place, String cameraMan, String studio) {
		super(place, cameraMan, studio);
	}
	
	public void shootingOn() {
		System.out.println("photo captured");
		System.out.println(place);
		System.out.println(cameraMan);
		System.out.println(studio);
	}

}
