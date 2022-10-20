package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Varient;

public class Scooty {

	public String name;
	public String company;
	public int model;
	public double price;
	public Varient type = Varient.DRUM;
	public String[] color;
	public String[] showRoom;
	public double[] showRoomRate;
	public short[] year;
	public String[] place;
	public double[] gst;

	public Scooty(String name, String company, int model, double price, Varient type, String[] color, String[] showRoom,
			double[] showRoomRate, short[] year, String[] place, double[] gst) {
		super();
		this.name = name;
		this.company = company;
		this.model = model;
		this.price = price;
		this.type = type;
		this.color = color;
		this.showRoom = showRoom;
		this.showRoomRate = showRoomRate;
		this.year = year;
		this.place = place;
		this.gst = gst;
	}

	public void showDetails() {

		System.out.println("name : " + this.name);
		System.out.println("company : " + this.company);
		System.out.println("model : " + this.model);
		System.out.println("price : " + this.price);
		System.out.println("type : " + this.type);
		System.out.println(this.color);
		System.out.println(this.showRoom);
		System.out.println(this.showRoomRate);
		System.out.println(this.year);
		System.out.println(this.place);
		System.out.println(this.gst);

		for (int i = 0; i < this.color.length; i++) {
			String string = this.color[i];
			System.out.println("color : " + string);
		}
		for (int i = 0; i < this.showRoom.length; i++) {
			String string = this.showRoom[i];
			System.out.println("show room : " + string);
		}
		for (int i = 0; i < this.showRoomRate.length; i++) {
			double string = this.showRoomRate[i];
			System.out.println("showroom rate : " + string);
		}
		for (int i = 0; i < this.year.length; i++) {
			short string = this.year[i];
			System.out.println("year : " + string);
		}
		for (int i = 0; i < this.place.length; i++) {
			String string = this.place[i];
			System.out.println("place : " + string);
		}
		for (int i = 0; i < this.gst.length; i++) {
			double string = this.gst[i];
			System.out.println("gst : " + string);
		}

	}

}
