package com.xworkz.construcor.things;

public class Bike {

	public String name;
	public String brand;
	public double price;
	public String model;
	public String showRoom;
	public byte[] gear;
	public int[] cc;
	public float[] mileage;
	public char[] code;
	public String[] color;
	public short[] rto;

	public Bike(String name, String brand, double price, String model, String showRoom, byte[] gear, int[] cc,
			float[] mileage, char[] code, String[] color, short[] rto) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.showRoom = showRoom;
		this.gear = gear;
		this.cc = cc;
		this.mileage = mileage;
		this.code = code;
		this.color = color;
		this.rto = rto;

	}

	public void displayDetails() {
		System.out.println("name : " + this.name);
		System.out.println("brand : " + this.brand);
		System.out.println("price : " + this.price);
		System.out.println("model : " + this.model);
		System.out.println("showroom : " + this.showRoom);
		System.out.println("gear : " + this.gear);
		System.out.println("cc : " + this.cc);
		System.out.println("mileage : " + this.mileage);
		System.out.println("code : " + this.code);
		System.out.println("color : " + this.color);
		System.out.println("rto : " + this.rto);

		for (int i = 0; i < this.gear.length; i++) {
			int j = this.gear[i];
			System.out.println("gear : " + j);
		}
		for (int i = 0; i < this.cc.length; i++) {
			int j = this.cc[i];
			System.out.println("cc : " + j);
		}
		for (int i = 0; i < this.mileage.length; i++) {
			float j = this.mileage[i];
			System.out.println("mileage : " + j);
		}
		for (int i = 0; i < this.code.length; i++) {
			int j = this.code[i];
			System.out.println("code : " + j);
		}
		for (int i = 0; i < this.color.length; i++) {
			String string = this.color[i];
			System.out.println("color : " + string);
		}
		for (int i = 0; i < this.rto.length; i++) {
			int string = this.rto[i];
			System.out.println("rto : " + string);
		}
	}

}
