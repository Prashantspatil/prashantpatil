package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.WeddingInvitation;
import com.xworkz.inheritance.things.Invitation;

public class InvitationRunner {

	public static void main(String[] args) {
		
		Invitation invitation=new Invitation(23.00, 10000, "white");
		invitation.printInvitation();
		System.out.println("printing stopped");
		
		System.out.println(System.lineSeparator());
		
		WeddingInvitation invitation2=new WeddingInvitation(26, 10001, "pink");
		invitation2.printWeddingInvitation();
		System.out.println("distribution over");

	}

}
