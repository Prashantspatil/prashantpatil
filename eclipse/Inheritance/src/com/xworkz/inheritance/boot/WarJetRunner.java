package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Rafael;
import com.xworkz.inheritance.things.WarJet;

public class WarJetRunner {

	public static void main(String[] args) {
		
		WarJet jet=new WarJet();
		jet.war();
		jet.khargil();
		System.out.println(System.lineSeparator());
		Rafael rafael=new Rafael("russia", 47, 125.00, "hindustan");
		rafael.war();
		rafael.khargil();

	}

}
