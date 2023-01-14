package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {

	@Autowired
	private Experience experience;

	public Director() {
		System.out.println("created director###############");
	}

	public void checkExperience() {
		System.out.println(this.experience.hashCode() + "hashcode of ref experience");
	}

}
