package com.xworkz.ipl.exception;

public class PlatformIndexExceededException extends RuntimeException{
	
	public PlatformIndexExceededException() {
		System.out.println("calling PlatformIndexExceededException constructor");
	}
	
	public PlatformIndexExceededException(String msg) {
		super(msg);
	}

}
