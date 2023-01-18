package com.xworkz.lombok.service;

import com.xworkz.lombok.dto.SoldierDTO;

public interface SoldierService {
	
	boolean validateAndSave(SoldierDTO soldierDTO);

}
