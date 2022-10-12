package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class CigaretteRunner {

	public static void main(String[] args) {

		Cigarette hesaru;
		hesaru = new Cigarette();
		System.out.println("name of the cigarette : " + hesaru.name);
		
		Cigarette company = new Cigarette();
		System.out.println("brand of cigarette is : " + company.brand);
		
		Cigarette cost = new Cigarette();
		System.out.println("price of cigarette is : " + cost.price);
		
		Cigarette makers = new Cigarette();
		System.out.println("cigarette manufacturers : " + makers.manufacturer);
		
		Cigarette year = new Cigarette();
		System.out.println("manufacturing since : " + year.since);
		
		Cigarette country = new Cigarette();
		System.out.println("main market : " + country.market);
		
		Cigarette tournment = new Cigarette();
		System.out.println("sponsered for : " + tournment.sponsorShip);
		
		Cigarette tag = new Cigarette();
		System.out.println("sold under : " + tag.soldUnder);
		
		Cigarette measure = new Cigarette();
		System.out.println("cigarette length : " + measure.length);

		Cigarette dia = new Cigarette();
		System.out.println("default radius : " + dia.radius);
		dia.radius = 5.0;
		System.out.println("initiated radius : " + dia.radius);
		
		Cigarette closed = new Cigarette();
		System.out.println("default value : " + closed.packaged);
		closed.packaged = true;
		System.out.println("initialized value : " + closed.packaged);
		
		Cigarette pack = new Cigarette();
		System.out.println("default units : " + pack.unitsInPack);
		pack.unitsInPack = 10;
		System.out.println("initialized units : " + pack.unitsInPack);
		
		Cigarette sold = new Cigarette();
		System.out.println("default units : " + sold.unitsSold);
		sold.unitsSold = 73490L;
		System.out.println("initialized units : " + sold.unitsSold);
		
		Cigarette manufactured = new Cigarette();
		System.out.println("default units : " + manufactured.unitsManufactured);
		manufactured.unitsManufactured = 97403L;
		System.out.println("initialized units : " + manufactured.unitsManufactured);
		
		Cigarette intake = new Cigarette();
		System.out.println("default importer : " + intake.importer);
		intake.importer = "India";
		System.out.println("initialized importer : " + intake.importer);
		
		Cigarette outPut = new Cigarette();
		System.out.println("default exporter : " + outPut.exporter);
		outPut.exporter = "Russia";
		System.out.println("initialized exporter : " + outPut.exporter);
		
		Cigarette sign = new Cigarette();
		System.out.println("default symbol : " + sign.symbol);
		sign.symbol = 'G';
		System.out.println("initialized symbol : " + sign.symbol);
		
		Cigarette affect = new Cigarette();
		System.out.println("default affect : " + affect.cancer);
		affect.cancer = true;
		System.out.println("initialized affect : " + affect.cancer);
		
	}

}
