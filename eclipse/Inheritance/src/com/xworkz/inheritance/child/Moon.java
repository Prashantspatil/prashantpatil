package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Satellite;

public class Moon extends Satellite{
	
	public int revolution;
	
	public Moon() {
		
	}

	public Moon(int noOf, String station, int revolution) {
		super(noOf, station);
		this.revolution=revolution;
	}
	
	public void revolve() {
		super.revolve();
		System.out.println(revolution);
	}

}
