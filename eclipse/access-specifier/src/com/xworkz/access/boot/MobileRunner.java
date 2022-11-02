package com.xworkz.access.boot;

import com.xworkz.access.things.Android;
import com.xworkz.access.things.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		Android android=new Android(1.00, 150, "five G", 111.00, true, "1200", "17s", "20d");
		
		System.out.println(mobile.name);
		System.out.println(mobile.android);
		System.out.println(android.getGadget());
		System.out.println(android.getType());
		System.out.println(android.getVersion());
		
		mobile.unBox();

	}

}
