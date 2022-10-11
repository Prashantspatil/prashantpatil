package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		
		DistrictCollector vayassu = new DistrictCollector();
		System.out.println(vayassu.age);
		
		DistrictCollector hesuru = new DistrictCollector();
		System.out.println(hesuru.name);
		
		DistrictCollector district = new DistrictCollector();
		System.out.println(district.cadre);
		
		DistrictCollector passOut = new DistrictCollector();
		System.out.println(passOut.batchNO);
		
		vayassu.age = 30;
		System.out.println("dc at the age of : " + vayassu.age);
		
		hesuru.name = "Prashant";
		System.out.println("dc of yadgir is : " + hesuru.name);
		
		district.cadre = "Yadgir";
		System.out.println("appointed cadre is : " + district.cadre);
		
		passOut.batchNO = 2028;
		System.out.println("passout batch is : " + passOut.batchNO);
	}

}
