package com.xworkz.construcor.constants;

public enum Numbers {
	
	ONE(1,49),TWO(2,59),THREE(3,69),HUNDRED(100,1499);
	
	public int no;
	public int price;
	
	private Numbers(int no, int price) {
		this.no = no;
		this.price = price;
	}
	
}
