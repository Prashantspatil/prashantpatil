package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Color;

public class ShirtBrand {
	
	public static String brand;
	public Color color=Color.YELLOW;
	public int price;
	public double quantity;
	public String type;
	
	public ShirtBrand(Color color, String type) {
		super();
		this.color = color;
		this.type = type;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	static {
		brand="D&G";
	}
	
	public void displayAmount() {
		double total=this.price*this.quantity;
		System.out.println("total amount : "+total);
	}
	
	public void ShirtBrandShowCase() {
		System.out.println("ShirtBrand : "+ShirtBrand.brand);
		System.out.println("Shirt color : "+this.color);
		System.out.println("shirt type : "+this.type);
		System.out.println("Shirt price : "+this.price);
		System.out.println("Shirt quantity : "+this.quantity);
	}

}
