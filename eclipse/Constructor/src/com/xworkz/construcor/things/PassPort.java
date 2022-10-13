package com.xworkz.construcor.things;

public class PassPort {

	public long number;
	public String name;
	public String expiryDate;
	public String country;
	public String issueDate;
	public int noOfLeaves;

	public PassPort(String name) {
		this.name = name;
	}

	public PassPort(long number) {
		this.number = number;
	}

	public PassPort(int noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}

	public PassPort(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public PassPort(long number,String expiryDate,String issueDate)
	{
		this.number=number;
		this.expiryDate=expiryDate;
		this.issueDate=issueDate;
	}

	public PassPort(long number, String country) {
		this.number = number;
		this.country = country;
	}

	public PassPort(String name, int noOfLeaves) {
		this.name = name;
		this.noOfLeaves = noOfLeaves;
	}

	public PassPort(long number, String name, String expiryDate, String country, String issueDate, int noOfLeaves) {
		this.number = number;
		this.name = name;
		this.expiryDate = expiryDate;
		this.country = country;
		this.issueDate = issueDate;
		this.noOfLeaves = noOfLeaves;
	}

}
