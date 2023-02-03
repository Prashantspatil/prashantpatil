package com.xworkz.casino.dto;

import lombok.Data;

@Data
public class CasinoDTO {
	
	private String name;
	private String cruise;
	private double entryFee;
	private boolean freeFood;
	private boolean freeAlcohol;
	
	public CasinoDTO() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}

}
