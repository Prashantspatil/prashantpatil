package com.xworkz.access.things;

public class Batsman {
	
	private String name="msd";
	private String batStyle="left hand";
	private String born="08/07/1983";
	public double followers;
	public int highest;
	public String ipl;
	public double income;
	public boolean wicketKeeper;
	public String knownAs;
	public String place;
	public String country;
	
	public Batsman(double followers, int highest, String ipl, double income, boolean wicketKeeper, String knownAs,
			String place, String country) {
		super();
		this.followers = followers;
		this.highest = highest;
		this.ipl = ipl;
		this.income = income;
		this.wicketKeeper = wicketKeeper;
		this.knownAs = knownAs;
		this.place = place;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatStyle() {
		return batStyle;
	}

	public void setBatStyle(String batStyle) {
		this.batStyle = batStyle;
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

}
