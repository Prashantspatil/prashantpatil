package com.xworkz.access.boot;

import com.xworkz.access.things.Puma;
import com.xworkz.access.things.Shoe;

public class PumaRunner {

	public static void main(String[] args) {
		
		Puma puma=new Puma();
		Shoe shoe=new Shoe(1.11, 1299, "airmax", 12.00, true, "bengaluru", "kar", "ind");
		
		System.out.println(puma.continent);
		System.out.println(puma.shoe);
		System.out.println(shoe.getColor());
		System.out.println(shoe.getType());
		System.out.println(shoe.getName());
		
		puma.outLet();

	}

}
