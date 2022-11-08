package com.xworkz.inheritance.things;

public class Dowry {
	
	public double quantity;
	public String side;
	public int installment;
	
	public Dowry() {
		
	}

	public Dowry(double quantity, String side, int installment) {
		super();
		this.quantity = quantity;
		this.side = side;
		this.installment = installment;
	}
	
	public void dowryOpen() {
		System.out.println("dowry lended");
		System.out.println(quantity);
		System.out.println(side);
		System.out.println(installment);
	}

}
