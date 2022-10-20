package com.xworkz.construcor.constants;

public enum FullName {
	
	STUDENT1("prashant","patil"),STUDENT2("jagadeesh","allagi"),STUDENT3("rudra","hiremath");
	
	public String firstName;
	public String lastName;
	
	private FullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
