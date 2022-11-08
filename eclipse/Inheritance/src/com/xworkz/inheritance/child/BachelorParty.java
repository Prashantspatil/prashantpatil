package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Party;

public class BachelorParty extends Party{
	
	public BachelorParty() {
		
	}
	
	public BachelorParty(String pub, int friends, double expenditure) {
		super(pub, friends, expenditure);
	}

	public void bachelorOn() {
		System.out.println("still bachelor");
		System.out.println(pub);
		System.out.println(friends);
		System.out.println(expenditure);
	}
	
}
