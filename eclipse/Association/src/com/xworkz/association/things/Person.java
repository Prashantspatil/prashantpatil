package com.xworkz.association.things;

public class Person {
	
	public String name;
	public Email[] email;
	public Job job;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void setEmail(Email[] email) {
		this.email=email;
	}
	
	public void setJob(Job job) {
		this.job=job;
	}
	
	public void displayPerson() {
		System.out.println("name : "+name);
		if(this.email!=null) {
			for (int i = 0; i < this.email.length; i++) {
				Email email2 = this.email[i];
				System.out.println(email2);
				if(email2!=null) {
					email2.displayEmail();
				}
				else {
					System.out.println("email2 is null");
				}
			}
		}
		else {
			System.out.println("email is null");
		}
		if(this.job!=null) {
			this.job.displayJob();
		}
	}

}
