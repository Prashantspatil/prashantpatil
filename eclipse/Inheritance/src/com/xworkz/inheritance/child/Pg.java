package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Home;

public class Pg extends Home{
	
	public boolean food;
	
	public Pg() {
		
	}

	public Pg(String area, double rent, int sharing, boolean food) {
		super(area, rent, sharing);
        this.food=food;
	}
	
	@Override
	public void share() {
		super.share();
		System.out.println(food);
	}
	
	public void wifi() {
		System.out.println("**********************");
	}

}
