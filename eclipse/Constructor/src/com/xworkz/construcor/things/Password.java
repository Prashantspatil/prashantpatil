package com.xworkz.construcor.things;

import com.xworkz.construcor.constants.FullName;
import com.xworkz.construcor.constants.Numerals;

public class Password {
	
	public int rollNo=36;
	public long mobileNo;
	public Numerals num=Numerals.FOUR;
	public FullName student=FullName.STUDENT1;
	
	public Password(long mobileNo, Numerals num, FullName student) {
		super();
		this.mobileNo = mobileNo;
		this.num = num;
		this.student = student;
	}
	
	public void display() {
		
		System.out.println("roll no : "+this.rollNo);
		System.out.println("mobile no : "+this.mobileNo);
		System.out.println("numeral char : "+this.num.num);
		System.out.println("first name : "+this.student.firstName);
		System.out.println("last name : "+this.student.lastName);
		
	}
	
}
