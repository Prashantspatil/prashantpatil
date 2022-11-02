package com.xworkz.access.things;

public class Cinema {
	
	private String industry="sandalwood";
	private String studio="kanteerava";
	private String place="bengaluru";
	public double income;
	public int heroes;
	public String state;
	public double viewers;
	public boolean kannada;
	public String hero;
	public String villain;
	public String dance;
	
	public Cinema(double income, int heroes, String state, double viewers, boolean kannada, String hero, String villain,
			String dance) {
		super();
		this.income = income;
		this.heroes = heroes;
		this.state = state;
		this.viewers = viewers;
		this.kannada = kannada;
		this.hero = hero;
		this.villain = villain;
		this.dance = dance;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
