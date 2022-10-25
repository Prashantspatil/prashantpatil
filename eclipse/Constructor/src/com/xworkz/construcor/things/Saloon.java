package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Branch;

public class Saloon {
	
	public static String place;
	public Branch branch=Branch.RAJAJINAGAR;
	public int units;
	public int unitCost;
	public boolean memberShip;
	
	public Saloon(boolean memberShip) {
		super();
		this.memberShip = memberShip;
	}
	
	static {
		place="Bengaluru";
	}
	
	public void setPrice(int unitCost) {
		this.unitCost=unitCost;
	}
	
	public void displayBill() {
		int totalBill=this.units*this.unitCost;
		System.out.println("total bill : "+totalBill);
	}
	
	public void hairStyleNodu() {
		System.out.println("place : "+Saloon.place);
		System.out.println("branch : "+this.branch);
		System.out.println("no of units : "+this.units);
		System.out.println("each unit cost : "+this.unitCost);
		System.out.println("membership : "+this.memberShip);
	}

}
