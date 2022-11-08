package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Catering;

public class LunchCatering extends Catering{
	
	public LunchCatering() {
		
	}

	public LunchCatering(String crew, int members, double fees) {
		super(crew, members, fees);
	}
	
    public void showMenue() {
    	System.out.println("lunch started");
    	System.out.println(crew);
    	System.out.println(members);
    	System.out.println(fees);
    }
	
}
