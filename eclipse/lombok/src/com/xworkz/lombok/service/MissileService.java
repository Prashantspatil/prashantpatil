package com.xworkz.lombok.service;

import com.xworkz.lombok.dto.MissileDTO;

public interface MissileService {
	
	boolean validateAndSave(MissileDTO missileDTO);

}
