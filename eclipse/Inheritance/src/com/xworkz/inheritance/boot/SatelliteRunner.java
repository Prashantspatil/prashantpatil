package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Moon;
import com.xworkz.inheritance.things.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		
		Satellite satellite=new Moon(1, "isro", 24);
		satellite.revolve();
		System.out.println(System.lineSeparator());
		Moon moon=new Moon(2, "sriharikhota", 23);
		moon.revolve();

	}

}
