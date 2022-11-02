package com.xworkz.access.things;

public class Cake {
	
	private String type="pestry";
	private String flavour="chocolate";
	private String franchies="just bake";
	public double weight;
	public int price;
	public String branch;
	public double temperature;
	public boolean best;
	public String area;
	public String place;
	public String state;
	
	public Cake(double weight, int price, String branch, double temperature, boolean best, String area, String place,
			String state) {
		super();
		this.weight = weight;
		this.price = price;
		this.branch = branch;
		this.temperature = temperature;
		this.best = best;
		this.area = area;
		this.place = place;
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getFranchies() {
		return franchies;
	}

	public void setFranchies(String franchies) {
		this.franchies = franchies;
	}
	
}
