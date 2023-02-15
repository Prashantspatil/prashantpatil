package com.xworkz.fi.Dto;

import lombok.Data;

@Data
public class InterviewDTO {
	
	private String name;
	private String company;
	private String role;
	
	public InterviewDTO() {
		System.out.println("created : "+this.getClass().getSimpleName());
	}

}
