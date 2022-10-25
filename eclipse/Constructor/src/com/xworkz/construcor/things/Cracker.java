package com.xworkz.construcor.things;

public class Cracker {
	
	public static String festival;
	public boolean pollution;
	public int price;
	public double quantity;
	public char governmentSymbol;
	
	public Cracker(boolean pollution, double quantity) {
		super();
		this.pollution = pollution;
		this.quantity = quantity;
	}
	
	static {
		festival="deepavali";
	}
	
	public void setPrice(int price,char governmentSymbol) {
		this.price=price;
	}
	
	public void displayAmount() {
		double amount=this.price*this.quantity;
		System.out.println("total amount : "+amount);
	}
	
	public void light() {
		System.out.println("festival name : "+Cracker.festival);
		System.out.println("causes pollutuion "+this.pollution);
		System.out.println("price : "+this.price);
		System.out.println("quantity : "+this.quantity);
		System.out.println("symbol : "+this.governmentSymbol);
	}

}
