package com.xworkz.ipl.exception;

public class TheatreListExceededException extends RuntimeException{
	
     public TheatreListExceededException() {
		System.out.println("calling TheatreListExceededException default constructor");
	}
     
     public TheatreListExceededException(String text) {
    	 super(text);
     }

}
