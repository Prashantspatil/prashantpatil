package com.xworkz.access.things;

public class Yadgir {
	
	public String mla;
	public long pinCode;
	public double population;
	public int taluqs;
	public String mp;
	public String fame;
	public int zpMembers;
	private boolean railwayStation=false;
	private String dc="jagadeesh";
	private String mainCircle="shubhash";
	private double voting=1.00;
	
	public Yadgir(String mla, long pinCode, double population, int taluqs, String mp, String fame, int zpMembers) {
		super();
		this.mla = mla;
		this.pinCode = pinCode;
		this.population = population;
		this.taluqs = taluqs;
		this.mp = mp;
		this.fame = fame;
		this.zpMembers = zpMembers;
	}

	public boolean isRailwayStation() {
		return railwayStation;
	}

	public void setRailwayStation(boolean railwayStation) {
		this.railwayStation = railwayStation;
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public String getMainCircle() {
		return mainCircle;
	}

	public void setMainCircle(String mainCircle) {
		this.mainCircle = mainCircle;
	}

	public double getVoting() {
		return voting;
	}

	public void setVoting(double voting) {
		this.voting = voting;
	}

}
