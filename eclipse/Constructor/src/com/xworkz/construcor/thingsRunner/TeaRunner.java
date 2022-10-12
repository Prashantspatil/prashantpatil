package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class TeaRunner {

	public static void main(String[] args) {
		
		System.out.println("initiated using literals");
		
		//another way of instantiation
		Tea brandName;
		brandName=new Tea();
		System.out.println("default tea brand is : "+brandName.brand);
		
		Tea productName = new Tea();
		System.out.println("default tea name is : "+productName.name);
		
		Tea unitPrice = new Tea();
		System.out.println("default tea price is : "+unitPrice.price);
		
		Tea unitWeight = new Tea();
		System.out.println("default tea packet weight is : "+unitWeight.weight);
		
		Tea mafDate = new Tea();
		System.out.println("default tea packet manufactured on : "+mafDate.dom);
		
		Tea expDate = new Tea();
		System.out.println("default tea packet expires on : "+expDate.doe);
		
		Tea teaType = new Tea();
		System.out.println("default type of tea is : "+teaType.type);
		
		Tea place = new Tea();
		System.out.println("default tea is grown in : "+place.origin);
		
		Tea giTag = new Tea();
		System.out.println("default tea has gi tag : "+giTag.geographicalIndicationTag);
		
		System.out.println("initiated using reference");
		
		Tea desh = new Tea();
		System.out.println("default country : "+desh.coutry);
		desh.coutry = "India";
		System.out.println("initialized country is : " + desh.coutry);
		
		Tea indication = new Tea();
		System.out.println("default symbol : "+indication.symbol);
		indication.symbol = 'C';
		System.out.println("initialized symbol of coorg tea is : " + indication.symbol);
		
		Tea size = new Tea();
		System.out.println("default value : "+size.particleSize);
		size.particleSize = 3.00;
		System.out.println("initialized particle size in nm : " + size.particleSize);
		
		Tea estate = new Tea();
		System.out.println("default estate : "+estate.teaEstate);
		estate.teaEstate = "Patil";
		System.out.println("initialized estate name : " + estate.teaEstate);
		
		Tea country = new Tea();
		System.out.println("default importer : "+country.importer);
		country.importer = "Russia";
		System.out.println("initialized coorg tea imported to : " + country.importer);
		
		Tea tax = new Tea();
		System.out.println("default tax value : "+tax.gst);
		tax.gst = 15;
		System.out.println("initialized gst on tea is : " + tax.gst);
		
		Tea pattern = new Tea();
		System.out.println("default crop type : "+pattern.cropType);
		pattern.cropType = "Rabi";
		System.out.println("initialized type tea is a : " + pattern.cropType);
		
		Tea sold = new Tea();
		System.out.println("default units sold : "+sold.unitsSold);
		sold.unitsSold = 734902L;
		System.out.println("initialized units sold : " + sold.unitsSold);
		
		Tea manufactured = new Tea();
		System.out.println("default units manufactured : "+manufactured.unitsManufactured);
		manufactured.unitsManufactured = 97403L;
		System.out.println("initialized units manufactured : " + manufactured.unitsManufactured);
		
	}

}
