package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.LunchCatering;
import com.xworkz.inheritance.things.Catering;

public class CateringRunner {

	public static void main(String[] args) {
		
		Catering catering=new Catering("bombat bhojana", 15, 20.00);
		catering.showCatering();
		System.out.println("food prepared");
		
		System.out.println(System.lineSeparator());
		
		LunchCatering catering2=new LunchCatering("ruchi", 20, 15.00);
		catering2.showMenue();
		System.out.println("lunch over");
		
	}

}
