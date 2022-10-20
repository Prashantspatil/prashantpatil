package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.PaymentMode;
import com.xworkz.construcor.constants.Seat;

public class Airway {

	public Airway(String name, byte runWay, String airPort, Seat type, PaymentMode bill, String[] passanger,
			float[] luggage, String[] citizenShip, String[] currency, double[] exchangeRate, char[] seatCode) {
		super();
		this.name = name;
		this.runWay = runWay;
		this.airPort = airPort;
		this.type = type;
		this.bill = bill;
		this.passanger = passanger;
		this.luggage = luggage;
		this.citizenShip = citizenShip;
		this.currency = currency;
		this.exchangeRate = exchangeRate;
		this.seatCode = seatCode;
	}

	public String name;
	public byte runWay;
	public String airPort;
	public Seat type = Seat.BUSINESS_CLASS;
	public PaymentMode bill = PaymentMode.NET_BANKING;
	public String[] passanger;
	public float[] luggage;
	public String[] citizenShip;
	public String[] currency;
	public double[] exchangeRate;
	public char[] seatCode;

	public void showDetails() {

		System.out.println("name : " + this.name);
		System.out.println("run way : " + this.runWay);
		System.out.println("airport : " + this.airPort);
		System.out.println("seat type : " + this.type);
		System.out.println("billing : " + this.bill);
		System.out.println("passanger : " + this.passanger);
		System.out.println("weight : " + this.luggage);
		System.out.println("origin : " + this.citizenShip);
		System.out.println("currency : " + this.currency);
		System.out.println("ratio : " + this.exchangeRate);
		System.out.println("code : " + this.seatCode);

		for (int i = 0; i < this.passanger.length; i++) {
			String string = this.passanger[i];
			System.out.println("name : " + string);
		}
		for (int i = 0; i < this.luggage.length; i++) {
			float string = this.luggage[i];
			System.out.println("weight : " + string);
		}
		for (int i = 0; i < this.citizenShip.length; i++) {
			String string = this.citizenShip[i];
			System.out.println("origin : " + string);
		}
		for (int i = 0; i < this.currency.length; i++) {
			String string = this.currency[i];
			System.out.println("currency : " + string);
		}
		for (int i = 0; i < this.exchangeRate.length; i++) {
			double string = this.exchangeRate[i];
			System.out.println("ratio : " + string);
		}
		for (int i = 0; i < this.seatCode.length; i++) {
			char string = this.seatCode[i];
			System.out.println("codes : " + string);
		}

	}

}
