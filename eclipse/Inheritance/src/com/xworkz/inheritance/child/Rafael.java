package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.WarJet;

public class Rafael extends WarJet{
	
	public String borrower;
	
	public Rafael() {
		
	}

	public Rafael(String country, int units, double budget, String borrower) {
		super(country, units, budget);
		this.borrower=borrower;
	}
	
	@Override
	public void war() {
		super.war();
		System.out.println(borrower);
	}
	
	public void khargil() {
		System.out.println("^^^^^^^^^^^^^^^^");
	}

}
