package com.xworkz.inheritance.things;

public class Home {
	
	public String area;
	public double rent;
	public int sharing;
	
	public Home() {
		
	}

	public Home(String area, double rent, int sharing) {
		super();
		this.area = area;
		this.rent = rent;
		this.sharing = sharing;
	}
	
	public void share() {
		System.out.println(area);
		System.out.println(rent);
		System.out.println(sharing);
	}
	
	public void wifi() {
		System.out.println("!!!!!!!!!!!!");
	}

}
