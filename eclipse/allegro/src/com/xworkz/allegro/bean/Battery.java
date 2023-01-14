package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {

	@Autowired
	private Capacity capacity;

	public Battery() {
		System.out.println("created battery---------");
	}
	
	public void checkCapacity() {
		System.out.println(this.capacity.hashCode() +"hashcode of ref capacity");
	}

}
