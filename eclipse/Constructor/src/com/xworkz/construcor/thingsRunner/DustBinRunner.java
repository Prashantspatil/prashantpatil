package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class DustBinRunner {

	public static void main(String[] args) {

		DustBin madeoff = new DustBin();
		System.out.println("dustbin material : " + madeoff.material);
		
		DustBin hesuru = new DustBin();
		System.out.println("dustbin name : " + hesuru.name);
		
		DustBin reuse = new DustBin();
		System.out.println("dustbin is : " + reuse.type);
		
		DustBin decay = new DustBin();
		System.out.println("dustbin is ecoFriendly : " + decay.ecoFriendly);
		
		DustBin duddu = new DustBin();
		System.out.println("dustbin price is : " + duddu.price);
		
		DustBin costFree = new DustBin();
		System.out.println("dustbin is free of cost : " + costFree.freeOfCost);
		
		DustBin committe = new DustBin();
		System.out.println("dustbin provided by council : " + committe.council);
		
		DustBin location = new DustBin();
		System.out.println("name of place : " + location.place);
		
		DustBin localty = new DustBin();
		System.out.println("name of area : " + localty.area);

		DustBin badavane = new DustBin();
		System.out.println("default ward : " + badavane.ward);
		badavane.ward = 25;
		System.out.println("initialized ward : " + badavane.ward);
		
		DustBin state = new DustBin();
		System.out.println("default condition : " + state.condition);
		state.condition = "unbroken";
		System.out.println("initialized condition : " + state.condition);
		
		DustBin smell = new DustBin();
		System.out.println("default odour : " + smell.odour);
		smell.odour = "bad";
		System.out.println("initialized odour : " + smell.odour);
		
		DustBin cover = new DustBin();
		System.out.println("default value : " + cover.withCover);
		cover.withCover = true;
		System.out.println("initialized value : " + cover.withCover);
		
		DustBin look = new DustBin();
		System.out.println("default value : " + look.old);
		look.old = false;
		System.out.println("initialized value : " + look.old);
		
		DustBin company = new DustBin();
		System.out.println("default brand : " + company.brand);
		company.brand = "xyz";
		System.out.println("initialized brand : " + company.brand);
		
		DustBin sold = new DustBin();
		System.out.println("default units : " + sold.unitsSold);
		sold.unitsSold = 73490L;
		System.out.println("initialized units : " + sold.unitsSold);
		
		DustBin manufactured = new DustBin();
		System.out.println("default units : " + manufactured.unitsManufactured);
		manufactured.unitsManufactured = 97403L;
		System.out.println("initialized units : " + manufactured.unitsManufactured);
		
		DustBin damage = new DustBin();
		System.out.println("default pieces : " + damage.damagedPiece);
		damage.damagedPiece = 15000;
		System.out.println("initialized pieces : " + damage.damagedPiece);

	}

}
