package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Berth;
import com.xworkz.construcor.constants.Quota;

public class Railway {

	public Railway(String name, short trainNo, byte seats, Berth seatType, Quota quota, String[] station,
			String[] bogie, byte[] compartment, String[] catering, double[] price, String[] type) {
		super();
		this.name = name;
		this.trainNo = trainNo;
		this.seats = seats;
		this.seatType = seatType;
		this.quota = quota;
		this.station = station;
		this.bogie = bogie;
		this.compartment = compartment;
		this.catering = catering;
		this.price = price;
		this.type = type;
	}

	public String name;
	public short trainNo;
	public byte seats;
	public Berth seatType = Berth.LOWER;
	public Quota quota = Quota.GENERAL;
	public String[] station;
	public String[] bogie;
	public byte[] compartment;
	public String[] catering;
	public double[] price;
	public String[] type;

	public void showDetails() {

		System.out.println("train name : " + this.name);
		System.out.println("train no : " + this.trainNo);
		System.out.println("seats : " + this.seats);
		System.out.println("seat type : " + this.seatType);
		System.out.println("quota : " + this.quota);
		System.out.println("station : " + this.station);
		System.out.println("bogie : " + this.bogie);
		System.out.println("compartment : " + this.compartment);
		System.out.println("catering : " + this.catering);
		System.out.println("price : " + this.price);
		System.out.println("type : " + this.type);

		for (int i = 0; i < this.station.length; i++) {
			String string = this.station[i];
			System.out.println("station : " + string);
		}
		for (int i = 0; i < this.bogie.length; i++) {
			String string = this.bogie[i];
			System.out.println("bogie : " + string);
		}
		for (int i = 0; i < this.compartment.length; i++) {
			byte string = this.compartment[i];
			System.out.println("compartment : " + string);
		}
		for (int i = 0; i < this.catering.length; i++) {
			String string = this.catering[i];
			System.out.println("catering : " + string);
		}
		for (int i = 0; i < this.price.length; i++) {
			double string = this.price[i];
			System.out.println("price : " + string);
		}
		for (int i = 0; i < this.type.length; i++) {
			String string = this.type[i];
			System.out.println("train type : " + string);
		}

	}

}
