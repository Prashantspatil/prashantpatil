package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Collection;

public class Nike {

	public String country;
	public int since;
	public String headQuarter;
	public String owner;
	public Collection filter = Collection.SHOES;
	public String[] market;
	public String[] ambassador;
	public int[] price;
	public int[] size;
	public double[] revenue;
	public double[] tax;

	public Nike(String country, int since, String headQuarter, String owner, Collection filter, String[] market,
			String[] ambassador, int[] price, int[] size, double[] revenue, double[] tax) {
		super();
		this.country = country;
		this.since = since;
		this.headQuarter = headQuarter;
		this.owner = owner;
		this.filter = filter;
		this.market = market;
		this.ambassador = ambassador;
		this.price = price;
		this.size = size;
		this.revenue = revenue;
		this.tax = tax;
	}

	public void showDetails() {

		System.out.println("country : " + this.country);
		System.out.println("since : " + this.since);
		System.out.println("hq : " + this.headQuarter);
		System.out.println("owner : " + this.owner);
		System.out.println("collection : " + this.filter);
		System.out.println(this.market);
		System.out.println(this.ambassador);
		System.out.println(this.price);
		System.out.println(this.size);
		System.out.println(this.revenue);
		System.out.println(this.tax);

		for (int i = 0; i < this.market.length; i++) {
			String string = this.market[i];
			System.out.println("market : " + string);
		}
		for (int i = 0; i < this.ambassador.length; i++) {
			String string = this.ambassador[i];
			System.out.println("ambassador : " + string);
		}
		for (int i = 0; i < this.price.length; i++) {
			int string = this.price[i];
			System.out.println("price : " + string);
		}
		for (int i = 0; i < this.size.length; i++) {
			int string = this.size[i];
			System.out.println("size : " + string);
		}
		for (int i = 0; i < this.revenue.length; i++) {
			double string = this.revenue[i];
			System.out.println("revenue : " + string);
		}
		for (int i = 0; i < this.tax.length; i++) {
			double string = this.tax[i];
			System.out.println("tax : " + string);
		}

	}

}
