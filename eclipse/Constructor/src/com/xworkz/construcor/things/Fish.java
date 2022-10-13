package com.xworkz.construcor.things;

public class Fish {
	public String name;
	public String type;
	public int price;
	public float weight;
	public float length;

	public Fish(String name) {
		this.name = name;
	}

	public Fish(String type, float weight) {
		this.type = type;
		this.weight = weight;
	}

	public Fish(int price) {
		this.price = price;
	}

	public Fish(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Fish(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Fish(int price, float weight) {
		this.price = price;
		this.weight = weight;
	}

	public Fish(float weight, float length) {
		this.weight = weight;
		this.length = length;
	}
	
	public Fish(int price,String name) {
		this.price=price;
		this.name=name;
	}
}
