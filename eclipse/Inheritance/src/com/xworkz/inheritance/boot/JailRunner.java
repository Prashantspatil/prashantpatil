package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.CentralJail;
import com.xworkz.inheritance.things.DistrictJail;
import com.xworkz.inheritance.things.Jail;
import com.xworkz.inheritance.things.JuvenileJail;

public class JailRunner {

	public static void main(String[] args) {
		
		System.out.println("jail opened");
		Jail jail=new Jail();
		System.out.println(jail.name);
		System.out.println(jail.place);
		System.out.println("jail closed");
		
		System.out.println(System.lineSeparator());
		
		Jail jail2=new CentralJail();
		CentralJail centralJail=(CentralJail)jail2;
		System.out.println(centralJail.name);
		System.out.println(centralJail.place);
		System.out.println(centralJail.duration);
		System.out.println(centralJail.punishment);
		System.out.println("central jail closed");
		
		System.out.println(System.lineSeparator());
		
		Jail jail3=new JuvenileJail();
		JuvenileJail juvenileJail=(JuvenileJail)jail3;
		System.out.println(juvenileJail.name);
		System.out.println(juvenileJail.place);
		System.out.println(juvenileJail.accuss);
		System.out.println(juvenileJail.age);
		System.out.println("juvenile jail closed");
		
		System.out.println(System.lineSeparator());
		
		Jail jail4=new DistrictJail();
		DistrictJail districtJail=(DistrictJail)jail4;
		System.out.println(districtJail.name);
		System.out.println(districtJail.place);
		System.out.println(districtJail.jurisdiction);
		System.out.println(districtJail.noOfAccuss);
		System.out.println("district jail closed");

	}

}
