package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class RMDRunner {

	public static void main(String[] args) {

		RMD company = new RMD();
		System.out.println("brand of rmd : " + company.brand);
		
		RMD maalak = new RMD();
		System.out.println("owner of rmd : " + maalak.owner);
		
		RMD place = new RMD();
		System.out.println("birth place : " + place.birth);
		
		RMD masaala = new RMD();
		System.out.println("contain : " + masaala.panMasala);
		
		RMD duddu = new RMD();
		System.out.println("price is : " + duddu.price);
		
		RMD markets = new RMD();
		System.out.println("no of places : " + markets.places);
		
		RMD hq = new RMD();
		System.out.println("head quarter : " + hq.headQuarter);
		
		RMD sold = new RMD();
		System.out.println("units sold : " + sold.unitsSold);
		
		RMD manufactured = new RMD();
		System.out.println("units manufactured : " + manufactured.unitsManufactured);

		RMD size = new RMD();
		System.out.println("default size : " + size.particleSize);
		size.particleSize = 3.00;
		System.out.println("initialized size : " + size.particleSize);
		
		RMD intake = new RMD();
		System.out.println("default importer : " + intake.importer);
		intake.importer = "India";
		System.out.println("initialized importer : " + intake.importer);
		
		RMD outPut = new RMD();
		System.out.println("default exporter : " + outPut.exporter);
		outPut.exporter = "Russia";
		System.out.println("initialized exporter : " + outPut.exporter);
		
		RMD affect = new RMD();
		System.out.println("default affect : " + affect.cancer);
		affect.cancer = true;
		System.out.println("initialized affect : " + affect.cancer);
		
		RMD sign = new RMD();
		System.out.println("default symbol : " + sign.symbol);
		sign.symbol = 'R';
		System.out.println("initialized symbol : " + sign.symbol);
		
		RMD pack = new RMD();
		System.out.println("default pack price : " + pack.packPrice);
		pack.packPrice = 120;
		System.out.println("initialized pack price : " + pack.packPrice);
		
		RMD father = new RMD();
		System.out.println("default father name : " + father.ownerFather);
		father.ownerFather = "Modi";
		System.out.println("initialized father name : " + father.ownerFather);
		
		RMD mother = new RMD();
		System.out.println("default mother name : " + mother.ownerMother);
		mother.ownerMother = "Sonia";
		System.out.println("initialized mother name : " + mother.ownerMother);
		
		RMD bro = new RMD();
		System.out.println("default bro name : " + bro.ownerBrother);
		bro.ownerBrother = "Rahul";
		System.out.println("initialized bro name : " + bro.ownerBrother);

	}

}
