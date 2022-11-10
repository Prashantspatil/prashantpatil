package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.ShoppingMall;

public class OrionMall extends ShoppingMall{
	
	public int since;
	
	public OrionMall() {
		
	}

	public OrionMall(String landMark, int streetNo, int since) {
		super(landMark, streetNo);
		this.since=since;
	}
	
	public void mallOpen() {
		super.mallOpen();
		System.out.println(this.since);
	}

}
