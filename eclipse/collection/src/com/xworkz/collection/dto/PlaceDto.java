package com.xworkz.collection.dto;

import java.io.Serializable;

public class PlaceDto implements Serializable{
	
	private String name;
	private String famous;
	private Double distance;
	
	public PlaceDto() {
		// TODO Auto-generated constructor stub
	}

	public PlaceDto(String name, String famous, Double distance) {
		super();
		this.name = name;
		this.famous = famous;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "PlaceDto [name=" + name + ", famous=" + famous + ", distance=" + distance + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PlaceDto) {
				PlaceDto placeDto=(PlaceDto) obj;
				if(placeDto.famous.equals(this.famous)) {
					System.out.println("famous is matching : "+placeDto);
					return true;
				}else {
					System.out.println("famous not matching : "+placeDto);
				}
			}
		}
		return false;
		
	}

}
