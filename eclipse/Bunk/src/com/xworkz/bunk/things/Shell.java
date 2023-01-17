package com.xworkz.bunk.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk{

	@Autowired
	@Qualifier("diesel")
	private Fuel fuel;
	
	public Shell() {
		System.out.println("created shell using const...");
	}
	
	@Override
	public void purchase() {
		fuel.consume();
	}

}
