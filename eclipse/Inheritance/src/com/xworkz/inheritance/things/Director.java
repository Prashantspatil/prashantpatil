package com.xworkz.inheritance.things;

public class Director {
	
	public String industry;
	public int movies;
	
	public Director() {
		
	}

	public Director(String industry, int movies) {
		super();
		this.industry = industry;
		this.movies = movies;
	}
	
	public void screen() {
		System.out.println(industry);
		System.out.println(movies);
	}

}
