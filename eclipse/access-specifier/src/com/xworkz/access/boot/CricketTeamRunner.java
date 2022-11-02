package com.xworkz.access.boot;

import com.xworkz.access.things.Batsman;
import com.xworkz.access.things.CricketTeam;

public class CricketTeamRunner {

	public static void main(String[] args) {
		
		CricketTeam cricketTeam=new CricketTeam();
		Batsman batsman=new Batsman(39.60, 183, "csk", 12.00, true, "thala", "ranchi", "india");
		
		System.out.println(cricketTeam.team);
		System.out.println(cricketTeam.batsman);
		System.out.println(batsman.getBatStyle());
		System.out.println(batsman.getBorn());
		System.out.println(batsman.getName());
		
		cricketTeam.squad();

	}

}
