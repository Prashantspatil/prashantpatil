package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Bjp;
import com.xworkz.inheritance.things.PoliticalParty;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		
		PoliticalParty party=new Bjp(true, 13, "nadda");
		party.election();
		System.out.println(System.lineSeparator());
		Bjp bjp=new Bjp(false, 17, "amit");
		bjp.election();

	}

}
