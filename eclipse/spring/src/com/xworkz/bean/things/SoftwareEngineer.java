package com.xworkz.bean.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	
	@Autowired
	@Qualifier("engineer")
	private String name;
	@Autowired
	private double salary;
	@Autowired
	private String company;
	@Autowired
	private double experience;
	
public SoftwareEngineer() {
	// TODO Auto-generated constructor stub
}	
	
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", company=" + company + ", experience="
				+ experience + "]";
	}
	
}
