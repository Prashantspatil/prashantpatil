package com.xworkz.construcor.things;

public class Car {
	
	public int gears;
	public int airBags;
	public String model;
	public double price;
	public int seater;
	public String[] name;
	public String[] brand;
	public String[] market;
	public String[] showRoom;
	public String[] owner;
	public String[] fuelType;
	
	public Car(int gears,int airBags,String model,double price,int seater,String[] name,String[] brand,String[] market,String[] showRoom,String[] owner,String[] fuelType) {
	this.gears=gears;
	this.airBags=airBags;
	this.model=model;
	this.price=price;
	this.seater=seater;
	this.name=name;
	this.brand=brand;
	this.market=market;
	this.showRoom=showRoom;
	this.owner=owner;
	this.fuelType=fuelType;
	}
	
	public void displayDetails() {
		System.out.println("gears : "+this.gears);
		System.out.println(this.airBags);
		System.out.println(this.model);
		System.out.println(this.price);
		System.out.println(this.seater);
		System.out.println(this.name);
		System.out.println(this.brand);
		System.out.println(this.market);
		System.out.println(this.showRoom);
		System.out.println(this.owner);
		System.out.println(this.fuelType);
		
		for (int i = 0; i < this.name.length; i++) {
			String string=this.name[i];
			System.out.println("name : "+string);
		} 
		for (int i = 0; i <this.brand.length; i++) {
			String string=this.brand[i];
			System.out.println("brand : "+string);
		}
		for (int i = 0; i < this.market.length; i++) {
			String string = this.market[i];
			System.out.println("market : "+string);
		}
		for (int i = 0; i < this.showRoom.length; i++) {
			String string = this.showRoom[i];
			System.out.println("showRoom : "+string);
		}
		for (int i = 0; i < this.owner.length; i++) {
			String string = this.owner[i];
			System.out.println("owner : "+string);
		}
		for (int i = 0; i < this.fuelType.length; i++) {
			String string = this.fuelType[i];
			System.out.println("fuel type : "+string);
		}
			
		}

}
