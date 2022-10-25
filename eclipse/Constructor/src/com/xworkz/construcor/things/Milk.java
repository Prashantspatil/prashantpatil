package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Color;

public class Milk {
	
	public static String name;
	public Color color=Color.YELLOW;
	public int price;
	public double quantity;
	public String breed;
	
	public Milk(Color color, String breed) {
		super();
		this.color = color;
		this.breed = breed;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	static {
		name="nandini";
	}
	
	public void displayAmount() {
		double total=this.price*this.quantity;
		System.out.println("total amount : "+total);
	}
	
	public void MilkShowCase() {
		System.out.println("Milk name : "+Milk.name);
		System.out.println("Milk color : "+this.color);
		System.out.println("animal breed : "+this.breed);
		System.out.println("Milk price : "+this.price);
		System.out.println("Milk quantity : "+this.quantity);
	}

}
