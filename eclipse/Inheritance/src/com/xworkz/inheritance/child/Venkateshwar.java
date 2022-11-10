package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.PetrolBunk;

public class Venkateshwar extends PetrolBunk{
	
	public boolean eco;
	
	public Venkateshwar() {
		
	}

	public Venkateshwar(String location, double investment, String type, boolean eco) {
		super(location, investment, type);
		this.eco=eco;
	}
	
	@Override
	public void petrol() {
		super.petrol();
		System.out.println(eco);
	}
	
	public void diesel() {
		System.out.println("&&&&&&&&&&&");
	}

}
