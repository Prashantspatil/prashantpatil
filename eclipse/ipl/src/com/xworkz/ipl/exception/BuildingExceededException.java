package com.xworkz.ipl.exception;

public class BuildingExceededException extends RuntimeException{
	
	public BuildingExceededException() {
		System.out.println("calling BuildingExceededException default constructor");
	}

	public BuildingExceededException(String message) {
		super(message);		
	}

}
