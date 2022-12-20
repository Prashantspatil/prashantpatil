package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.TheatreDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;

public interface TheatreService {
	
	boolean validAndSave(TheatreDto dto) throws InvalidCredetialsException;

}
