package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.BachelorParty;
import com.xworkz.inheritance.things.Party;

public class PartyRunner {

	public static void main(String[] args) {
		
		Party party=new Party("bachelor pride", 10, 25.00);
		party.stageOn();
		System.out.println("party over");
		
		System.out.println(System.lineSeparator());
		
		BachelorParty party2=new BachelorParty("groom boom", 15, 20.00);
		party2.bachelorOn();
		System.out.println("bachelor to groom");

	}

}
