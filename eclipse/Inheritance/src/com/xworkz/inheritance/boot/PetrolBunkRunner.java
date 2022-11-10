package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Venkateshwar;
import com.xworkz.inheritance.things.PetrolBunk;

public class PetrolBunkRunner {

	public static void main(String[] args) {
		
		PetrolBunk bunk=new PetrolBunk();
		bunk.petrol();
		bunk.diesel();
		System.out.println(System.lineSeparator());
		Venkateshwar venkateshwar=new Venkateshwar("rajaji", 1.00, "hp", true);
		venkateshwar.petrol();
		venkateshwar.diesel();

	}

}
