package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.PoliticalParty;

public class Bjp extends PoliticalParty{
	
	public String president;
	
	public Bjp() {
		
	}

	public Bjp(boolean ruling, int states, String president) {
		super(ruling, states);
		this.president=president;
	}
	
	public void election() {
		super.election();
		System.out.println(this.president);
	}

}
