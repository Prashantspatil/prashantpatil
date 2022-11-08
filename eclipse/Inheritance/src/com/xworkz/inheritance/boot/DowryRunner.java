package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.BrideDowry;
import com.xworkz.inheritance.things.Dowry;

public class DowryRunner {

	public static void main(String[] args) {
		
		Dowry dowry=new Dowry(1.00, "bride", 2);
		dowry.dowryOpen();
		System.out.println("dowry taken");
		
		System.out.println(System.lineSeparator());
		
		BrideDowry dowry2=new BrideDowry(2.00, "groom", 1);
		dowry2.dowryTake();
		System.out.println("dowry beda");

	}

}
