package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.GenreDJ;
import com.xworkz.inheritance.things.DJ;

public class DJRunner {

	public static void main(String[] args) {
		
		DJ dj=new DJ("himesh", "bengaluru", 250.00);
		dj.djNight();
		System.out.println("dj morning");
		
		System.out.println(System.lineSeparator());
		
		GenreDJ dj2=new GenreDJ("imran", "mangalore", 150.00);
		dj2.djOpen();
		System.out.println("off stage");

	}

}
