package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Director;

public class Prashanth extends Director{
	
	public String movie;
	
	public Prashanth() {
		
	}

	public Prashanth(String industry, int movies, String movie) {
		super(industry, movies);
		this.movie=movie;
	}
	
	public void screen() {
		super.screen();
		System.out.println(movie);
	}

}
