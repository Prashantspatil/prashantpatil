package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.Codes;
import com.xworkz.construcor.constants.Numbers;
import com.xworkz.construcor.constants.Type;

public class TimeMachine {
	
	public String name;
	public Type variety=Type.PENDULUM;
	public Numbers number;
	public Codes symbol;
	public double weight;
	public long batteryLife;
	
	public TimeMachine(String name, Type variety, Numbers number, Codes symbol, double weight, long batteryLife) {
		super();
		this.name = name;
		this.variety = variety;
		this.number = number;
		this.symbol = symbol;
		this.weight = weight;
		this.batteryLife = batteryLife;
	}
	
	public void knowTime() {
		
		System.out.println("watch name : "+this.name);
		System.out.println("watch type : "+this.variety);
		System.out.println("working : "+this.variety.display);
		System.out.println("watch position : "+this.number);
		System.out.println("watch no : "+this.number.no);
		System.out.println("watch price : "+this.number.price);
		System.out.println("watch code : "+this.symbol);
		System.out.println("watch symbol : "+this.symbol.symbol);
		System.out.println("watch weight : "+this.weight);
		System.out.println("watch battery life : "+this.batteryLife);
		
	}

}
