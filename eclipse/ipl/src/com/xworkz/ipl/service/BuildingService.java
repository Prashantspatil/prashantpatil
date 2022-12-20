package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.BuildingDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;

public interface BuildingService {
	
	boolean validateAndSave(BuildingDto buildingDto) throws InvalidCredetialsException;

}
