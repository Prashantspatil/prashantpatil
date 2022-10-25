package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.Color;
import com.xworkz.construcor.things.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		
		Milk milk=new Milk(Color.YELLOW, "jersey");
		milk.setPrice(2500);
		milk.quantity=35.00;
		milk.displayAmount();
		milk.MilkShowCase();

	}

}
