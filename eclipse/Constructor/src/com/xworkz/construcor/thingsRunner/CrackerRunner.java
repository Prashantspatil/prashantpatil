package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		
		Cracker cracker=new Cracker(true, 100.00);
		cracker.price=25;
		cracker.governmentSymbol='G';
		cracker.displayAmount();
		cracker.light();

	}

}
