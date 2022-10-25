package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.Color;
import com.xworkz.construcor.things.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		
		Flower flower=new Flower(Color.BLUE, "Chikmagaluru");
		flower.setPrice(2500);
		flower.quantity=35.00;
		flower.displayAmount();
		flower.flowerShowCase();

	}

}
