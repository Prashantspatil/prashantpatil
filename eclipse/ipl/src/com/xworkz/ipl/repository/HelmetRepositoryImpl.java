package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.HelmetDto;
import com.xworkz.ipl.dto.PizzaDto;
import com.xworkz.ipl.exception.HelmetSizeExceededException;

public class HelmetRepositoryImpl implements HelmetRepository{
	
	private HelmetDto[] helmets=new HelmetDto[5];
	private int currentIndex=0;

	@Override
	public boolean save(HelmetDto helmetDto) {
		System.out.println("calling save method from HelmetRepositoryImpl");
		if(this.currentIndex>=helmets.length) {
			throw new HelmetSizeExceededException();
		}
		System.out.println("saved to" + helmetDto + "at index " + currentIndex);
		this.helmets[currentIndex]=helmetDto;
		currentIndex++;
		return true;
	}

}
