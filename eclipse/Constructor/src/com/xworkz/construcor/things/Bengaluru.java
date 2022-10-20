package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.MetroLines;
import com.xworkz.construcor.constants.ParliamentMember;

public class Bengaluru {

	public String founder;
	public String state;
	public byte constituency;
	public ParliamentMember mp = ParliamentMember.CENTRAL;
	public MetroLines line = MetroLines.GREEN_LINE;
	public String[] railwayStation;
	public String[] pinCode;
	public String[] area;
	public String[] party;
	public String[] foodStreets;
	public String[] personality;

	public Bengaluru(String founder, String state, byte constituency, ParliamentMember mp, MetroLines line,
			String[] railwayStation, String[] pinCode, String[] area, String[] party, String[] foodStreets,
			String[] personality) {
		super();
		this.founder = founder;
		this.state = state;
		this.constituency = constituency;
		this.mp = mp;
		this.line = line;
		this.railwayStation = railwayStation;
		this.pinCode = pinCode;
		this.area = area;
		this.party = party;
		this.foodStreets = foodStreets;
		this.personality = personality;
	}

	public void showCase() {

		System.out.println("founder : " + this.founder);
		System.out.println("state : " + this.state);
		System.out.println("mla constituencies : " + this.constituency);
		System.out.println("mp : " + this.mp);
		System.out.println("metro line : " + this.line);
		System.out.println("stations : " + this.railwayStation);
		System.out.println("pincodes : " + this.pinCode);
		System.out.println("area name : " + this.area);
		System.out.println("party : " + this.party);
		System.out.println("street : " + this.foodStreets);
		System.out.println("name : " + this.personality);

		for (int i = 0; i < this.railwayStation.length; i++) {
			String string = this.railwayStation[i];
			System.out.println("station : " + string);
		}
		for (int i = 0; i < this.pinCode.length; i++) {
			String string = this.pinCode[i];
			System.out.println("pin code : " + string);
		}
		for (int i = 0; i < this.area.length; i++) {
			String string = this.area[i];
			System.out.println("area : " + string);
		}
		for (int i = 0; i < this.party.length; i++) {
			String string = this.party[i];
			System.out.println("party : " + string);
		}
		for (int i = 0; i < this.foodStreets.length; i++) {
			String string = this.foodStreets[i];
			System.out.println("street : " + string);
		}
		for (int i = 0; i < this.personality.length; i++) {
			String string = this.personality[i];
			System.out.println("name : " + string);
		}

	}

}
