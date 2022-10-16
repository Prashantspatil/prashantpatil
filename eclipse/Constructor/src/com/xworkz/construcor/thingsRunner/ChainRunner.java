package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class ChainRunner {

	public static void main(String[] args) {

		Chain chain = new Chain();
		System.out.println("type : " + chain.type);
		System.out.println("material : " + chain.material);
		System.out.println("used for : " + chain.usedFor);
		System.out.println("stolen : " + chain.stolen);
		System.out.println("fresh : " + chain.fresh);
		System.out.println("price : " + chain.price);
		System.out.println("length : " + chain.length);
		System.out.println("weight : " + chain.weight);

		Chain chain2 = new Chain("Byzantine Chain");
		System.out.println(System.lineSeparator());
		System.out.println("type : " + chain2.type);
		System.out.println("material : " + chain2.material);
		System.out.println("used for : " + chain2.usedFor);
		System.out.println("stolen : " + chain2.stolen);
		System.out.println("fresh : " + chain2.fresh);
		System.out.println("price : " + chain2.price);
		System.out.println("length : " + chain2.length);
		System.out.println("weight : " + chain2.weight);

		Chain chain3 = new Chain("Byzantine", "Diamond");
		System.out.println(System.lineSeparator());
		System.out.println("type : " + chain3.type);
		System.out.println("material : " + chain3.material);
		System.out.println("used for : " + chain3.usedFor);
		System.out.println("stolen : " + chain3.stolen);
		System.out.println("fresh : " + chain3.fresh);
		System.out.println("price : " + chain3.price);
		System.out.println("length : " + chain3.length);
		System.out.println("weight : " + chain3.weight);

		Chain chain4 = new Chain("Byzantine", "Diamond", "Festive");
		System.out.println(System.lineSeparator());
		System.out.println("type : " + chain4.type);
		System.out.println("material : " + chain4.material);
		System.out.println("used for : " + chain4.usedFor);
		System.out.println("stolen : " + chain4.stolen);
		System.out.println("fresh : " + chain4.fresh);
		System.out.println("price : " + chain4.price);
		System.out.println("length : " + chain4.length);
		System.out.println("weight : " + chain4.weight);

		Chain chain5 = new Chain("Byzantine", "Diamond", "Festive", false);
		System.out.println(System.lineSeparator());
		System.out.println("type : " + chain5.type);
		System.out.println("material : " + chain5.material);
		System.out.println("used for : " + chain5.usedFor);
		System.out.println("stolen : " + chain5.stolen);
		System.out.println("fresh : " + chain5.fresh);
		System.out.println("price : " + chain5.price);
		System.out.println("length : " + chain5.length);
		System.out.println("weight : " + chain5.weight);

		Chain chain6 = new Chain("Byzantine", "Diamond", "Festive", false, false);
		System.out.println(System.lineSeparator());
		System.out.println("type : " + chain6.type);
		System.out.println("material : " + chain6.material);
		System.out.println("used for : " + chain6.usedFor);
		System.out.println("stolen : " + chain6.stolen);
		System.out.println("fresh : " + chain6.fresh);
		System.out.println("price : " + chain6.price);
		System.out.println("length : " + chain6.length);
		System.out.println("weight : " + chain6.weight);

		Chain chain7 = new Chain("Byzantine", "Diamond", "Festive", false, false, 55.55F);
		System.out.println(System.lineSeparator());
		System.out.println("type : " + chain7.type);
		System.out.println("material : " + chain7.material);
		System.out.println("used for : " + chain7.usedFor);
		System.out.println("stolen : " + chain7.stolen);
		System.out.println("fresh : " + chain7.fresh);
		System.out.println("price : " + chain7.price);
		System.out.println("length : " + chain7.length);
		System.out.println("weight : " + chain7.weight);

		Chain chain8 = new Chain("Byzantine", "Diamond", "Festive", false, false, 55.55F, 45.00F);
		System.out.println(System.lineSeparator());
		System.out.println("type : " + chain8.type);
		System.out.println("material : " + chain8.material);
		System.out.println("used for : " + chain8.usedFor);
		System.out.println("stolen : " + chain8.stolen);
		System.out.println("fresh : " + chain8.fresh);
		System.out.println("price : " + chain8.price);
		System.out.println("length : " + chain8.length);
		System.out.println("weight : " + chain8.weight);

		Chain chain9 = new Chain("Byzantine", "Diamond", "Festive", false, false, 55.55F, 45.00F, 2.00F);
		System.out.println(System.lineSeparator());
		System.out.println("type : " + chain9.type);
		System.out.println("material : " + chain9.material);
		System.out.println("used for : " + chain9.usedFor);
		System.out.println("stolen : " + chain9.stolen);
		System.out.println("fresh : " + chain9.fresh);
		System.out.println("price : " + chain9.price);
		System.out.println("length : " + chain9.length);
		System.out.println("weight : " + chain9.weight);

	}

}
