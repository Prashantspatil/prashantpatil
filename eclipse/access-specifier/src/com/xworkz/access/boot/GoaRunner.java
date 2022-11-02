package com.xworkz.access.boot;

import com.xworkz.access.things.Beach;
import com.xworkz.access.things.Goa;

public class GoaRunner {

	public static void main(String[] args) {
		
		Goa goa=new Goa(); 
		Beach beach=new Beach(10.00, 7, "pollavarim", 5.00, true, "panaji", "goa", "india");
		
		System.out.println(goa.continent);
		System.out.println(goa.beach);
		System.out.println(beach.getTerritory());
		System.out.println(beach.getType());
		System.out.println(beach.getName());
		
		goa.view();

	}

}
