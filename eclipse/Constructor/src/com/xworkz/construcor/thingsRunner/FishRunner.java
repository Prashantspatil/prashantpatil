package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class FishRunner {

	public static void main(String[] args) {

		Fish fishDetail = new Fish("Salmon");
		System.out.println("initialised fish name : " + fishDetail.name);
		System.out.println("default fish type : " + fishDetail.type);
		System.out.println("default fish price : " + fishDetail.price);
		System.out.println("default fish weight : " + fishDetail.weight);
		System.out.println("default fish length : " + fishDetail.length);

		Fish fish = new Fish("Jawless", 1.5F);
		System.out.println("default fish name : " + fish.name);
		System.out.println("initialised fish type : " + fish.type);
		System.out.println("default fish price : " + fish.price);
		System.out.println("initialised fish weight : " + fish.weight);
		System.out.println("default fish length : " + fish.length);

		Fish fish2 = new Fish(120);
		System.out.println("default fish name : " + fish2.name);
		System.out.println("default fish type : " + fish2.type);
		System.out.println("initialised fish price : " + fish2.price);
		System.out.println("default fish weight : " + fish2.weight);
		System.out.println("default fish length : " + fish2.length);

		Fish fish3 = new Fish("Selmon", "Jawless");
		System.out.println("initialised fish name : " + fish3.name);
		System.out.println("initialised fish type : " + fish3.type);
		System.out.println("default fish price : " + fish3.price);
		System.out.println("default fish weight : " + fish3.weight);
		System.out.println("default fish length : " + fish3.length);

		Fish fish4 = new Fish("Selmon", 120);
		System.out.println("initialised fish name : " + fish4.name);
		System.out.println("default fish type : " + fish4.type);
		System.out.println("initialised fish price : " + fish4.price);
		System.out.println("default fish weight : " + fish4.weight);
		System.out.println("default fish lenght : " + fish4.length);

		Fish fish5 = new Fish(120, 1.5F);
		System.out.println("default fish name : " + fish5.name);
		System.out.println("default fish type : " + fish5.type);
		System.out.println("initialised fish price : " + fish5.price);
		System.out.println("initialised fish weight : " + fish5.weight);
		System.out.println("default fish length : " + fish5.length);

		Fish fish6 = new Fish(1.50F, 55.50F);
		System.out.println("default fish name : " + fish6.name);
		System.out.println("default fish type : " + fish6.type);
		System.out.println("default fish price : " + fish6.price);
		System.out.println("initialised fish weight : " + fish6.weight);
		System.out.println("initialised fish length : " + fish6.length);

		Fish fish7 = new Fish(120, "Selmon");
		System.out.println("initialised fish name : " + fish7.name);
		System.out.println("default fish type : " + fish7.type);
		System.out.println("initialised fish price : " + fish7.price);
		System.out.println("default fish weight : " + fish7.weight);
		System.out.println("default fish length : " + fish7.length);
		
	}

}
