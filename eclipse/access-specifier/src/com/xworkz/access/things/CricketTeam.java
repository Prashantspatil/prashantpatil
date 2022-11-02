package com.xworkz.access.things;

public class CricketTeam {
	
	public String team="men cricket";
	public Batsman batsman=new Batsman(39.60, 183, "csk", 12.00, true, "thala", "ranchi", "india");
	
	public void squad() {
		System.out.println(this.team);
		if (this.batsman!=null) {
			System.out.println(this.batsman);
			System.out.println(batsman.country);
			System.out.println(batsman.followers);
			System.out.println(batsman.highest);
			System.out.println(batsman.income);
			System.out.println(batsman.ipl);
			System.out.println(batsman.knownAs);
			System.out.println(batsman.place);
			System.out.println(batsman.wicketKeeper);
			
			System.out.println(batsman.getBatStyle());
			batsman.setBatStyle("right hand");
			System.out.println("modified bat style " + batsman.getBatStyle());
			
			System.out.println(batsman.getBorn());
			batsman.setBorn("07/07/1983");
			System.out.println("modified born " + batsman.getBorn());
			
			System.out.println(batsman.getName());
			batsman.setName("dhoni");
			System.out.println("modified name " + batsman.getName());
		}
		else {
			System.out.println("batsman is null");
		}
	}

}
