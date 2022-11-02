package com.xworkz.access.boot;

import com.xworkz.access.things.Cabinet;
import com.xworkz.access.things.Union;

public class UnionRunner {

	public static void main(String[] args) {
		
		Union union=new Union();
		Cabinet cabinet=new Cabinet(57.00, 303, "lotus", 105.00, true, "vajpayee", "nadda", "india");
		
		System.out.println(union.moto);
		System.out.println(union.cabinet);
		System.out.println(cabinet.getGovernment());
		System.out.println(cabinet.getLeader());
		System.out.println(cabinet.getParty());
		
		union.party();

	}

}
