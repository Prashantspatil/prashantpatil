package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Pg;
import com.xworkz.inheritance.things.Home;

public class HomeRunner {

	public static void main(String[] args) {
		
		Home home=new Home();
		home.share();
		home.wifi();
		System.out.println(System.lineSeparator());
		Pg pg=new Pg("rajaji", 5.00, 2, true);
		pg.share();
		pg.wifi();
		
	}

}
