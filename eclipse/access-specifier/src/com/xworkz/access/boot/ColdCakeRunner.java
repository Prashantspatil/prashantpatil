package com.xworkz.access.boot;

import com.xworkz.access.things.Cake;
import com.xworkz.access.things.ColdCake;

public class ColdCakeRunner {

	public static void main(String[] args) {
		
		ColdCake coldCake=new ColdCake();
		Cake cake=new Cake(1.00, 45, "bengaluru", 2.00, true, "rajajinagar", "bendakaluru", "karnataka");
		
		System.out.println(coldCake.name);
		System.out.println(coldCake.cake);
		System.out.println(cake.getFlavour());
		System.out.println(cake.getFranchies());
		System.out.println(cake.getType());
		
		coldCake.cut();

	}

}
