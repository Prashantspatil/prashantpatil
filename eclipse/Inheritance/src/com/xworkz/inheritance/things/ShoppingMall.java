package com.xworkz.inheritance.things;

public class ShoppingMall {
	
	public String landMark;
	public int streetNo;
	
	public ShoppingMall() {
		
	}
	
	public ShoppingMall(String landMark, int streetNo) {
		super();
		this.landMark=landMark;
		this.streetNo=streetNo;
	}
	
	public void mallOpen() {
		System.out.println("shopping mall open");
		System.out.println(this.landMark);
		System.out.println(this.streetNo);
	}

}
