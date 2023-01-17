package com.xworkz.bunk.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel{
	
	public Petrol() {
		System.out.println("cretaed petrol using const...");
	}

	@Override
	public void consume() {
		
	}

}
