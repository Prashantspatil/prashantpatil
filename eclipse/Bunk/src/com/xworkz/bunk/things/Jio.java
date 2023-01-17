package com.xworkz.bunk.things;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	
	public Jio() {
		System.out.println("cretaed jio using const...");
	}

	@Override
	public void connect() {
		System.out.println("connect using jio");
	}

}
