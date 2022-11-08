package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.DJ;

public class GenreDJ extends DJ{
	
	public GenreDJ() {
		
	}

	public GenreDJ(String name, String place, double entry) {
		super(name, place, entry);
	}
	
    public void djOpen() {
    	System.out.println("on stage");
    	System.out.println(name);
    	System.out.println(place);
    	System.out.println(entry);
    }
}
