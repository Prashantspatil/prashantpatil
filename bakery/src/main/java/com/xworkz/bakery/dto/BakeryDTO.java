package com.xworkz.bakery.dto;

import lombok.Data;

@Data
public class BakeryDTO {
	
	private String name;
	private String owner;
	private String wife;
	private boolean married;
	private String famousFor;
	private Integer since;
	
	public BakeryDTO() {
		System.out.println("created :" + this.getClass().getSimpleName());
	}

}
