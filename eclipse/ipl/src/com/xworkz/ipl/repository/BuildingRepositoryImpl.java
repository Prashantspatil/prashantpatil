package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.BuildingDto;
import com.xworkz.ipl.exception.BuildingExceededException;
import com.xworkz.ipl.exception.PlatformIndexExceededException;

public class BuildingRepositoryImpl implements BuildingRepository {
	
	private BuildingDto[] buildings=new BuildingDto[5];
	private int plotIndex=0;

	@Override
	public boolean save(BuildingDto buildingDto) {
		System.out.println("calling save method");
		if(this.plotIndex>=this.buildings.length) {
			System.err.println("throw exception");
			throw new BuildingExceededException("building storagefull");
		}
		System.out.println("saved to : "+buildingDto +"at plotIndex : "+plotIndex);
		this.buildings[plotIndex]=buildingDto;
		plotIndex++;
		return true;
	}

}
