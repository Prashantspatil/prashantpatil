package com.xworkz.access.things;

public class Cabinet {
	
	private String government="central";
	private String party="bjp";
	private String leader="prime minister";
	public double votePercentile;
	public int seats;
	public String symbol;
	public double workers;
	public boolean national;
	public String founder;
	public String president;
	public String country;
	
	public Cabinet(double votePercentile, int seats, String symbol, double workers, boolean national, String founder,
			String president, String country) {
		super();
		this.votePercentile = votePercentile;
		this.seats = seats;
		this.symbol = symbol;
		this.workers = workers;
		this.national = national;
		this.founder = founder;
		this.president = president;
		this.country = country;
	}

	public String getGovernment() {
		return government;
	}

	public void setGovernment(String government) {
		this.government = government;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

}
