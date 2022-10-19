package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class BikeRunner {

	public static void main(String[] args) {

		byte[] gears = { 1, 2, 3, 4, 5 };
		int[] ccs = { 110, 125, 150, 180, 200 };
		float[] mileages = { 29.0F, 30.0F, 31.0F, 32.0F, 33.0F, 34.0F };
		char[] codes = { 'a', 'b', 'c', 'd', 'e' };
		String[] colors = { "white", "black", "red", "purple", "violet" };
		short[] rtos = { 31, 32, 33, 34, 35 };
		Bike bike = new Bike("pulsor", "bajaj", 75.00, "2022", "apple", gears, ccs, mileages, codes, colors, rtos);
		bike.displayDetails();

	}

}
