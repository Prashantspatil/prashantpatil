package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.Color;
import com.xworkz.construcor.things.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		
		Mango mango=new Mango(Color.YELLOW, "rajajinagar");
		mango.setPrice(2500);
		mango.quantity=35.00;
		mango.displayAmount();
		mango.mangoShowCase();

	}

}
