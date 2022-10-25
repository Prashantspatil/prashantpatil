package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Color;

public class Sweet {
	
	public static String brand;
	public String name;
	public int price;
	public Color color=Color.BLUE;
	public double quantity;
	
	public Sweet(String name,Color color) {// constructor initialization
		this.name = name;
		this.color=color;
	}
	static {
		brand="mishra peda";// literal initialization
	}
	public void setPrice(int price) {//method initialization
		this.price=price;
	}
	public void displayTotalPrice(){
		double total=this.price*this.quantity;
		System.out.println("total price : "+total);
	}
	public void sweetNodu(){
		System.out.println("brand : "+Sweet.brand);
		System.out.println("sweet : "+this.name);
		System.out.println("price : "+this.price);
		System.out.println("color : "+this.color);
		System.out.println("quantity : "+this.quantity);
	}

}
