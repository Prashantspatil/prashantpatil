package com.xworkz.inheritance.things;

public class Criminal {
	
	public String court;
	public double penalty;
	
	public Criminal() {
		
	}

	public Criminal(String court, double penalty) {
		super();
		this.court = court;
		this.penalty = penalty;
	}
	
	public void criminal() {
		System.out.println(court);
		System.out.println(penalty);
	}

}
