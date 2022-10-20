package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Bond;

public class Freinds {

	public String group;
	public int members;
	public int age;
	public Bond bonding = Bond.BRO_HOOD;
	public int since;
	public String[] name;
	public String[] degree;
	public long[] mobile;
	public String[] place;
	public String[] surname;
	public String[] petName;

	public Freinds(String group, int members, int age, Bond bonding, int since, String[] name, String[] degree,
			long[] mobile, String[] place, String[] surname, String[] petName) {
		super();
		this.group = group;
		this.members = members;
		this.age = age;
		this.bonding = bonding;
		this.since = since;
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		this.place = place;
		this.surname = surname;
		this.petName = petName;

	}

	public void showDetails() {

		System.out.println("group name : " + this.group);
		System.out.println("members : " + this.members);
		System.out.println("common age : " + this.age);
		System.out.println("bonding : " + this.bonding);
		System.out.println("since : " + this.since);
		System.out.println("name : " + this.name);
		System.out.println("degree : " + this.degree);
		System.out.println("no : " + this.mobile);
		System.out.println("native : " + this.place);
		System.out.println("surname : " + this.surname);
		System.out.println("pet name : " + this.petName);

		for (int i = 0; i < this.name.length; i++) {
			String string = this.name[i];
			System.out.println("name : " + string);
		}
		for (int i = 0; i < this.degree.length; i++) {
			String string = this.degree[i];
			System.out.println("degree : " + string);
		}
		for (int i = 0; i < this.mobile.length; i++) {
			long string = this.mobile[i];
			System.out.println("mobile : " + string);
		}
		for (int i = 0; i < this.place.length; i++) {
			String string = this.place[i];
			System.out.println("place : " + string);
		}
		for (int i = 0; i < this.surname.length; i++) {
			String string = this.surname[i];
			System.out.println("surname : " + string);
		}
		for (int i = 0; i < this.petName.length; i++) {
			String string = this.petName[i];
			System.out.println("pet name : " + string);
		}

	}

}
