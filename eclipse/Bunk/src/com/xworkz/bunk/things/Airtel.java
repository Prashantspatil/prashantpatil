package com.xworkz.bunk.things;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {
	
	public Airtel() {
		System.out.println("created airtel using const...");
	}

	@Override
	public void connect() {
		System.out.println("connect using airtel");
	}

}
