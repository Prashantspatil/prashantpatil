package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.PlaceDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;

public interface PlaceService {
	
	boolean validateAndSave(PlaceDto placeDto) throws InvalidCredetialsException;

}
