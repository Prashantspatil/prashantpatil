package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class BusRunner {

	public static void main(String[] args) {
		Bus gaadiNo = new Bus();
		System.out.println(gaadiNo.no);

		Bus initial = new Bus();
		System.out.println(initial.starting);

		Bus last = new Bus();
		System.out.println(last.destination);

		gaadiNo.no = 33;
		System.out.println("namma bus number : " + gaadiNo.no);

		initial.starting = "Shahapur";
		System.out.println("the starting point is : " + initial.starting);

		last.destination = "Bendakaluru";
		System.out.println("the last point is : " + last.destination);

		gaadiNo.no = 55;
		System.out.println("avr bus number : " + gaadiNo.no);

		initial.starting = "Bendakaluru";
		System.out.println("second starting point is : " + initial.starting);

		last.destination = "Mysore";
		System.out.println("destiny of my life journey : " + last.destination);
	}

}
