package com.xworkz.association.things;

public class Email {
	
	public String id;
	public String passWord;
	public long mobileNo;
	public Industry industry;
	
	public Email(String id, String passWord, long mobileNo) {
		super();
		this.id = id;
		this.passWord = passWord;
		this.mobileNo = mobileNo;
	}
	
	public void setIndustry(Industry industry) {
		this.industry=industry;
	}
	
	public void displayEmail() {
		System.out.println("id : "+id);
		System.out.println("password : "+passWord);
		System.out.println("mobile no : "+mobileNo);
		if(this.industry!=null) {
		this.industry.displayIndustry();
		}
	}

}
