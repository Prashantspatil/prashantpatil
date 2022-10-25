package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Color;

public class Flower {
	
	public static String name;
	public Color color=Color.BLUE;
	public int price;
	public double quantity;
	public String place;
	
	public Flower(Color color, String place) {
		super();
		this.color = color;
		this.place = place;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	static {
		name="neelakurinji";
	}
	
	public void displayAmount() {
		double total=this.price*this.quantity;
		System.out.println("total amount : "+total);
	}
	
	public void flowerShowCase() {
		System.out.println("flower name : "+Flower.name);
		System.out.println("flower color : "+this.color);
		System.out.println("place grown : "+this.place);
		System.out.println("flower price : "+this.price);
		System.out.println("flower quantity : "+this.quantity);
	}

}
