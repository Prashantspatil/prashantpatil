package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;
import com.xworkz.construcor.constants.*;

public class ScootyRunner {

	public static void main(String[] args) {

		String[] colors = { "white", "blue", "black" };
		String[] showRooms = { "shah", "apple", "mudnal" };
		double[] showRoomRates = { 67.00, 68.00, 69.00 };
		short[] years = { 2020, 2021, 2022 };
		String[] places = { "yadgir", "shahapur", "surpur" };
		double[] gsts = { 7.50, 8.15, 13.15 };

		Scooty scooty = new Scooty("access", "suzuki", 2022, 1.12, Varient.DRUM, colors, showRooms, showRoomRates,
				years, places, gsts);

		scooty.showDetails();

	}

}
