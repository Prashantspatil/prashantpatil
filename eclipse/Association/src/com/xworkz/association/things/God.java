package com.xworkz.association.things;

public class God {
	
	public String name;
	public String gender;
	public String power;
	public Weapon weapon;
	
	public God(String name, String gender, String power) {
		super();
		this.name = name;
		this.gender = gender;
		this.power = power;
	}
	
	public void show() {
		System.out.println("god name : "+name);
		System.out.println("gender : "+gender);
		System.out.println("power : "+power);
		Weapon weapon=new Weapon("veene", "music", 15.00);
		weapon.show();
	}

}
