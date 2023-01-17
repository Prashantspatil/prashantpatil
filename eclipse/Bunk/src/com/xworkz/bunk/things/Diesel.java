package com.xworkz.bunk.things;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel{
	
	public Diesel() {
		System.out.println("cretaed diesel using const...");
	}

	@Override
	public void consume() {
		
	}

}
