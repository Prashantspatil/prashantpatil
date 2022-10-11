package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		Developer employee = new Developer();
		System.out.println(employee.name);
		employee.name = "Prashant";
		System.out.println("developer name : " + employee.name);
		
		Developer degree = new Developer();
		System.out.println(degree.education);
		degree.education = "BE";
		System.out.println("degree completed : " + degree.education);
		
		Developer acquaintance = new Developer();
		System.out.println(acquaintance.experience);
		acquaintance.experience = 3;
		System.out.println("experience in years : " + acquaintance.experience);
		
		Developer ctc = new Developer();
		System.out.println(ctc.salary);
		ctc.salary = 6.0;
		System.out.println("cost to company : " + ctc.salary);
		
		Developer firm = new Developer();
		System.out.println(firm.company);
		firm.company = "TCS";
		System.out.println("hired by : " + firm.company);

	}

}
