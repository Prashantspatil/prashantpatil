package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.Berth;
import com.xworkz.construcor.constants.Quota;
import com.xworkz.construcor.things.Railway;

public class RailwayRunner {

	public static void main(String[] args) {

		short no = 13113;
		byte seat = 72;
		String[] stations = { "glb", "rai", "blr", "mys" };
		String[] bogies = { "1A", "2A", "3A", "SL", "GA" };
		byte[] compartments = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] foodItems = { "rice", "chapathi", "sambar", "curry" };
		double[] prices = { 280.00, 750.00, 980.00, 1500.00, 2100.00 };
		String[] types = { "vande bharat", "super mail", "intercity" };

		Railway railway = new Railway("slr-ypr", no, seat, Berth.LOWER, Quota.GENERAL, stations, bogies, compartments,
				foodItems, prices, types);
		railway.showDetails();

	}

}
