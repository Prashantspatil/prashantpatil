package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Color;

public class Mango {
	
	public static String name;
	public Color color=Color.YELLOW;
	public int price;
	public double quantity;
	public String place;
	
	public Mango(Color color, String place) {
		super();
		this.color = color;
		this.place = place;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	static {
		name="maavu";
	}
	
	public void displayAmount() {
		double total=this.price*this.quantity;
		System.out.println("total amount : "+total);
	}
	
	public void mangoShowCase() {
		System.out.println("mango name : "+Mango.name);
		System.out.println("mango color : "+this.color);
		System.out.println("place grown : "+this.place);
		System.out.println("mango price : "+this.price);
		System.out.println("mango quantity : "+this.quantity);
	}

}
