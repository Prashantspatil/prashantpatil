package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.RailwayStationDto;
import com.xworkz.ipl.exception.PlatformIndexExceededException;

public class RailwayStationRepositoryaImpl implements RailwayStationRepository {
	
	private RailwayStationDto[] railwayStations=new RailwayStationDto[5];
	private int platformIndex=0;

	@Override
	public boolean save(RailwayStationDto railwayDto) {
		System.out.println("calling save method");
		if(this.platformIndex>=this.railwayStations.length) {
			System.err.println("throw exception");
			throw new PlatformIndexExceededException("storage full");
		}
		System.out.println("saved to : "+railwayDto +"at theatreIndex : "+platformIndex);
		this.railwayStations[platformIndex]=railwayDto;
		platformIndex++;
		return true;
	}

}
