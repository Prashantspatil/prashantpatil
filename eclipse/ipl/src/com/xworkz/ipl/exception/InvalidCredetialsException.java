package com.xworkz.ipl.exception;

public class InvalidCredetialsException extends Exception{
	
	public InvalidCredetialsException() {
		System.out.println("calling InvalidCredetialsException default constructor");
	}
	
	public InvalidCredetialsException(String msg) {
		super(msg);
		System.err.println("invalid entry found");
	}

}
