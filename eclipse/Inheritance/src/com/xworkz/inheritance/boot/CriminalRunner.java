package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.JaiRaj;
import com.xworkz.inheritance.things.Criminal;

public class CriminalRunner {

	public static void main(String[] args) {
		
		Criminal criminal=new JaiRaj("high court", 25.00, 7);
		criminal.criminal();
		System.out.println(System.lineSeparator());
		JaiRaj jaiRaj=new JaiRaj("supreme", 100.00, 9);
		jaiRaj.criminal();

	}

}
