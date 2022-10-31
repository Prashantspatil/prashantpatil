package com.xworkz.association.things;

public class Job {
	
	public double salary;
	public String role;
	public int bond;
	public Industry industry;
	
	public Job(double salary, String role, int bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	
	public void setIndustry(Industry industry) {
		this.industry=industry;
	}
	
	public void displayJob() {
		System.out.println("salary : "+salary);
		System.out.println("job role : "+role);
		System.out.println("bond : "+bond);
		if(this.industry!=null) {
		this.industry.displayIndustry();
		}
	}

}
