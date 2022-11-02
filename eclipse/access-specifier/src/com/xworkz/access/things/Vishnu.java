package com.xworkz.access.things;

public class Vishnu {
	
	private String name="vishnuvardhan";
	private String role="hero";
	private String title="sahasa simha";
	public double fans;
	public int age;
	public String area;
	public double income;
	public boolean handsome;
	public String place;
	public String state;
	public String country;
	
	public Vishnu(double fans, int age, String area, double income, boolean handsome, String place, String state,
			String country) {
		super();
		this.fans = fans;
		this.age = age;
		this.area = area;
		this.income = income;
		this.handsome = handsome;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
