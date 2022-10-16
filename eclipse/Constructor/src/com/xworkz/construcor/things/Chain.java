package com.xworkz.construcor.things;

public class Chain {

	public String type;
	public String material;
	public String usedFor;
	public boolean stolen;
	public boolean fresh;
	public float price;
	public float length;
	public float weight;

	public Chain() {

	}

	public Chain(String type) {
		this();
		this.type = type;
	}

	public Chain(String type, String material) {
		this(type);
		this.material = material;
	}

	public Chain(String type, String material, String usedFor) {
		this(type, material);
		this.usedFor = usedFor;
	}

	public Chain(String type, String material, String usedFor, boolean stolen) {
		this(type, material, usedFor);
		this.stolen = stolen;
	}

	public Chain(String type, String material, String usedFor, boolean stolen, boolean fresh) {
		this(type, material, usedFor, stolen);
		this.fresh = fresh;
	}

	public Chain(String type, String material, String usedFor, boolean stolen, boolean fresh, float price) {
		this(type, material, usedFor, stolen, fresh);
		this.price = price;
	}

	public Chain(String type, String material, String usedFor, boolean stolen, boolean fresh, float price,
			float length) {
		this(type, material, usedFor, stolen, fresh, price);
		this.length = length;
	}

	public Chain(String type, String material, String usedFor, boolean stolen, boolean fresh, float price, float length,
			float weight) {
		this(type, material, usedFor, stolen, fresh, price, length);
		this.weight = weight;
	}

}
