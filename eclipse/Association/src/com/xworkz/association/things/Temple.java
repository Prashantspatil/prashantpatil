package com.xworkz.association.things;

public class Temple {
	
	public String name;
	public God god;
	public String pujari;
	public int visiters;
	
	public Temple(String name, String pujari, int visiters) {
		super();
		this.name = name;
		this.pujari = pujari;
		this.visiters = visiters;
	}
	
	public void show() {
		System.out.println("temple name : "+name);
		System.out.println("temple pujari : "+pujari);
		System.out.println("no of visiters : "+visiters);
		God god=new God("saraswati", "female", "vidhye");
		god.show();
	}

}
