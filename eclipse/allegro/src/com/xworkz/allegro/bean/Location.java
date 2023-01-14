package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	
	@Autowired
	private Area area;
	
	public Location() {
		System.out.println("created location");
	}
	
	public void checkArea() {
		System.out.println(this.area.hashCode() +"hashcode of ref area");
	}

}
