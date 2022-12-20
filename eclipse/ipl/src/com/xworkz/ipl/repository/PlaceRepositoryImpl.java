package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.PlaceDto;
import com.xworkz.ipl.exception.PlaceExceededException;


public class PlaceRepositoryImpl implements PlaceRepository {
	
	private PlaceDto[] places=new PlaceDto[5];
	private int pinIndex=0;

	@Override
	public boolean save(PlaceDto placeDto) {
		System.out.println("calling save method");
		if(this.pinIndex>=this.places.length) {
			System.err.println("throw exception");
			throw new PlaceExceededException("building storagefull");
		}
		System.out.println("saved to : "+placeDto +"at pinIndex : "+pinIndex);
		this.places[pinIndex]=placeDto;
		pinIndex++;
		return true;
	}

}
