package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class BreadRunner {

	public static void main(String[] args) {

		Bread bread = new Bread(250.0F);
		System.out.println("name : " + bread.name);
		System.out.println("shape : " + bread.shape);
		System.out.println("company : " + bread.companyName);
		System.out.println("price : " + bread.price);
		System.out.println("quantity : " + bread.quantity);

		Bread bread1 = new Bread(30);
		System.out.println("name : " + bread1.name);
		System.out.println("shape : " + bread1.shape);
		System.out.println("company : " + bread1.companyName);
		System.out.println("price : " + bread1.price);
		System.out.println("quantity : " + bread1.quantity);

		Bread bread2 = new Bread("Classic");
		System.out.println("name : " + bread2.name);
		System.out.println("shape : " + bread2.shape);
		System.out.println("company : " + bread2.companyName);
		System.out.println("price : " + bread2.price);
		System.out.println("quantity : " + bread2.quantity);

		Bread bread3 = new Bread("Classic", 250.0F);
		System.out.println("name : " + bread3.name);
		System.out.println("shape : " + bread3.shape);
		System.out.println("company : " + bread3.companyName);
		System.out.println("price : " + bread3.price);
		System.out.println("quantity : " + bread3.quantity);

		Bread bread4 = new Bread("Classic", 30);
		System.out.println("name : " + bread4.name);
		System.out.println("shape : " + bread4.shape);
		System.out.println("company : " + bread4.companyName);
		System.out.println("price : " + bread4.price);
		System.out.println("quantity : " + bread.quantity);

		Bread bread5 = new Bread("Classic", "Square");
		System.out.println("name : " + bread5.name);
		System.out.println("shape : " + bread5.shape);
		System.out.println("company : " + bread5.companyName);
		System.out.println("price : " + bread5.price);
		System.out.println("quantity : " + bread5.quantity);

		Bread bread6 = new Bread("Classic", "Square", "Warrior");
		System.out.println("name : " + bread6.name);
		System.out.println("shape : " + bread6.shape);
		System.out.println("company : " + bread6.companyName);
		System.out.println("price : " + bread6.price);
		System.out.println("quantity : " + bread6.quantity);

		Bread bread7 = new Bread("Classic", "Square", "Warrior", 30, 250.0F);
		System.out.println("name : " + bread7.name);
		System.out.println("shape : " + bread7.shape);
		System.out.println("company : " + bread7.companyName);
		System.out.println("price : " + bread7.price);
		System.out.println("quantity : " + bread7.quantity);
		
	}

}
