package com.xworkz.construcor.constants;

public enum Type {
	
	PENDULUM("tofro"),STAND("alarm"),SMART("ticking"),SAND("flow");
	
	public String display;

	private Type(String display) {
		this.display = display;
	}
	
}
