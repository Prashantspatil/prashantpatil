package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.RailwayStationDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;

public interface RailwayStationService {
	
	boolean validateAndSave(RailwayStationDto railwayDto) throws InvalidCredetialsException; 

}
