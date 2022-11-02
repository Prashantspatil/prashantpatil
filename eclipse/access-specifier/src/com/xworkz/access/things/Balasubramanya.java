package com.xworkz.access.things;

public class Balasubramanya {
	
	private String name="spb";
	private String role="singer";
	private String movie="mangalyam tantunanena";
	public double followers;
	public int age;
	public String born;
	public double songs;
	public boolean best;
	public String place;
	public String state;
	public String country;
	
	public Balasubramanya(double followers, int age, String born, double songs, boolean best, String place,
			String state, String country) {
		super();
		this.followers = followers;
		this.age = age;
		this.born = born;
		this.songs = songs;
		this.best = best;
		this.place = place;
		this.state = state;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

}
