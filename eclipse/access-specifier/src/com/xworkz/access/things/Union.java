package com.xworkz.access.things;

public class Union {
	
	public String moto="sabka sath sabka vikas";
	public Cabinet cabinet=new Cabinet(57.00, 303, "lotus", 105.00, true, "vajpayee", "nadda", "india");
	
	public void party() {
		System.out.println(this.moto);
		if (this.cabinet!=null) {
			System.out.println(this.cabinet);
			System.out.println(cabinet.country);
			System.out.println(cabinet.founder);
			System.out.println(cabinet.national);
			System.out.println(cabinet.president);
			System.out.println(cabinet.seats);
			System.out.println(cabinet.symbol);
			System.out.println(cabinet.votePercentile);
			System.out.println(cabinet.workers);
			
			System.out.println(cabinet.getGovernment());
			cabinet.setGovernment("union");
			System.out.println("modified government " + cabinet.getGovernment());
			
			System.out.println(cabinet.getLeader());
			cabinet.setLeader("atal&advani");
			System.out.println("modified leader " + cabinet.getLeader());
			
			System.out.println(cabinet.getParty());
			cabinet.setParty("bjp");
			System.out.println("modified party " + cabinet.getParty());
		}
		else {
			System.out.println("cabinet is null");
		}
	}

}
