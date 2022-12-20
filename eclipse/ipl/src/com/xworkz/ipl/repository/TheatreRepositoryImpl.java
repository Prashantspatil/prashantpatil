package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.TheatreDto;
import com.xworkz.ipl.exception.TheatreListExceededException;

public class TheatreRepositoryImpl implements TheatreRepository {
	
	private TheatreDto[] theatres=new TheatreDto[5];
	private int theatreIndex=0;

	@Override
	public boolean save(TheatreDto dto) {
		System.out.println("calling save");
		if(this.theatreIndex>=theatres.length) {
			System.err.println("throw exception");
			throw new TheatreListExceededException();
		}
		System.out.println("saved to : "+dto +"at theatreIndex : "+theatreIndex);
		this.theatres[theatreIndex]=dto;
		theatreIndex++;
		return true;
	}

}
