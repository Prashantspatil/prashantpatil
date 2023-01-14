package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Companies {
	
	@Autowired
	private Location location;
	
	public Companies() {
		System.out.println("created company");
	}
	
	public void checkLocation() {
		System.out.println(this.location.hashCode() +"hashcode of ref location");
	}

}
