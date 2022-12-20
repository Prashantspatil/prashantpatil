package com.xworkz.ipl.service;

import com.xworkz.ipl.dto.BakeryDto;
import com.xworkz.ipl.exception.InvalidCredetialsException;

public interface BakeryService {
	
	boolean validateAndSave(BakeryDto bakeryDto) throws InvalidCredetialsException;

}
