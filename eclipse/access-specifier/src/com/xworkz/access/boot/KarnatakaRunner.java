package com.xworkz.access.boot;

import com.xworkz.access.things.Karnataka;
import com.xworkz.access.things.Yadgir;

public class KarnatakaRunner {

	public static void main(String[] args) {
		
		Karnataka karnataka=new Karnataka();
		Yadgir yadgir=new Yadgir("venkatreddy", 585202, 1.50, 7, "amaresh", "girinadu", 25);

		System.out.println(karnataka.name);
		System.out.println(karnataka.yadgir);
		System.out.println(yadgir.getDc());
		System.out.println(yadgir.getMainCircle());
		System.out.println(yadgir.getVoting());
		System.out.println(yadgir.isRailwayStation());
		
		karnataka.view();
	}

}
