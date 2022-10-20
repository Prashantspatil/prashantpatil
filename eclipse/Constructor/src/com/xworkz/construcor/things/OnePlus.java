package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Model;

public class OnePlus {

	public String name;
	public double price;
	public int rom;
	public String color;
	public Model model = Model.SEVEN;
	public int[] ram;
	public int[] varient;
	public String[] market;
	public double[] revenue;
	public float[] tax;
	public short[] year;

	public OnePlus(String name, double price, int rom, String color, Model model, int[] ram, int[] varient,
			String[] market, double[] revenue, float[] tax, short[] year) {
		super();
		this.name = name;
		this.price = price;
		this.rom = rom;
		this.color = color;
		this.model = model;
		this.ram = ram;
		this.varient = varient;
		this.market = market;
		this.revenue = revenue;
		this.tax = tax;
		this.year = year;
	}

	public void showDetails() {

		System.out.println("name : " + this.name);
		System.out.println("price : " + this.price);
		System.out.println("rom : " + this.rom);
		System.out.println("color : " + this.color);
		System.out.println("model : " + this.model);
		System.out.println(this.ram);
		System.out.println(this.varient);
		System.out.println(this.market);
		System.out.println(this.revenue);
		System.out.println(this.tax);
		System.out.println(this.year);

		for (int i = 0; i < this.ram.length; i++) {
			int string = this.ram[i];
			System.out.println("ram : " + string);
		}
		for (int i = 0; i < this.varient.length; i++) {
			int string = this.varient[i];
			System.out.println("varient : " + string);
		}
		for (int i = 0; i < this.market.length; i++) {
			String string = this.market[i];
			System.out.println("market : " + string);
		}
		for (int i = 0; i < this.revenue.length; i++) {
			double string = this.revenue[i];
			System.out.println("revenue : " + string);
		}
		for (int i = 0; i < this.tax.length; i++) {
			float string = this.tax[i];
			System.out.println("tax : " + string);
		}
		for (int i = 0; i < this.year.length; i++) {
			short string = this.year[i];
			System.out.println("year : " + string);
		}

	}

}
