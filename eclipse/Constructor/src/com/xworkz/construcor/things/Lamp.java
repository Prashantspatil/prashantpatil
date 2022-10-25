package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Color;

public class Lamp {
	
	public static String name;
	public Color color=Color.BLUE;
	public int price;
	public double quantity;
	public String brand;
	
	public Lamp(Color color, String brand) {
		super();
		this.color = color;
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	static {
		name="Khandil";
	}
	
	public void displayAmount() {
		double total=this.price*this.quantity;
		System.out.println("total amount : "+total);
	}
	
	public void lampShowCase() {
		System.out.println("lamp name : "+Lamp.name);
		System.out.println("lamp color : "+this.color);
		System.out.println("lamp brand : "+this.brand);
		System.out.println("lamp price : "+this.price);
		System.out.println("lamp quantity : "+this.quantity);
	}

}
