package com.xworkz.association.things;

import com.xworkz.association.constants.FuelType;

public class Fuel {
	
	public boolean special=true;
	public Brand brand;
	public FuelType type=FuelType.PETROL;
	public double price;
	public double quantity;
	
	public Fuel(boolean special, double price, double quantity) {
		super();
		this.special = special;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void totalPrice() {
		double total=this.price*quantity;
		System.out.println("total price " + total + "Rs");
		System.out.println("!!!!!!!!!!!!!");
	}
	
	public void reading() {
		System.out.println("accessing details of fuel");
		Brand brand=new Brand("hp", "567BBBDF7779G1VK", "aldhal", "7star");
		brand.showOff();
		System.out.println("special fuel "+this.special);
		System.out.println("fuel price "+this.price);
		System.out.println("fuel quantity "+this.quantity);
		System.out.println("fuel type "+this.type);
	}

}
