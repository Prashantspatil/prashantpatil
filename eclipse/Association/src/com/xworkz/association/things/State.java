package com.xworkz.association.things;

public class State {
	
	public String name;
	public String cm;
	public String dance;
	public String capital;
	
	public State(String name, String cm, String dance, String capital) {
		super();
		this.name = name;
		this.cm = cm;
		this.dance = dance;
		this.capital = capital;
	}
	
	public void displayState() {
		System.out.println("state name : "+name);
		System.out.println("cm name : "+cm);
		System.out.println("state dance : "+dance);
		System.out.println("state capital : "+capital);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}
