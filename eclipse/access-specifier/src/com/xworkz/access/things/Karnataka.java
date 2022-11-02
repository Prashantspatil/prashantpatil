package com.xworkz.access.things;

public class Karnataka {
	
	public String name="sirigannada";
	public Yadgir yadgir=new Yadgir("venkatreddy", 585202, 1.50, 7, "amaresh", "girinadu", 25);

	public void view() {
		System.out.println(this.name);
		if (this.yadgir!=null) {
			System.out.println(this.yadgir);
			System.out.println(yadgir.fame);
			System.out.println(yadgir.mla);
			System.out.println(yadgir.mp);
			System.out.println(yadgir.pinCode);
			System.out.println(yadgir.population);
			System.out.println(yadgir.taluqs);
			System.out.println(yadgir.zpMembers);
			
			System.out.println(yadgir.getDc());
			yadgir.setDc("prashant");
			System.out.println("modified " + yadgir.getDc());
			
			System.out.println(yadgir.getMainCircle());
			yadgir.setMainCircle("bhaghat");
			System.out.println("modified " + yadgir.getMainCircle());
			
			System.out.println(yadgir.getVoting());
			yadgir.setVoting(1.05);
			System.out.println("modified " + yadgir.getVoting());
			
			System.out.println(yadgir.isRailwayStation());
			yadgir.setRailwayStation(true);
			System.out.println("modified " + yadgir.isRailwayStation());
		}
		else {
			System.out.println("yadgir is null");
		}
	}
}
