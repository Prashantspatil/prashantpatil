package com.xworkz.bean.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	@Value("india")
	private String country;
	@Value("mangalayan")
	private String name;
	@Value("250")
	private Double budget;
	
	public Rocket() {
		System.out.println("calling rocket");
	}

	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public Double getBudget() {
		return budget;
	}

}
