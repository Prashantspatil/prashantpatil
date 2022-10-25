package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.Color;
import com.xworkz.construcor.things.ShirtBrand;

public class ShirtBrandRunner {

	public static void main(String[] args) {
		
		ShirtBrand shirtBrand=new ShirtBrand(Color.YELLOW, "t-shirt");
		shirtBrand.setPrice(2500);
		shirtBrand.quantity=35.00;
		shirtBrand.displayAmount();
		shirtBrand.ShirtBrandShowCase();

	}

}
