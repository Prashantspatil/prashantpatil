package com.xworkz.construcor.things;

public class Boat {

	public String name;
	public String color;
	public String companyName;
	public char type;
	public String owner;

	public Boat(String name) {
		this.name = name;
	}

	public Boat(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Boat(String name, String color, String companyName) {
		this.name = name;
		this.color = color;
		this.companyName = companyName;
	}

	public Boat(String name, String color, String companyName, char type) {
		this.name = name;
		this.color = color;
		this.companyName = companyName;
		this.type = type;
	}

	public Boat(String color, char type, String name, String companyName, String owner) {
		this.color = color;
		this.type = type;
		this.name = name;
		this.companyName = companyName;
		this.owner = owner;
	}

	public Boat(char type) {
		this.type = type;
	}

	public Boat(String name, char type) {
		this.name = name;
		this.type = type;
	}

	public Boat(char type, String owner) {
		this.type = type;
		this.owner = owner;
	}

}
