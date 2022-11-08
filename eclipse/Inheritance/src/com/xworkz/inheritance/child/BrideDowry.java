package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Dowry;

public class BrideDowry extends Dowry{
	
	public BrideDowry() {
		
	}

	public BrideDowry(double quantity, String side, int installment) {
		super(quantity, side, installment);
	}
	
	public void dowryTake() {
		System.out.println("dowry beku");
		System.out.println(quantity);
		System.out.println(side);
		System.out.println(installment);
	}

}
