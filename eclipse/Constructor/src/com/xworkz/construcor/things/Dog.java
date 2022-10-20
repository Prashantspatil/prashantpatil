package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Breeder;

public class Dog {

	public String breed;
	public String gender;
	public int age;
	public int fingers;
	public Breeder animals=Breeder.DOG;
	public String[] country;
	public String[] talent;
	public String[] type;
	public String[] petNames;
	public String[] color;
	public double[] price;

	public Dog(String breed, String gender, int age, int fingers, Breeder animals, String[] country, String[] talent,
			String[] type, String[] petNames, String[] color, double[] price) {
		super();
		this.breed = breed;
		this.gender = gender;
		this.age = age;
		this.fingers = fingers;
		this.animals = animals;
		this.country = country;
		this.talent = talent;
		this.type = type;
		this.petNames = petNames;
		this.color = color;
		this.price = price;
	}

	public void showDetails() {

		System.out.println("breed : " + this.breed);
		System.out.println("gender : " + this.gender);
		System.out.println("age : " + this.age);
		System.out.println("fingers : " + this.fingers);
		System.out.println("animal : " + this.animals);
		System.out.println(this.country);
		System.out.println(this.talent);
		System.out.println(this.type);
		System.out.println(this.petNames);
		System.out.println(this.color);
		System.out.println(this.price);

		for (int i = 0; i < this.country.length; i++) {
			String string = this.country[i];
			System.out.println("country : " + string);
		}
		for (int i = 0; i < this.talent.length; i++) {
			String string = this.talent[i];
			System.out.println("talent : " + string);
		}
		for (int i = 0; i < this.type.length; i++) {
			String string = this.type[i];
			System.out.println("type : " + string);
		}
		for (int i = 0; i < this.petNames.length; i++) {
			String string = this.petNames[i];
			System.out.println("pet names : " + string);
		}
		for (int i = 0; i < this.color.length; i++) {
			String string = this.color[i];
			System.out.println("color : " + string);
		}
		for (int i = 0; i < this.price.length; i++) {
			double string = this.price[i];
			System.out.println("price : " + string);
		}

	}

}
