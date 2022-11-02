package com.xworkz.access.boot;

import com.xworkz.access.things.EleVehicle;
import com.xworkz.access.things.Tata;

public class TataRunner {

	public static void main(String[] args) {
		
		Tata tata=new Tata();
		EleVehicle eleVehicle=new EleVehicle(1.00, 05, "ratan", 2.00, true, "delhi", "haryana", "india");
		
		System.out.println(tata.continent);
		System.out.println(tata.eleVehicle);
		System.out.println(eleVehicle.getCompany());
		System.out.println(eleVehicle.getType());
		System.out.println(eleVehicle.getName());
		
		tata.release();


	}

}
