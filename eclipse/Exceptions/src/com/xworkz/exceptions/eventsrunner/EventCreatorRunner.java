package com.xworkz.exceptions.eventsrunner;

import java.rmi.activation.ActivationException;

import com.xworkz.exceptions.events.EventCreator;

public class EventCreatorRunner {

	public static void main(String[] args) {
		
		EventCreator creator=new EventCreator();
		try {
			System.out.println("before method 2");
			creator.method2();
			System.out.println("after method2");
		}catch(ActivationException e) {
			System.out.println("the exception is in main methid");
		}

	}

}
