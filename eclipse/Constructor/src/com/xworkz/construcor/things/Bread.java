package com.xworkz.construcor.things;

public class Bread {

	public String name;
	public String shape;
	public String companyName;
	public int price;
	public float quantity;

	public Bread(String name) {
		this.name = name;
	}

	public Bread(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Bread(String name, float quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public Bread(String name, String shape) {
		this.name = name;
		this.shape = shape;
	}

	public Bread(String name, String shape, String companyName) {
		this.name = name;
		this.shape = shape;
		this.companyName = companyName;
	}

	public Bread(int price) {
		this.price = price;
	}

	public Bread(float quantity) {
		this.quantity = quantity;
	}

	public Bread(String name, String shape, String companyName, int price, float quantity) {
		this.name = name;
		this.shape = shape;
		this.companyName = companyName;
		this.price = price;
		this.quantity = quantity;
	}

}
