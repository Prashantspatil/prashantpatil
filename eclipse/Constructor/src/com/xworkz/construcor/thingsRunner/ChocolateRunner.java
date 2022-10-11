package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class ChocolateRunner {

	public static void main(String[] args) {

		Chocolate hesuru = new Chocolate();
		System.out.println(hesuru.name);

		Chocolate company = new Chocolate();
		System.out.println(company.brand);

		Chocolate duddu = new Chocolate();
		System.out.println(duddu.price);

		Chocolate taste = new Chocolate();
		System.out.println(taste.flavour);

		hesuru.name = "kachha mango";
		System.out.println("the chocolate name is : " + hesuru.name);

		company.brand = "parle";
		System.out.println("the brand is : " + company.brand);

		duddu.price = 1;
		System.out.println("the chocolate price is : " + duddu.price);

		taste.flavour = "NoFlavour";
		System.out.println("the chocolate flavour is : " + taste.flavour);

	}

}
