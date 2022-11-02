package com.xworkz.access.things;

public class Beach {
	
	private String name="rock";
	private String type="marine";
	private String territory="goa";
	public double area;
	public int no;
	public String location;
	public double income;
	public boolean eco;
	public String place;
	public String state;
	public String country;
	
	public Beach(double area, int no, String location, double income, boolean eco, String place, String state,
			String country) {
		super();
		this.area = area;
		this.no = no;
		this.location = location;
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

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}
	
}
