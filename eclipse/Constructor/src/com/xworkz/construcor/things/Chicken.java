package com.xworkz.construcor.things;

public class Chicken {
	
	public static String brand;
	public String type;
	public int price;
	public double weight;
	
	public Chicken() {
		
	}
	
	public Chicken(String type) {
	this();
	this.type=type;
	}
	
	public Chicken(String type,int price) {
		this(type);
		this.price=price;
	}
	
	public Chicken(String type,int price,double weight) {
		this(type,price);
		this.weight=weight;
	}
	
}
