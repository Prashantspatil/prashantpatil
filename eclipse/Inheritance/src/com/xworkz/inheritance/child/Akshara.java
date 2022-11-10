package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.HR;

public class Akshara extends HR{
	
	public String place;

	public Akshara() {
		super();
	}
	
	public Akshara(String role, String company, double ctc, String place) {
		super(role, company, ctc);
		this.place=place;
	}
	
	@Override
	public void hire() {
		super.hire();
		System.out.println(place);
		System.out.println("!!!!!!!!!!!");
	}
		
		public void offer() {
			System.out.println("~~~~~~~~~");
		}


}
