package com.xworkz.allegro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private Assistant assistant;
	@Autowired
	private Companies companies;
	
	public Producer() {
		System.out.println("created producer");
	}
	
	public void checkAssistant() {
		System.out.println(this.assistant.hashCode() +"hashcode of ref assistant");
	}
	
	public void checkCompanies() {
		System.out.println(this.companies.hashCode() +"hashcode of ref Companies");
	}

}
