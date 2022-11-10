package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Terrorist;

public class Kasab extends Terrorist{
	
	public String moto;

	public Kasab() {
		super();
	}

	public Kasab(String origin, String jail, int imprisonment, String moto) {
		super(origin, jail, imprisonment);
		this.moto=moto;
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println(moto);
		System.out.println("kasab attacks with moto");
	}
		
		public void bomb() {
			System.out.println("kasab dropped bomb");
		}

}
