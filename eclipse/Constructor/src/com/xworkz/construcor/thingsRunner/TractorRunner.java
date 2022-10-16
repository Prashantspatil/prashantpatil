package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class TractorRunner {

	public static void main(String[] args) {
		Tractor tractor = new Tractor();
		System.out.println("name : " + tractor.name);
		System.out.println("brand : " + tractor.brand);
		System.out.println("price : " + tractor.price);
		System.out.println("color : " + tractor.color);
		System.out.println("hp : " + tractor.hp);
		System.out.println("model : " + tractor.model);

		System.out.println(System.lineSeparator());
		Tractor tractor2 = new Tractor("Swaraj");
		System.out.println("name : " + tractor2.name);
		System.out.println("brand : " + tractor2.brand);
		System.out.println("price : " + tractor2.price);
		System.out.println("color : " + tractor2.color);
		System.out.println("hp : " + tractor2.hp);
		System.out.println("model : " + tractor2.model);

		System.out.println(System.lineSeparator());
		Tractor tractor3 = new Tractor("Swaraj", "M&M");
		System.out.println("name : " + tractor3.name);
		System.out.println("brand : " + tractor3.brand);
		System.out.println("price : " + tractor3.price);
		System.out.println("color : " + tractor3.color);
		System.out.println("hp : " + tractor3.hp);
		System.out.println("model : " + tractor3.model);

		System.out.println(System.lineSeparator());
		Tractor tractor4 = new Tractor(5.67F);
		System.out.println("name : " + tractor4.name);
		System.out.println("brand : " + tractor4.brand);
		System.out.println("price : " + tractor4.price);
		System.out.println("color : " + tractor4.color);
		System.out.println("hp : " + tractor4.hp);
		System.out.println("model : " + tractor4.model);

		System.out.println(System.lineSeparator());
		Tractor tractor5 = new Tractor("Swaraj", "M&M", 5.67F, "Blue");
		System.out.println("name : " + tractor5.name);
		System.out.println("brand : " + tractor5.brand);
		System.out.println("price : " + tractor5.price);
		System.out.println("color : " + tractor5.color);
		System.out.println("hp : " + tractor5.hp);
		System.out.println("model : " + tractor5.model);

		System.out.println(System.lineSeparator());
		Tractor tractor6 = new Tractor("Swaraj", "M&M", 5.67F, "Blue", 40);
		System.out.println("name : " + tractor6.name);
		System.out.println("brand : " + tractor6.brand);
		System.out.println("price : " + tractor6.price);
		System.out.println("color : " + tractor6.color);
		System.out.println("hp : " + tractor6.hp);
		System.out.println("model : " + tractor6.model);

		System.out.println(System.lineSeparator());
		Tractor tractor7 = new Tractor("Swaraj", "M&M", 5.67F, "Blue", 40, 2022);
		System.out.println("name : " + tractor7.name);
		System.out.println("brand : " + tractor7.brand);
		System.out.println("price : " + tractor7.price);
		System.out.println("color : " + tractor7.color);
		System.out.println("hp : " + tractor7.hp);
		System.out.println("model : " + tractor7.model);

	}

}
