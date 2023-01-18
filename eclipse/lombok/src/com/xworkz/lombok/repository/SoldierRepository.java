package com.xworkz.lombok.repository;

import com.xworkz.lombok.dto.SoldierDTO;

public interface SoldierRepository {
	
	boolean save(SoldierDTO soldierDTO);

}
