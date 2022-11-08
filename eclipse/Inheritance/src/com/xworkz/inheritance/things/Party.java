package com.xworkz.inheritance.things;

public class Party {
	
	public String pub;
	public int friends;
	public double expenditure;
	
	public Party() {
		
	}

	public Party(String pub, int friends, double expenditure) {
		super();
		this.pub = pub;
		this.friends = friends;
		this.expenditure = expenditure;
	}
	
	public void stageOn() {
		System.out.println("party started");
		System.out.println(pub);
		System.out.println(friends);
		System.out.println(expenditure);
	}

}
