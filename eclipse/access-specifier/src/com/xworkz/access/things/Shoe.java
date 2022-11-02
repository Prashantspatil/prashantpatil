package com.xworkz.access.things;

public class Shoe {
	
	private String name="sneaker";
	private String type="informal";
	private String color="blue";
	public double tax;
	public int price;
	public String air;
	public double income;
	public boolean sports;
	public String place;
	public String state;
	public String country;
	
	public Shoe(double tax, int price, String air, double income, boolean sports, String place, String state,
			String country) {
		super();
		this.tax = tax;
		this.price = price;
		this.air = air;
		this.income = income;
		this.sports = sports;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
