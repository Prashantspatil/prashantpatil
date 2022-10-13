package com.xworkz.construcor.thingsRunner;

import com.xworkz.construcor.things.*;

public class PassPortRunner {

	public static void main(String[] args) {

		PassPort passPort = new PassPort(73490L);
		System.out.println("number : " + passPort.number);
		System.out.println("name : " + passPort.name);
		System.out.println("expiry : " + passPort.expiryDate);
		System.out.println("country : " + passPort.country);
		System.out.println("issued : " + passPort.issueDate);
		System.out.println("leaves : " + passPort.noOfLeaves);

		PassPort passPort1 = new PassPort(150);
		System.out.println("number : " + passPort1.number);
		System.out.println("name : " + passPort1.name);
		System.out.println("expiry : " + passPort1.expiryDate);
		System.out.println("country : " + passPort1.country);
		System.out.println("issued : " + passPort1.issueDate);
		System.out.println("leaves : " + passPort.noOfLeaves);

		PassPort passPort2 = new PassPort("Chethan");
		System.out.println("number : " + passPort2.number);
		System.out.println("name : " + passPort2.name);
		System.out.println("expiry : " + passPort2.expiryDate);
		System.out.println("country : " + passPort2.country);
		System.out.println("issued : " + passPort2.issueDate);
		System.out.println("leaves : " + passPort2.noOfLeaves);

		PassPort passPort3 = new PassPort("Chethan", 150);
		System.out.println("number : " + passPort3.number);
		System.out.println("name : " + passPort3.name);
		System.out.println("expiry : " + passPort3.expiryDate);
		System.out.println("country : " + passPort3.country);
		System.out.println("issued : " + passPort3.issueDate);
		System.out.println("leaves : " + passPort3.noOfLeaves);

		PassPort passPort4 = new PassPort(73490L, "India");
		System.out.println("number : " + passPort4.number);
		System.out.println("name : " + passPort4.name);
		System.out.println("expiry : " + passPort4.expiryDate);
		System.out.println("country : " + passPort4.country);
		System.out.println("issued : " + passPort4.issueDate);
		System.out.println("leaves : " + passPort4.noOfLeaves);

		PassPort passPort5 = new PassPort("Chethan", "India");
		System.out.println("number : " + passPort5.number);
		System.out.println("name : " + passPort5.name);
		System.out.println("expiry : " + passPort5.expiryDate);
		System.out.println("country : " + passPort5.country);
		System.out.println("issued : " + passPort5.issueDate);
		System.out.println("leaves : " + passPort5.noOfLeaves);

		PassPort passPort6 = new PassPort(73490L, "12/22", "12/32");
		System.out.println("number : " + passPort6.number);
		System.out.println("name : " + passPort6.name);
		System.out.println("expiry : " + passPort6.expiryDate);
		System.out.println("country : " + passPort6.country);
		System.out.println("issued : " + passPort6.issueDate);
		System.out.println("leaves : " + passPort6.noOfLeaves);

		PassPort passPort7 = new PassPort(73490L, "Chethan", "12/22", "India", "12/32", 150);
		System.out.println("number : " + passPort7.number);
		System.out.println("name : " + passPort7.name);
		System.out.println("expiry : " + passPort7.expiryDate);
		System.out.println("country : " + passPort7.country);
		System.out.println("issued : " + passPort7.issueDate);
		System.out.println("leaves : " + passPort7.noOfLeaves);

	}

}
