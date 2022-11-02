package com.xworkz.access.things;

public class EleVehicle {
	
	private String name="nexon";
	private String type="sedon";
	private String company="tata motors";
	public double tax;
	public int units;
	public String owner;
	public double income;
	public boolean eco;
	public String place;
	public String state;
	public String country;
	
	public EleVehicle(double tax, int units, String owner, double income, boolean eco, String place, String state,
			String country) {
		super();
		this.tax = tax;
		this.units = units;
		this.owner = owner;
		this.income = income;
		this.eco = eco;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
