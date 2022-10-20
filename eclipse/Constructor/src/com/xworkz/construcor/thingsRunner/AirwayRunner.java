package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.constants.PaymentMode;
import com.xworkz.construcor.constants.Seat;
import com.xworkz.construcor.things.*;

public class AirwayRunner {

	public static void main(String[] args) {

		byte no = 34;
		String[] passangers = { "prashant", "jagadeesh", "rudra", "jaideep" };
		float[] weight = { 1.22f, 1.23f, 1.24f, 1.25f };
		String[] origin = { "ind", "us", "china", "afg" };
		String[] currencies = { "indrupee", "dollar", "yen", "afghani" };
		double[] ratio = { 1.00, 2.00, 3.00, 4.00 };
		char[] codes = { 'a', 'b', 'c', 'd' };

		Airway airway = new Airway("airindia", no, "kempegowda", Seat.ECONOMY_CLASS, PaymentMode.NET_BANKING,
				passangers, weight, origin, currencies, ratio, codes);

		airway.showDetails();

	}

}
