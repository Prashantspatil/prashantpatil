package com.xworkz.casino.dto;

import lombok.Data;

@Data
public class BeachDTO {
	
	private String name;
	private String location;
	private boolean clean;
	private boolean games;
	
	public BeachDTO() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}

}
