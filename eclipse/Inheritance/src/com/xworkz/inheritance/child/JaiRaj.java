package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Criminal;

public class JaiRaj extends Criminal{
	
	public int imprisonment;
	
	public JaiRaj() {
		
	}
	
	public JaiRaj(String court, double penalty, int imprisonment) {
		super(court, penalty);
		this.imprisonment=imprisonment;
	}
	
	public void criminal() {
		super.criminal();
		System.out.println(imprisonment);
	}

}
