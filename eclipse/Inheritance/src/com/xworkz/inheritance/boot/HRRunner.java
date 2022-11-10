package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Akshara;
import com.xworkz.inheritance.things.HR;

public class HRRunner {

	public static void main(String[] args) {
		
		HR hr=new HR();
		hr.hire();
		hr.offer();
		System.out.println(System.lineSeparator());
		Akshara akshara=new Akshara("placement agent", "tcs", 5, "bengaluru");
		akshara.hire();
		akshara.offer();

	}

}
