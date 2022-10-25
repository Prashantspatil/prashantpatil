package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {
		
		Saloon saloon=new Saloon(true);
		saloon.units=25;
		saloon.setPrice(2500);
		saloon.displayBill();
		saloon.hairStyleNodu();

	}

}
