package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Court;
import com.xworkz.inheritance.things.DistrictCourt;
import com.xworkz.inheritance.things.HighCourt;
import com.xworkz.inheritance.things.SupremeCourt;

public class CourtRunner {

	public static void main(String[] args) {
		
		System.out.println("Court started");
		Court court=new Court();
		System.out.println(court.moto);
		System.out.println(court.organ);
		System.out.println("Court adjourned");
		
		System.out.println(System.lineSeparator());
		
		Court court2=new SupremeCourt();
		SupremeCourt supremeCourt=(SupremeCourt)court2;
		System.out.println(supremeCourt.moto);
		System.out.println(supremeCourt.organ);
		System.out.println(supremeCourt.cji);
		System.out.println(supremeCourt.place);
		System.out.println("supremecourt adjourned");
		
		System.out.println(System.lineSeparator());
		
		Court court3=new HighCourt();
		HighCourt highCourt=(HighCourt)court3;
		System.out.println(highCourt.moto);
		System.out.println(highCourt.organ);
		System.out.println(highCourt.judgeBench);
		System.out.println(highCourt.place);
		System.out.println("highcourt adjourned");
		
		System.out.println(System.lineSeparator());
		
		Court court4=new DistrictCourt();
		DistrictCourt districtCourt=(DistrictCourt)court4;
		System.out.println(districtCourt.moto);
		System.out.println(districtCourt.organ);
		System.out.println(districtCourt.court);
		System.out.println(districtCourt.district);
		System.out.println("districtcourt adjourned");

	}

}
