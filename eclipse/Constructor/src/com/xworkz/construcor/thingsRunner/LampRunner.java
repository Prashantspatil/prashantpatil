package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.Color;
import com.xworkz.construcor.things.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		
		Lamp lamp=new Lamp(Color.BLUE, "Surya");
		lamp.setPrice(2500);
		lamp.quantity=35.00;
		lamp.displayAmount();
		lamp.lampShowCase();

	}

}
