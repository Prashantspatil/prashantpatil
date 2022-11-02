package com.xworkz.access.things;

public class Adani {
	
	private String name="gautam";
	private String field="business";
	private String company="adani ports";
	public double tax;
	public int age;
	public String born;
	public double income;
	public boolean richest;
	public String place;
	public String state;
	public String country;
	
	public Adani(double tax, int age, String born, double income, boolean richest, String place, String state,
			String country) {
		super();
		this.tax = tax;
		this.age = age;
		this.born = born;
		this.income = income;
		this.richest = richest;
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

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
