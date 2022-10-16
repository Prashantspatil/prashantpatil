package com.xworkz.construcor.things;

public class Tractor {

	public String name;
	public String brand;
	public float price;
	public String color;
	public int hp;
	public int model;

	public Tractor() {
		System.out.println("you can't see me");
	}

	public Tractor(String name) {
		this();// super chaining
		this.name = name;
	}

	public Tractor(String name, String brand) {
		this(name);// initialization by chaining
		this.brand = brand;// explicit variable initialization
	}

	public Tractor(float price) {
		this("Swaraj", "M&M");// implicit variable initialization
		this.price = price;
	}

	public Tractor(String name, String brand, float price, String color) {
		this(price);
		this.color = color;
	}

	public Tractor(String name, String brand, float price, String color, int hp) {
		this(name,brand,price,color);
		this.hp = hp;
	}

	public Tractor(String name, String brand, float price, String color, int hp, int model) {
		this(name,brand,price,color,hp);
		this.model = model;
	}

}
