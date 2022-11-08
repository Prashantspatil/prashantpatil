package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.PreWeddingShoot;
import com.xworkz.inheritance.things.WeddingShoot;

public class WeddingShootRunner {

	public static void main(String[] args) {
		
		WeddingShoot shoot=new WeddingShoot("ooty", "bear grills", "kanteerava");
		shoot.cameraRoll();
		System.out.println("shooting over");
		
		System.out.println(System.lineSeparator());
		
		PreWeddingShoot shoot2=new PreWeddingShoot("maldives", "bhuvangowda", "ramoji");
		shoot2.shootingOn();
		System.out.println("photo printed");

	}

}
