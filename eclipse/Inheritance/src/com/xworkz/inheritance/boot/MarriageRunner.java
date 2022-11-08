package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.DestinationMarriage;
import com.xworkz.inheritance.things.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {
		
		Marriage marriage=new Marriage("barak", "mitchell", "washington");
		marriage.printNames();
		System.out.println("marriage khattam tata bye bye");
		
		System.out.println(System.lineSeparator());
		
		DestinationMarriage destinationMarriage=new DestinationMarriage("David", "Victoria", "bengaluru");
		destinationMarriage.printDestination();
		System.out.println("destination reached");
		

	}

}
