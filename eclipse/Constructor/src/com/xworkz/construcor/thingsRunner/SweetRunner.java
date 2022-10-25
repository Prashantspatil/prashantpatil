package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.Color;
import com.xworkz.construcor.things.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		
		Sweet sweet=new Sweet("dharwad peda", Color.BLUE);
		sweet.quantity=275.00;//reference initialization
		sweet.setPrice(300);
		sweet.displayTotalPrice();
		sweet.sweetNodu();

	}

}
